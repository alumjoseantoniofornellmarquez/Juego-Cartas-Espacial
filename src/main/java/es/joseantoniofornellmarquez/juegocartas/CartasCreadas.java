
package es.joseantoniofornellmarquez.juegocartas;

import java.util.Random;


public class CartasCreadas{
    Carta [] mazoCentral;
    public String GenerarCartas(){
        
        mazoCentral = new Carta [4];
    
        Carta carta1 = new Carta();
        carta1.nombre = "Shot";
        carta1.numero = 4;
        carta1.accion = "Pierde una vida";
        carta1.palo = "Rombos";
        
        Carta carta2 = new Carta();
        carta2.nombre = "Kit Médico";
        carta2.numero = 8;
        carta2.accion = "Gana una vida";
        carta2.palo = "Corazones";
        
        Carta carta3 = new Carta();
        carta3.nombre = "Esquiva";
        carta3.numero = 4;
        carta3.accion = "Esquivas un shot";
        carta3.palo = "Picas";
        
        Carta carta4 = new Carta();
        carta4.nombre = "Mirilla";
        carta4.numero = 1;
        carta4.accion = "La distancia de vision se aumenta en 1";
        carta4.palo = "Picas";
        
        mazoCentral [0] = carta1;
        mazoCentral [1] = carta2;
        mazoCentral [2] = carta3;
        mazoCentral [3] = carta4;
        return null;
    }
    
    public void cogerCarta(){
        //mazoCentral[1];
        System.out.println(mazoCentral[1]);
    }
    public int getNumAleatorio(int min, int max){
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
}
