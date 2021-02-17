
package es.joseantoniofornellmarquez.juegocartas;

import java.util.Random;


public class CartasCreadas{
    //Arry del mazo central
    Carta [] mazoCentral = new Carta [60];
    int cartaAleatoria;
    //Metodo para crear cartas
    public CartasCreadas(){
        Carta carta;
        this.mazoCentral [0] = new Carta("Shot",4, "Pierde una vida","Rombos");
        this.mazoCentral [1] = new Carta("Kit Médico",8, "Gana una vida","Corazones");
        this.mazoCentral [2] = new Carta("Fallaste",4, "Esquivas un shot","Picas");
        this.mazoCentral [3] = new Carta("Mirilla",1, "La distancia de visión se aumenta en 1","Picas");
        
    }
    //Metodo para coger y mostrar una carta aleatoria del mazo central y mostrarlo
    public Carta cogerCarta(){
        cartaAleatoria = getNumAleatorio(0,3);
        return mazoCentral [cartaAleatoria];
    }
    //Metodo para generar numeros aleatorios
    public int getNumAleatorio(int min, int max){
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
}
