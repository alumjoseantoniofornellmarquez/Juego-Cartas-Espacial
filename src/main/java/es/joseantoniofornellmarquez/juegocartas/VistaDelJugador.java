/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author 1DAW09
 */
public class VistaDelJugador extends GridPane{
    
    public VistaDelJugador(Mazos mazos){
        this.setStyle("-fx-grid-lines-visible: true");
        Label jugador1;
        Label jugador2;
        Label jugador3;
        Label jugador4;
        Label jugador5;
        Label jugador6;
        Label jugador7;
        if(mazos.jugadores == 4){
            jugador1 = new Label(mazos.mazoPersonajes[0].nombre + " " + mazos.mazoPersonajes[0].rol + " " );
            jugador2 = new Label(mazos.mazoPersonajes[1].nombre + " " + mazos.mazoPersonajes[1].rol + " ");
            jugador3 = new Label(mazos.mazoPersonajes[2].nombre + " " + mazos.mazoPersonajes[2].rol + " ");
            jugador4 = new Label(mazos.mazoPersonajes[3].nombre + " " + mazos.mazoPersonajes[3].rol + " ");
            this.add(jugador1, 5, 0);
            this.add(jugador2, 5, 10);
            this.add(jugador3, 5, 20);
            this.add(jugador4, 5, 30);
        }else if(mazos.jugadores == 5){
            jugador1 = new Label(mazos.mazoPersonajes[0].nombre + " " + mazos.mazoPersonajes[0].rol + " " );
            jugador2 = new Label(mazos.mazoPersonajes[1].nombre + " " + mazos.mazoPersonajes[1].rol + " ");
            jugador3 = new Label(mazos.mazoPersonajes[2].nombre + " " + mazos.mazoPersonajes[2].rol + " ");
            jugador4 = new Label(mazos.mazoPersonajes[3].nombre + " " + mazos.mazoPersonajes[3].rol + " ");
            jugador5 = new Label(mazos.mazoPersonajes[4].nombre + " " + mazos.mazoPersonajes[4].rol + " ");
            this.add(jugador1, 5, 0);
            this.add(jugador2, 5, 10);
            this.add(jugador3, 5, 20);
            this.add(jugador4, 5, 30);
            this.add(jugador5, 5, 40);
        }else if(mazos.jugadores == 6){
            jugador1 = new Label(mazos.mazoPersonajes[0].nombre + " " + mazos.mazoPersonajes[0].rol + " " );
            jugador2 = new Label(mazos.mazoPersonajes[1].nombre + " " + mazos.mazoPersonajes[1].rol + " ");
            jugador3 = new Label(mazos.mazoPersonajes[2].nombre + " " + mazos.mazoPersonajes[2].rol + " ");
            jugador4 = new Label(mazos.mazoPersonajes[3].nombre + " " + mazos.mazoPersonajes[3].rol + " ");
            jugador5 = new Label(mazos.mazoPersonajes[4].nombre + " " + mazos.mazoPersonajes[4].rol + " ");
            jugador6 = new Label(mazos.mazoPersonajes[5].nombre + " " + mazos.mazoPersonajes[5].rol + " ");
            this.add(jugador1, 5, 0);
            this.add(jugador2, 5, 10);
            this.add(jugador3, 5, 20);
            this.add(jugador4, 5, 30);
            this.add(jugador5, 5, 40);
            this.add(jugador6, 5, 50);
        }else if(mazos.jugadores == 7){
            jugador1 = new Label(mazos.mazoPersonajes[0].nombre + " " + mazos.mazoPersonajes[0].rol + " " );
            jugador2 = new Label(mazos.mazoPersonajes[1].nombre + " " + mazos.mazoPersonajes[1].rol + " ");
            jugador3 = new Label(mazos.mazoPersonajes[2].nombre + " " + mazos.mazoPersonajes[2].rol + " ");
            jugador4 = new Label(mazos.mazoPersonajes[3].nombre + " " + mazos.mazoPersonajes[3].rol + " ");
            jugador5 = new Label(mazos.mazoPersonajes[4].nombre + " " + mazos.mazoPersonajes[4].rol + " ");
            jugador6 = new Label(mazos.mazoPersonajes[5].nombre + " " + mazos.mazoPersonajes[5].rol + " ");
            jugador7 = new Label(mazos.mazoPersonajes[6].nombre + " " + mazos.mazoPersonajes[6].rol + " ");
            this.add(jugador1, 5, 0);
            this.add(jugador2, 5, 10);
            this.add(jugador3, 5, 20);
            this.add(jugador4, 5, 30);
            this.add(jugador5, 5, 40);
            this.add(jugador6, 5, 50);
            this.add(jugador7, 5, 60);
        }
    this.setMaxWidth(30*9);
    this.setMaxHeight(30*mazos.jugadores);
    }
    
}
