
package es.joseantoniofornellmarquez.juegocartas;


public class CartasCreadas{
   
    public String GenerarCartas(){
        
        Carta [][] mazoCentral = new Carta [9][3];
    
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
        
        mazoCentral [0][0] = carta1;
        mazoCentral [1][0] = carta2;
        mazoCentral [2][0] = carta3;
        mazoCentral [3][0] = carta4;
        return null;
    }
}
