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
public class Pregunta {
    
    
    private int id;
    
    private int idCategoria;
    
    private String descripcion;
    
    private List<OpcionesRespuesta> respuestas;
    

    public Pregunta(int id,  String descripcion, int idCategoria) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        
    }
    
    

    public int getId() {
        return id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<OpcionesRespuesta> getRespuestas() {
        return respuestas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRespuestas(List<OpcionesRespuesta> respuestas) {
        this.respuestas = respuestas;
    }
    
    
    
    
    
}
