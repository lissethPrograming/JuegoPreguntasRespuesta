/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author USER
 */
public class Ronda {
    
    private int id;
    
    private double nivelId;
    
    public int preguntaId;
    
    public int respuestaId;
    
    public double puntos;
    
    public boolean RespondioCorrecto;
    

    public Ronda(int id, double nivelId, int preguntaId, int respuestaId, double puntos, boolean RespondioCorrecto) {
        this.id = id;
        this.nivelId = nivelId;
        this.preguntaId = preguntaId;
        this.respuestaId = respuestaId;
        this.puntos = puntos;
        this.RespondioCorrecto = RespondioCorrecto;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public double getNivelId() {
        return nivelId;
    }

    public int getPreguntaId() {
        return preguntaId;
    }

    public int getRespuestaId() {
        return respuestaId;
    }

    public double getPuntos() {
        return puntos;
    }

    public boolean isRespondioCorrecto() {
        return RespondioCorrecto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNivelId(double nivelId) {
        this.nivelId = nivelId;
    }

    public void setPreguntaId(int preguntaId) {
        this.preguntaId = preguntaId;
    }

    public void setRespuestaId(int respuestaId) {
        this.respuestaId = respuestaId;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public void setRespondioCorrecto(boolean RespondioCorrecto) {
        this.RespondioCorrecto = RespondioCorrecto;
    }
    
    
    
    
}
