
package es.joseantoniofornellmarquez.juegocartas;

import java.util.Random;


public class CartasCreadas{
    //Array del mazo central
    Carta [] mazoCentral = new Carta [60];
    int cartaAleatoria;
    //Array del mazo de personajes
    Personajes [] mazoPersonajes = new Personajes[7];
    //Metodo para crear cartas
    public CartasCreadas(){
        
        Carta carta;
        this.mazoCentral [0] = new Carta("Shot",4, "Pierde una vida","Rombos");
        this.mazoCentral [1] = new Carta("Kit Médico",8, "Gana una vida","Corazones");
        this.mazoCentral [2] = new Carta("Fallaste",4, "Esquivas un shot","Picas");
        this.mazoCentral [3] = new Carta("Mirilla",1, "La distancia de visión se aumenta en 1","Picas");
        Personajes personaje;
        this.mazoPersonajes[0] = new Personajes("Capitán","Ha de sobrevivir toda la partida y encontrar a los asesinos y al espia");
        this.mazoPersonajes[1] = new Personajes("Ayudante","Ha ayudar al capitan a encontrar a los asesinos y al espia");
        this.mazoPersonajes[2] = new Personajes("Ayudante","Ha ayudar al capitan a encontrar a los asesinos y al espia");
        this.mazoPersonajes[3] = new Personajes("Asesino","Ha de matar al capitan");
        this.mazoPersonajes[4] = new Personajes("Asesino","Ha de matar al capitan");
        this.mazoPersonajes[5] = new Personajes("Asesino","Ha de matar al capitan");
        this.mazoPersonajes[6] = new Personajes("Espia","Ha de que darse solo con el capitán y matarlo");

    }
    //Metodo para coger y mostrar una carta aleatoria del mazo central y mostrarlo
    public Carta cogerCarta(){
        cartaAleatoria = getNumAleatorio(0,3);
        return mazoCentral [cartaAleatoria];
    }
    public Personajes cogerCartaPersonajes(){
        return mazoPersonajes[7];
    }
    //Metodo para barajar las cartas
    Personajes carta1;
    Personajes carta2;
    public void barajarMazos(){
        carta1 = mazoPersonajes[0];
        carta2 = mazoPersonajes[1];
        mazoPersonajes[1] = carta1;
        mazoPersonajes[0] = carta2;
    }
    //Metodo para generar numeros aleatorios
    public int getNumAleatorio(int min, int max){
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
}
