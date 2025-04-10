/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author joelp
 */
public class Plan extends Producto{
    
    private float valorMaximoCurso;
    private ArrayList<PlanCliente> planes;

    public Plan(int id, String nombre, Object fechaInicio, Object fechaFin, Boolean estadoActivo, float valor, float valorMaximoCurso) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = new ArrayList<>();
    }
    
    
    
}
