/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.util.*;
/**
 *
 * @author USER
 */
public class Categorias {
    
    private int id;
    
    private String descripcion;
    
    private int nivelId;
    
    private List<Pregunta> preguntas; 
    

    public Categorias(int id, String descripcion, int nivelId) {
        this.id = id;
        this.descripcion = descripcion;
        this.nivelId = nivelId;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNivelId() {
        return nivelId;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNivelId(int nivelId) {
        this.nivelId = nivelId;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
    
    
}
