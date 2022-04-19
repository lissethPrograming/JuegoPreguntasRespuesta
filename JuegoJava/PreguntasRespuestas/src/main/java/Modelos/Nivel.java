/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.List;

/**
 *
 * @author USER
 */
public class Nivel {
    
    private int id;
    
    private int descripcion;
    
    private double puntos;
    
    private List<Categorias> categorias;
    
    

    public Nivel(int id, int descripcion, double puntos) {
        this.id = id;
        this.descripcion = descripcion;
        this.puntos = puntos;
        
    }
    
    

    public int getId() {
        return id;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public double getPuntos() {
        return puntos;
    }

    public List<Categorias> getCategorias() {
        return categorias;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public void setCategorias(List<Categorias> categorias) {
        this.categorias = categorias;
    }
    
    
    
    
    
    
    
}
