/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 *
 * @author 1DAW09
 */
public class ParteGrafica extends GridPane{
    
    public ParteGrafica(Mazos mazos){
        Label jugador1 = new Label(mazos.mazoPersonajes[0].nombre + " " + mazos.mazoPersonajes[0].rol + " " );
        Label jugador2 = new Label(mazos.mazoPersonajes[1].nombre + " " + mazos.mazoPersonajes[1].rol + " ");
        Label jugador3 = new Label(mazos.mazoPersonajes[2].nombre + " " + mazos.mazoPersonajes[2].rol + " ");
        Label jugador4 = new Label(mazos.mazoPersonajes[3].nombre + " " + mazos.mazoPersonajes[3].rol + " ");
        this.add(jugador1, 0, 0);
        this.add(jugador2, 5, 0);
        this.add(jugador3, 0, 5);
        this.add(jugador4, 5, 5);
        
    }
    
}
