
package es.joseantoniofornellmarquez.juegocartas;

import java.util.Random;


public class Mazos{
    //Array del mazo central
    Carta [] mazoCentral = new Carta [4];
    int cartaAleatoria;
    //Variables jugadores
    int jugadores = 7;
    //Array del mazo de personajes
    Personajes [] mazoPersonajes = new Personajes[jugadores];
    //Metodo para crear cartas
    public Mazos(){
        Personajes capitan;
        Personajes ayudante1;
        Personajes ayudante2;
        Personajes asesino1;
        Personajes asesino2;
        Personajes asesino3;
        Personajes espia;
        Carta carta;
        this.mazoCentral [0] = new Carta("Shot",4, "Pierde una vida","Rombos");
        this.mazoCentral [1] = new Carta("Kit Médico",8, "Gana una vida","Corazones");
        this.mazoCentral [2] = new Carta("Fallaste",4, "Esquivas un shot","Picas");
        this.mazoCentral [3] = new Carta("Mirilla",1, "La distancia de visión se aumenta en 1","Picas");
        Personajes personaje;
        capitan = new Personajes("Capitán","Ha de sobrevivir toda la partida y encontrar a los asesinos y al espia");
        ayudante1 = new Personajes("Ayudante","Ha ayudar al capitan a encontrar a los asesinos y al espia");
        ayudante2 = new Personajes("Ayudante","Ha ayudar al capitan a encontrar a los asesinos y al espia");
        asesino1 = new Personajes("Asesino","Ha de matar al capitan");
        asesino2 = new Personajes("Asesino","Ha de matar al capitan");
        asesino3 = new Personajes("Asesino","Ha de matar al capitan");
        espia = new Personajes("Espia","Ha de quedarse solo con el capitán y matarlo");
        mazoPersonajes [0] = capitan;
        mazoPersonajes [1] = ayudante1;
        mazoPersonajes [2] = asesino1;
        mazoPersonajes [3] = espia;
        if(jugadores == 5){
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
    public void repartirPersonajes(int numJugadores){
        jugadores = numJugadores;
        Personajes [] repartoPersonajes = new Personajes[jugadores];
        
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
            Personajes carta1 = mazoPersonajes[num1];
            Personajes carta2 = mazoPersonajes[num2];
            mazoPersonajes[num2] = carta1;
            mazoPersonajes[num1] = carta2;
        }
    }
    //Metodo para barajar las cartas de centro
    public void barajarMazoCentro(){
        for (int i = 0; i<= 100; i++){
            int num1 = getNumAleatorio(0, 3);
            int num2 = getNumAleatorio(0, 3);
            Carta carta1 = mazoCentral[num1];
            Carta carta2 = mazoCentral[num2];
            mazoCentral[num2] = carta1;
            mazoCentral[num1] = carta2;
        }
    }
    public void cogerCartaPersonajes(){
        for (int i = 0; i < mazoPersonajes.length; i++){
            Personajes perso = mazoPersonajes[i];
            perso.mostrarCartaPersonajes();
            //System.out.println("Carta " + i + perso);
        }
    }
    //Metodo para generar numeros aleatorios
    public int getNumAleatorio(int min, int max){
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
}
