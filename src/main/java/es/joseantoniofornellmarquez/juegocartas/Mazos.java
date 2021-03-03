
package es.joseantoniofornellmarquez.juegocartas;

import java.util.Random;


public class Mazos{
    int cartaAleatoria;
    //Variables jugadores
    int jugadores;
    //Variable para la cantidad de cartas del mazo central
    int cartasDelCentro = 4;
    //Array del mazo central
    Carta [] mazoCentral = new Carta [cartasDelCentro];
    Personaje [] mazoPersonajes;
    //Array para repartir los personajes
    Personaje [] repartoPersonajes;
    //Array para repartir las cartas del centro
    Carta [] [] cartasQueTieneElJugador;
    //Metodo para crear cartas
    public Mazos(int numJugadores){
        jugadores = numJugadores;
        //Array del mazo de personajes
        mazoPersonajes = new Personaje[jugadores];
        Personaje capitan;
        Personaje ayudante1;
        Personaje ayudante2;
        Personaje asesino1;
        Personaje asesino2;
        Personaje asesino3;
        Personaje espia;
        this.mazoCentral [0] = new Carta("Shot",4, "Pierde una vida","Rombos");
        this.mazoCentral [1] = new Carta("Kit Médico",8, "Gana una vida","Corazones");
        this.mazoCentral [2] = new Carta("Fallaste",4, "Esquivas un shot","Picas");
        this.mazoCentral [3] = new Carta("Mirilla",1, "La distancia de visión se aumenta en 1","Picas");
        capitan = new Personaje("Capitán","Ha de sobrevivir toda la partida y encontrar a los asesinos y al espia");
        ayudante1 = new Personaje("Ayudante","Ha ayudar al capitan a encontrar a los asesinos y al espia");
        ayudante2 = new Personaje("Ayudante","Ha ayudar al capitan a encontrar a los asesinos y al espia");
        asesino1 = new Personaje("Asesino","Ha de matar al capitan");
        asesino2 = new Personaje("Asesino","Ha de matar al capitan");
        asesino3 = new Personaje("Asesino","Ha de matar al capitan");
        espia = new Personaje("Espia","Ha de quedarse solo con el capitán y matarlo");
        if(jugadores == 4){
            mazoPersonajes [0] = capitan;
            mazoPersonajes [1] = ayudante1;
            mazoPersonajes [2] = asesino1;
            mazoPersonajes [3] = espia;
        }else if(jugadores == 5){
            mazoPersonajes [0] = capitan;
            mazoPersonajes [1] = ayudante1;
            mazoPersonajes [2] = asesino1;
            mazoPersonajes [3] = espia;
            mazoPersonajes [4] = ayudante2;
        }else if (jugadores == 6){
            mazoPersonajes [0] = capitan;
            mazoPersonajes [1] = ayudante1;
            mazoPersonajes [2] = asesino1;
            mazoPersonajes [3] = espia;
            mazoPersonajes [4] = ayudante2;
            mazoPersonajes [5] = asesino2;
        }else if (jugadores == 7){
            mazoPersonajes [0] = capitan;
            mazoPersonajes [1] = ayudante1;
            mazoPersonajes [2] = asesino1;
            mazoPersonajes [3] = espia;
            mazoPersonajes [4] = ayudante2;
            mazoPersonajes [5] = asesino2;
            mazoPersonajes [6] = asesino3;
        }
    }
    //Metodo para repartir los personajes a los jugadores
    public void repartirPersonajes(){
        repartoPersonajes = new Personaje[jugadores];
        barajarMazoPersonaje();
        if(jugadores == 4){
            repartoPersonajes [0] = mazoPersonajes [0];
            repartoPersonajes [1] = mazoPersonajes [1];
            repartoPersonajes [2] = mazoPersonajes [2];
            repartoPersonajes [3] = mazoPersonajes [3];
        }else if(jugadores == 5){
            repartoPersonajes [0] = mazoPersonajes [0];
            repartoPersonajes [1] = mazoPersonajes [1];
            repartoPersonajes [2] = mazoPersonajes [2];
            repartoPersonajes [3] = mazoPersonajes [3];
            repartoPersonajes [4] = mazoPersonajes [4];
        }else if(jugadores == 6){
            repartoPersonajes [0] = mazoPersonajes [0];
            repartoPersonajes [1] = mazoPersonajes [1];
            repartoPersonajes [2] = mazoPersonajes [2];
            repartoPersonajes [3] = mazoPersonajes [3];
            repartoPersonajes [4] = mazoPersonajes [4];
            repartoPersonajes [5] = mazoPersonajes [5];
        }else if(jugadores == 7){
            repartoPersonajes [0] = mazoPersonajes [0];
            repartoPersonajes [1] = mazoPersonajes [1];
            repartoPersonajes [2] = mazoPersonajes [2];
            repartoPersonajes [3] = mazoPersonajes [3];
            repartoPersonajes [4] = mazoPersonajes [4];
            repartoPersonajes [5] = mazoPersonajes [5];
            repartoPersonajes [6] = mazoPersonajes [6];
        }
    }
    //Metodo para repartir cartas del centro
    public void repartirCartasCentro(){
        cartasQueTieneElJugador = new Carta [10][jugadores];
        barajarMazoCentro();
        if(jugadores == 4){
            cartasQueTieneElJugador [0][0]= mazoCentral [0];
            cartasQueTieneElJugador [1][0]= mazoCentral [1];
            cartasQueTieneElJugador [2][0]= mazoCentral [2];
            cartasQueTieneElJugador [3][0]= mazoCentral [3];
        }
    }
    //Metodo para coger y mostrar una carta aleatoria del mazo central y mostrarlo
    public void cogerCarta(){
        for (int i = 0; i < mazoCentral.length; i++){
            Carta carta = mazoCentral[i];
            carta.mostrarCarta();
        }
    }
    //Metodo para barajar las cartas de los personajes
    public void barajarMazoPersonaje(){
        for (int i = 0; i<= 100; i++){
            int num1 = getNumAleatorio(0, jugadores-1);
            int num2 = getNumAleatorio(0, jugadores-1);
            Personaje carta1 = mazoPersonajes[num1];
            Personaje carta2 = mazoPersonajes[num2];
            mazoPersonajes[num2] = carta1;
            mazoPersonajes[num1] = carta2;
        }
    }
    //Metodo para barajar las cartas de centro
    public void barajarMazoCentro(){
        for (int i = 0; i<= 100; i++){
            int num1 = getNumAleatorio(0, cartasDelCentro-1);
            int num2 = getNumAleatorio(0, cartasDelCentro-1);
            Carta carta1 = mazoCentral[num1];
            Carta carta2 = mazoCentral[num2];
            mazoCentral[num2] = carta1;
            mazoCentral[num1] = carta2;
        }
    }
    //Metodo para generar numeros aleatorios
    public int getNumAleatorio(int min, int max){
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
}
