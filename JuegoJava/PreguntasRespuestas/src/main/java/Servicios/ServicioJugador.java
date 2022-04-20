/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Modelos.*;
import java.util.*;

/**
 *
 * @author USER
 */
public class ServicioJugador {
    
    public  List<Jugador> jugadores;

    public ServicioJugador(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setJugador(Jugador jugadores) {
        
        boolean agregar = true;
        
        for(var j: this.jugadores){
            
            if(j.nombre == jugadores.nombre ){
                agregar = false;
                break;
            }           
        }   
        
        if(agregar) {
            this.jugadores.add(jugadores);
        }     
        
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
      
    
}
