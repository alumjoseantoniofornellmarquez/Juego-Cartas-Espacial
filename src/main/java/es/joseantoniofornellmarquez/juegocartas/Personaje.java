/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

/**
 *Clase Personaje
 * @author 1DAW09
 */
public class Personaje {
    String nombre;
    String rol;
    int vidas = 5;
    /**
     * Metodo constructor de la clase Personaje
     * @param nombre Nombre del personaje
     * @param rol Rol que va a tener
     */
    public Personaje(String nombre, String rol){
        this.nombre = nombre;
        this.rol = rol;
        
    }
    /**
     * Metodo para mostrar por consola el personaje
     */
    public void mostrarCartaPersonaje(){
        System.out.println(nombre + ", " + rol + "\n "); 
    }
}
