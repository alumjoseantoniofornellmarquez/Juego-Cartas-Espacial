
package es.joseantoniofornellmarquez.juegocartas;

public class Carta {
    
    String nombre;
    int numero;
    String accion;
    String palo;
    public Carta(String nombre,int numero, String accion, String palo){
        this.nombre = nombre;
        this.numero = numero;
        this.accion = accion;
        this.palo = palo;
    }
}
