/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author USER
 */
public class OpcionesRespuesta {
    
    private int id;
    
    private int idPregunta;
    
    private String descripcion;
    
    private boolean respuestaCorrecta;
    
    

    public OpcionesRespuesta(int id, String descripcion, int idPregunta,  boolean respuestaCorrecta) {
        this.id = id;
        this.idPregunta = idPregunta;
        this.descripcion = descripcion;
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRespuestaCorrecta(boolean respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    
    
    
    
}
