/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;

/**
 *
 * @author joelp
 */
public abstract class Producto {
    
    protected int id;
    protected String nombre;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected Boolean estadoActivo;
    protected float valor;

    public Producto(int id, String nombre, Date fechaInicio, Date fechaFin, Boolean estadoActivo, float valor) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoActivo = estadoActivo;
        this.valor = valor;
    }
    
    
}
