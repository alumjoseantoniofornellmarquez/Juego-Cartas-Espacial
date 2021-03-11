
package es.joseantoniofornellmarquez.juegocartas;
/**
 * Clase Carta
 * @author 1DAW09
 */
public class Carta {
    //Variables para el Metodo constructor de Carta
    String nombre;
    int numero;
    String accion;
    String palo;
    /**
     * Metodo constructor para las cartas del mazo central
     * @param nombre Nombre de la carta
     * @param numero Número de la carta
     * @param accion Accion de la carta
     * @param palo Palo de la carta
     */
    public Carta(String nombre,int numero, String accion, String palo){
        this.nombre = nombre;
        this.numero = numero;
        this.accion = accion;
        this.palo = palo;
    } 
    /**
     * Metod para mostrar la información de la carta
     */
    public void mostrarCarta(){
        System.out.println(nombre + "\n" +
        accion + "\n" +
        numero + " " +
        palo +" \n ");
    }
}
