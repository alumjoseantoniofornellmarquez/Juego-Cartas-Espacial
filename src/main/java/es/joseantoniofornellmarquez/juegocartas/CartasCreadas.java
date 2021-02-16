
package es.joseantoniofornellmarquez.juegocartas;

import java.util.Random;


public class CartasCreadas{
    //Arry del mazo central
    Carta [] mazoCentral = new Carta [60];
    //Metodo para crear cartas
    public CartasCreadas(){
        Carta carta;
        mazoCentral [0] = new Carta("Shot",4, "Pierde una vida","Rombos");
        mazoCentral [1] = new Carta("Kit Médico",8, "Gana una vida","Corazones");
        mazoCentral [2] = new Carta("Fallaste",4, "Esquivas un shot","Picas");
        mazoCentral [3] = new Carta("Mirilla",1, "La distancia de visión se aumenta en 1","Picas");
        this.cogerCarta();
    }
    //Metodo para coger y mostrar una carta aleatoria del mazo central y mostrarlo
     public void cogerCarta(){
        int cartaAleatoria = getNumAleatorio(0,3);
        System.out.println(mazoCentral[cartaAleatoria].nombre + "\n" +
        mazoCentral[cartaAleatoria].accion + "\n" +
        mazoCentral[cartaAleatoria].numero + " " +
        mazoCentral[cartaAleatoria].palo);
    }
    //Metodo para generar numeros aleatorios
    public int getNumAleatorio(int min, int max){
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
}
