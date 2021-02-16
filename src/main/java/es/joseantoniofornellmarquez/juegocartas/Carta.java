
package es.joseantoniofornellmarquez.juegocartas;

public class Carta {
    //Variables para el Metodo constructor de Carta
    String nombre;
    int numero;
    String accion;
    String palo;
    //Metodo constructor para las cartas del mazo central
    public Carta(String nombre,int numero, String accion, String palo){
        this.nombre = nombre;
        this.numero = numero;
        this.accion = accion;
        this.palo = palo;
    }
}
