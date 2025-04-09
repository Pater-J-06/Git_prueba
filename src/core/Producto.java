/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.Date;

/**
 *
 * @author joelp
 */
public abstract class Producto {
    
    protected int id;
    protected String nombre;
    protected Date fechaInicio;
    protected Date fechaFin;
    protected Boolean estadoActivo;
    protected float valor;
}
