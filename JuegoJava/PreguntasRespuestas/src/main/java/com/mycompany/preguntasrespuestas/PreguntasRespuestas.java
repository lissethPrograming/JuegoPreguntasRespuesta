/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.preguntasrespuestas;

import DatosSemilla.DatosSemilla;
import Modelos.*;
import Modelos.Partidas.Estado;
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
      var datosSemilla = new DatosSemilla ();
         
      System.out.println("¿Deseas jugar ahora?  (S/N)");
      
      var respuesta= Scan.next();
      var l = respuesta.toUpperCase();
      
      
      while( "S".equals(l)){
         
           var jugador = new Jugador();
           System.out.println("Ingrese nombre jugador:");
           jugador.nombre = Scan.next();
       
            servicioJugador.setJugador(jugador);

            var rondasTotales = datosSemilla.niveles.size();

            System.out.println("Bienvenido al juego TRIVIA " + jugador.nombre +  "\n Este juego tiene "+ rondasTotales + " niveles, cada nivel consta de 1 pregunta con 4 opciones de respuesta, " +
                    " \n en cada ronda de preguntas tienes la opcion de responder o retirarte, si respondes y  \n aciertas continuas al siguiente nivel, si te equivocas pierdes" + 
                    " y no sumas puntos, \n o puedes retirarte y conservar los puntos obtenidos. ");


             var otraPartida = "N";
             do{
                       var partidaActual = new Partidas(datosSemilla.partidas.size()+1, Estado.perdedor, 0, jugador.nombre);  
                       var nivelFinal = datosSemilla.niveles.get(datosSemilla.niveles.size()-1);

                      for (var nivelActual: datosSemilla.niveles)
                      {

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

                           boolean esValido = false;
                           String opcionElegida="";
                            do{
                                System.out.println("Escribe el numero que corresponda a tu respuesta o puedes retirarte escribiendo 'R' en cualquiera de los casos, presiona enter despues" );
                               opcionElegida= Scan.next();
                               boolean esNumerico =  opcionElegida.matches("[+-]?\\d*(\\.\\d+)?");

                               if(esNumerico){
                                   var opcionNumerica = Integer.parseInt(opcionElegida);
                                   if(opcionNumerica >=1 && opcionNumerica <= indiceOpcion)
                                   {
                                        esValido = true;
                                   }
                                   else 
                                   {
                                        System.out.println("Selección no corresponde a las opciones" );
                                   }
                               }
                               else
                               {
                                   var elegida = opcionElegida.toUpperCase();
                                   if("R".equals(elegida))
                                   {
                                       esValido = true;
                                   }
                                   else 
                                   {
                                       System.out.println("Selección no corresponde a las opciones" );
                                   }
                               }
                            }while(!esValido);


                            boolean esNumerico =  opcionElegida.matches("[+-]?\\d*(\\.\\d+)?");

                            var rondaActual = new Ronda(
                                       datosSemilla.ronda.size()+1,
                                       nivelActual.getId(),
                                       preguntaRonda.getId(),
                                       0,
                                       0,
                                       false); 

                            if(esNumerico)
                            {
                               var opcionNumerica = Integer.parseInt(opcionElegida);
                               var opcionRespuesta = respuestasRonda.get(opcionNumerica-1);
                               rondaActual.setRespondioCorrecto(opcionRespuesta.isRespuestaCorrecta());
                               rondaActual.setRespuestaId(opcionRespuesta.getId());

                               if (opcionRespuesta.isRespuestaCorrecta())
                               {
                                  var puntaje = nivelActual.getPuntos() + partidaActual.getPuntaje();
                                  partidaActual.setPuntaje(puntaje);
                                  rondaActual.setPuntos(nivelActual.getPuntos());

                                  datosSemilla.ronda.add(rondaActual);
                                   System.out.println(" Muy bien, tu puntaje actual es: " + puntaje);
                               }
                               else
                               {
                                    partidaActual.setPuntaje(0);
                                    datosSemilla.ronda.add(rondaActual);
                                    System.out.println(" Perdiste, tu puntaje es 0 ");
                                    break;
                               }
                           } 
                            else {
                                System.out.println(" Decidiste retirarte. Gracias por jugar, alcanzaste " + partidaActual.getPuntaje()+ " puntos.");
                                 partidaActual.setEstado(Estado.retirado);
                                break;

                            }

                           if(nivelActual.getId() == nivelFinal.getId() && rondaActual.RespondioCorrecto)
                           {
                             partidaActual.setEstado(Estado.ganador);
                             System.out.println("¡¡ FELICITACIONES!!  ¡¡ GANASTE!! ");
                           } 
                      }
                      
                      datosSemilla.partidas.add(partidaActual);
                      
                  System.out.println("¿Deseas jugar otra partida?  (S/N)");
                  otraPartida= Scan.next();
                  l = otraPartida.toUpperCase();    
             }while("S".equals(l));

             System.out.println("¿Deseas cambiar de jugador?  (S/N)");
             respuesta= Scan.next();
             l = respuesta.toUpperCase();
      }
      
      
             System.out.println("Ingresa tu nombre de jugador para ver tu score");
             var nombreJugador= Scan.next();
             var jugadorScore = listaJugadores.stream().filter(elemento -> elemento.getNombre().equals(nombreJugador.trim()) ).findFirst().get();
             
             if(jugadorScore != null)
             {
                var partidasJugador = datosSemilla.partidas.stream().filter(elemento -> elemento.getNombre() ==  jugadorScore.getNombre()).toList();
                
                int partidaIndice = 1;
                for(var partida:partidasJugador)
                {
                    System.out.println(partidaIndice +"- Puntaje: " +partida.getPuntaje()+" estado: "+ partida.getEstado().toString());
                }
             }
      
      
      System.out.println("Gracias por Jugar");
      
      
      
    }

}
