
package es.joseantoniofornellmarquez.juegocartas;

import java.util.Random;


public class CartasCreadas{
    Carta [] mazoCentral = new Carta [60];
    public CartasCreadas(){
        Carta carta;
        mazoCentral [0] = new Carta("Shot",4, "Pierde una vida","Rombos");
        mazoCentral [1] = new Carta("Kit Médico",8, "Gana una vida","Corazones");
        mazoCentral [2] = new Carta("Esquiva",4, "Esquivas un shot","Picas");
        mazoCentral [3] = new Carta("Mirilla",1, "La distancia de vision se aumenta en 1","Picas");
        this.cogerCarta();
    }
     public void cogerCarta(){
        System.out.println(mazoCentral[0].nombre);
    }
    public int getNumAleatorio(int min, int max){
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
}
