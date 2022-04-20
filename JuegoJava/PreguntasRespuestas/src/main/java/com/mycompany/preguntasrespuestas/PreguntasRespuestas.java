/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.preguntasrespuestas;

import DatosSemilla.DatosSemilla;
import Modelos.*;
import Servicios.*;
import java.util.*;
import java.util.Random;


/**
 *
 * @author USER
 */
public class PreguntasRespuestas {

    public static void main(String[] args) {
        
        List<Jugador> listaJugadores = new ArrayList<Jugador>();
        var servicioJugador = new ServicioJugador(listaJugadores);
         Scanner Scan = new Scanner(System.in);
         Random rnd = new Random();
         
        var jugador = new Jugador();
        System.out.println("ingrese nombre jugador!");
        jugador.nombre = Scan.next();
       
        servicioJugador.setJugador(jugador);
        
      var datosSemilla = new DatosSemilla ();
      
      var rondasTotales = datosSemilla.niveles.size();
      
      System.out.println("Bienvenido al juego TRIVIA " + jugador.nombre +  "\n Este juego tiene "+ rondasTotales + " niveles cada nivel consta de 1 pregunta con 4 opciones de respuesta, " +
              " \n en cada ronda de preguntas tienes la opcion de responder o retirarte, si respondes y  \n aciertas, continuas al siguiente nivel, si te equivocas, pierdes" + 
              " y no sumas puntos, o puedes retirarte y conservar los puntos obtenidos. ");
      
      System.out.println("¿Deseas jugar ahora?  (S/N)");
      
      var respuesta= Scan.next();
      int nivelActualIndice = 0;
      var l = respuesta.toUpperCase();
      while( "S".equals(l)){
       var nivelActual = datosSemilla.niveles.get(nivelActualIndice);
       
       var categoriasNivel = datosSemilla.categorias.stream().filter(elemento->elemento.getNivelId()== nivelActual.getId()).toList();
       var categoriaIndiceRandom = (int)(rnd.nextDouble() * categoriasNivel.size() + 0);
      
       var categoriaActual =  categoriasNivel.get(categoriaIndiceRandom);
       var preguntasCategoria = datosSemilla.preguntas.stream().filter(elemento->elemento.getIdCategoria()== categoriaActual.getId()).toList();
       
       var preguntasIndiceRandom = (int)(rnd.nextDouble() * preguntasCategoria.size() + 0);  
       var preguntaRonda = preguntasCategoria.get(preguntasIndiceRandom);
       
       System.out.println(preguntaRonda.getDescripcion());
       var respuestasRonda = datosSemilla.opcionesRespuestas.stream().filter(elemento->elemento.getIdPregunta()== preguntaRonda.getId()).toList();
       
       int indiceOpcion = 1;
       for( var opciones: respuestasRonda)
       {
            System.out.println(indiceOpcion + ". " +opciones.getDescripcion());
            indiceOpcion++;
       }
       
        System.out.println("Escribe el numero que corresponda a tu respuesta o puedes retirarte escribiendo 'R' en cualquiera de los casos, presiona enter despues" );
        var opcionElegida= Scan.next();
        boolean esNumerico =  opcionElegida.matches("[+-]?\\d*(\\.\\d+)?");
        System.out.println(esNumerico);
        
       System.out.println("¿Deseas jugar ahora?  (S/N)");
       respuesta= Scan.next();
       l = respuesta.toUpperCase();
      }
      
      
      
      System.out.println("Gracias por Jugar");
      
      
      
    }
}
