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
public class Jugador {
    
    public String nombre;
    
    private List<Partidas> partidas;
    

    public Jugador(String nombre, List<Partidas> partidas) {
        this.nombre = nombre;
        this.partidas = partidas;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public List<Partidas> getPartidas() {
        return partidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPartidas(List<Partidas> partidas) {
        this.partidas = partidas;
    }
    
        
    
    
}
