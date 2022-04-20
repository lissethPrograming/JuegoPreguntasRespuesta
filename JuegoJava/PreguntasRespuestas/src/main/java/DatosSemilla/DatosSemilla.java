/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatosSemilla;

import java.util.List;
import Modelos.*;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class DatosSemilla {
    
    public List<Categorias> categorias;
    public List<Nivel> niveles;
    public List<OpcionesRespuesta> opcionesRespuestas;
    public List<Pregunta> preguntas;

    public DatosSemilla() {
        categorias= this.AddCategoria();
        niveles= this.AddNivel();
        opcionesRespuestas= this.AddOpcionesRespuesta();
        preguntas= this.AddPregunta();
              
    }
    
    

     public List<Categorias> AddCategoria()
        {
            var categorias = Arrays.asList(
                        new Categorias(1,"Deportes",1 ),
                        new Categorias (2,"Matematicas",2 ),
                        new Categorias (3,"Cultura",3 ),
                        new Categorias (4,"Anime", 4 ),
                        new Categorias (5, "Ciencia",5 )
                        );
            return categorias;
        }

        public List<Nivel> AddNivel()
        {
            var nivel = Arrays.asList(
                new Nivel (1,1, 100 ),
                new Nivel (2, 2, 200 ),
                new Nivel (3, 3,300 ),
                new Nivel ( 4, 4, 400),
                new Nivel (5,5, 500 )
                );
            return nivel;
        }

        public List <OpcionesRespuesta> AddOpcionesRespuesta ()
        {
           var opcionesRespuesta = Arrays.asList(
                new OpcionesRespuesta (1, "90 minutos", 1, true ),
                new OpcionesRespuesta (2, "120 minutos", 1, false ),
                new OpcionesRespuesta (3, "30 minutos", 1, false),
                new OpcionesRespuesta (4, "45 minutos", 1, false),
                new OpcionesRespuesta (5, "Brasil", 2, true),
                new OpcionesRespuesta (6, "Uruguay", 2, false),
                new OpcionesRespuesta ( 7, "Argentina", 2, false),
                new OpcionesRespuesta (8, "Colombia", 2, false),
                new OpcionesRespuesta ( 9, "10 minutos de partido", 3, false),
                new OpcionesRespuesta (10, "45 minutos de partido", 3, false),
                new OpcionesRespuesta ( 11, "30 minutos de partido", 3, true),
                new OpcionesRespuesta ( 12, "15 minutos de partido", 3, false),
                new OpcionesRespuesta ( 13, "30", 4, false),
                new OpcionesRespuesta (14, "20", 4, false),
                new OpcionesRespuesta ( 15, "11", 4, true),
                new OpcionesRespuesta ( 16, "10", 4, false),
                new OpcionesRespuesta ( 17, "El Munich Stadium", 5, false),
                new OpcionesRespuesta ( 18, "Allianz Arena,", 5, true),
                new OpcionesRespuesta ( 19, "Vecchia Signora", 5, false),
                new OpcionesRespuesta ( 20, "Fulham", 5, false),
                new OpcionesRespuesta ( 21, "uno", 6, false),
                new OpcionesRespuesta ( 22, "cinco", 6, true),
                new OpcionesRespuesta ( 23, "diez", 6, false),
                new OpcionesRespuesta ( 24, "treinta", 6, false),
                new OpcionesRespuesta (25, "1001", 7, false),
                new OpcionesRespuesta ( 26, "999", 7, true),
                new OpcionesRespuesta ( 27, "990", 7, false),
                new OpcionesRespuesta ( 28, "998", 7, false),
                new OpcionesRespuesta ( 29, "Noveno", 8, false),
                new OpcionesRespuesta (30, "Decimotercero", 8, false),
                new OpcionesRespuesta (31, "Decimonoveno", 8, true),
                new OpcionesRespuesta ( 32, "Octavo", 8, false),
                new OpcionesRespuesta ( 33, "30 kilos", 9, false),
                new OpcionesRespuesta (34, "50 kilos", 9, false),
                new OpcionesRespuesta ( 35, "10 kilos", 9, true),
                new OpcionesRespuesta ( 36, "40 kilos", 9, false),
                new OpcionesRespuesta ( 37, "Hexágono", 10, false),
                new OpcionesRespuesta ( 38, "Heptágono", 10, true),
                new OpcionesRespuesta ( 39, "Septágono", 10, false),
                new OpcionesRespuesta ( 40, "Octágono", 10, false),
                new OpcionesRespuesta ( 41, "baboso, agridulce,pucante,'acido y umami", 11, false),
                new OpcionesRespuesta ( 42, "dulce, amargo, ácido, salado y umami.", 11, true),
                new OpcionesRespuesta ( 43, "dulce, agridulce,picante,'acido y umami", 11, false),
                new OpcionesRespuesta ( 44, "dulce, agridulce,picante,'acido y simple", 11, false),
                new OpcionesRespuesta ( 45, "Everest", 12, false),
                new OpcionesRespuesta (46, "La Antártida", 12, true),
                new OpcionesRespuesta ( 47, "Siveria", 12, false),
                new OpcionesRespuesta (48, "Dinamarca", 12, false),
                new OpcionesRespuesta ( 49, "Plutos", 13, false),
                new OpcionesRespuesta ( 50, "Platón", 13, false),
                new OpcionesRespuesta ( 51, "Homero", 13, true),
                new OpcionesRespuesta ( 52, "Euclides", 13, false),
                new OpcionesRespuesta ( 53, "Kamikistan", 14, false),
                new OpcionesRespuesta ( 54, "Kabul", 14, false),
                new OpcionesRespuesta ( 55, "Ulan Bator", 14, true),
                new OpcionesRespuesta ( 56, "Berlín", 14, false),
                new OpcionesRespuesta ( 57, "Nilo", 15, false),
                new OpcionesRespuesta ( 58, "Amazonas", 15, true),
                new OpcionesRespuesta ( 59, "Misisipi", 15, false),
                new OpcionesRespuesta ( 60, "Ganges", 15, false),
                new OpcionesRespuesta ( 61, "Electro", 16, false),
                new OpcionesRespuesta ( 62, "Pikachu", 16, true),
                new OpcionesRespuesta ( 63, "Manectric", 16, false),
                new OpcionesRespuesta ( 64, "Pachirisu", 16, false),
                new OpcionesRespuesta ( 65, "Monkey D Luffy", 17, false),
                new OpcionesRespuesta ( 66, "Astro Boy", 17, true),
                new OpcionesRespuesta ( 67, "Spike", 17, false),
                new OpcionesRespuesta ( 68, "Ligth Yagami", 17, false),
                new OpcionesRespuesta ( 69, "Golden boy", 18, false),
                new OpcionesRespuesta ( 70, "Alquimista de Fullmetal.", 18, false),
                new OpcionesRespuesta ( 71, "Fullmetal alquemist", 18, true),
                new OpcionesRespuesta ( 72, "Stain gate", 18, false),
                new OpcionesRespuesta ( 73, "Isley", 19, false),
                new OpcionesRespuesta ( 74, "Luciela", 19, false),
                new OpcionesRespuesta ( 75, "Priscilla", 19, true),
                new OpcionesRespuesta ( 76, "Riful", 19, false),
                new OpcionesRespuesta ( 77, "Vegeta", 20, false),
                new OpcionesRespuesta ( 78, "Lelouch Lanperouge.", 20, true),
                new OpcionesRespuesta ( 79, "Arslan", 20, false),
                new OpcionesRespuesta ( 80, "Atem", 20, false),
                new OpcionesRespuesta ( 81, "Elefante", 21, false),
                new OpcionesRespuesta ( 82, "La ballena azul", 21, true),
                new OpcionesRespuesta ( 83, "Oso pardo", 21, false),
                new OpcionesRespuesta ( 84, "Jirafa", 21, false),
                new OpcionesRespuesta ( 85, "Pancreas", 22, false),
                new OpcionesRespuesta ( 86, "El cerebro", 22, true),
                new OpcionesRespuesta ( 87, "El higado", 22, false),
                new OpcionesRespuesta ( 88, "Pulmones", 22, false),
                new OpcionesRespuesta ( 89, "Andrómeda I", 23, false),
                new OpcionesRespuesta ( 90, "Centaurus A", 23, false),
                new OpcionesRespuesta ( 91, "En la Vía Láctea.", 23, true),
                new OpcionesRespuesta ( 92, "Omicrom persey 8", 23, false),
                new OpcionesRespuesta ( 93, "Catorce mil millones", 24, false),
                new OpcionesRespuesta ( 94, "Noventa  mil millones", 24, false),
                new OpcionesRespuesta ( 95, "Trece mil millones", 24, true),
                new OpcionesRespuesta ( 96, "Cincuenta mil millones", 24, false),
                new OpcionesRespuesta ( 97, "Caza", 25, false),
                new OpcionesRespuesta ( 98, "Extinción", 25, true),
                new OpcionesRespuesta ( 99, "Muerte colectiva", 25, false),
                new OpcionesRespuesta ( 100, "Inanición",  25,  false )

            
               );
           return opcionesRespuesta;
        }



        public List<Pregunta> AddPregunta ()
        {
            var pregunta = Arrays.asList(
            new Pregunta ( 1, "¿Cuánto dura un partido de fútbol?", 1),
            new Pregunta ( 2, "¿Qué selección de fútbol ha ganado más Mundiales?", 1),
            new Pregunta ( 3, "¿Cuánto dura la prórroga en un partido de fútbol?", 1),
            new Pregunta ( 4, "¿Cuántos jugadores tiene un equipo de fútbol en el campo de juego?", 1),
            new Pregunta ( 5, "¿Cómo se llama el estadio del Bayern de Munich?", 1),
            new Pregunta ( 6, "Qué cantidad expresa el número romano V.", 2),
            new Pregunta ( 7, "¿Cuál es el número anterior a 1000?", 2),
            new Pregunta ( 8, "Si en una carrera vas tres puestos por detrás del vigésimo segundo, ¿en qué puesto vas?", 2),
            new Pregunta ( 9, "Un perro pesa 20 kilos y un cachorro pesa 10 kilos menos que él, ¿cuánto pesa la cría?", 2),
            new Pregunta ( 10, "¿Cómo se llama el polígono de siete lados?", 2),
            new Pregunta ( 11, "¿Cuáles son los cinco tipos de sabores primarios?", 3),
            new Pregunta ( 12, "¿Cuál es el lugar más frío de la tierra?", 3),
            new Pregunta ( 13, "¿Quién escribió La Odisea?", 3),
            new Pregunta ( 14, "¿Cómo se llama la capital de Mongolia?", 3),
            new Pregunta ( 15, "¿Cuál es el río más largo del mundo?", 3),
            new Pregunta ( 16, "¿Qué Pokémon tiene bolsillos para acumular electricidad en sus mejillas?", 4),
            new Pregunta ( 17, "¿Qué personaje de anime se vendió al circo?", 4),
            new Pregunta ( 18, "¿Qué serie de anime gira en torno a los hermanos Elric?", 4),
            new Pregunta ( 19, "En el anime «Claymore», ¿quién era el más poderoso de los «Seres despiertos»?", 4),
            new Pregunta ( 20, "Un príncipe marginado se hace cargo de la revolución controlando las mentes de los demás. ¿Quién es él?", 4),
            new Pregunta ( 21, "¿Cuál es el animal más grande que habita la Tierra?", 5),
            new Pregunta ( 22, "¿Qué órgano del cuerpo humano consume más energía?", 5),
            new Pregunta ( 23, "¿En qué galaxia se encuentra la Tierra?", 5),
            new Pregunta ( 24, "¿Cuál es la edad del universo? ", 5),
            new Pregunta ( 25, "¿Cómo se llama a la muerte de cada miembro de una especie? ", 5 )
            );
            
            return pregunta;
        }
    
}
