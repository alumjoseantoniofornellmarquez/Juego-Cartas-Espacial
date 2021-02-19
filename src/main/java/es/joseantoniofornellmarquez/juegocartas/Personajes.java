/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

/**
 *
 * @author 1DAW09
 */
public class Personajes {
    String nombre;
    String rol;
    public Personajes(String nombre, String rol){
        
        this.nombre = nombre;
        this.rol = rol;
        
    }
    public void mostrarCartaPersonajes(){
        System.out.println(nombre + ", " + rol + "\n "); 
    }
}
