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
public class Partidas {
    
    private int id;
    
    private Estado estado;
    
    private double puntaje;
    
    private List<Ronda> ronda;
    
    public String nombre;
    
    

    public Partidas(int id, Estado estado, double puntaje, List<Ronda> ronda, String nombre) {
        this.id = id;
        this.estado = estado;
        this.puntaje = puntaje;
        this.ronda = ronda;
        this.nombre = nombre;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public Estado getEstado() {
        return estado;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public List<Ronda> getRonda() {
        return ronda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public void setRonda(List<Ronda> ronda) {
        this.ronda = ronda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public enum Estado {
        ganador,
        perdedor,
        retirado
    }
    
}
