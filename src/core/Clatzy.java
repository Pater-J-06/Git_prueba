/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author joelp
 */
public class Clatzy {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public Clatzy() {
        this.clientes = new ArrayList<>();
        this.instructores =  new ArrayList<>();
        this.cursos =  new ArrayList<>();
        this.planes =  new ArrayList<>();
    }
    
    public boolean addInstructor(String nombre, String cedula, String telefono, String email){
        Instructor instructor = new Instructor(nombre,cedula,telefono,email);
        if(!this.instructores.contains(instructor)){
            this.instructores.add(instructor);
            return true;
        }
        return false;
    }    
    public boolean addCurso(int id, String nombre, LocalDate date, float valor, Instructor instructor){
        Curso curso = new Curso(id,nombre,date,null, true, valor,instructor);
        if(!this.cursos.contains(curso)){
            this.cursos.add(curso);
            return true;
        }
        return false;
    }
    public boolean addPlan(String nombre, LocalDate date, float valor, float valorMaximoCurso){
        Plan plan = new Plan(0,nombre,date,null, true, valor,valorMaximoCurso);
        if(!this.planes.contains(plan)){
            this.planes.add(plan);
            return true;
        }
        return false;
    }
    public Instructor getInstructor(int index){
        return this.instructores.get(index);
    }   
}
