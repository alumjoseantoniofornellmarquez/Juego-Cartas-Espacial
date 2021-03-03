/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

/**
 *
 * @author 1DAW09
 */
public class VistaDelJugador extends StackPane{
    GridPane gridCartasJugador1 = new GridPane();
    //GridPane gridCartasJugador2 = new GridPane();
    //GridPane gridCartasJugador3 = new GridPane();
    //GridPane gridCartasJugador4 = new GridPane();
    HBox hboxCartaPersonajeJugador;
    public VistaDelJugador(Mazos mazos){
        this.gridCartasJugador1.setStyle("-fx-grid-lines-visible: true");
        Label jugador1;
        Label jugador2;
        Label jugador3;
        Label jugador4;
        Label jugador5;
        Label jugador6;
        Label jugador7;
        if(mazos.jugadores == 4){
            jugador1 = new Label(mazos.repartoPersonajes[0].nombre + " " + 
            mazos.repartoPersonajes[0].rol + " " + mazos.cartasQueTieneElJugador[0][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[0][0].accion + " " + mazos.cartasQueTieneElJugador[0][0].palo + " " + 
            mazos.cartasQueTieneElJugador[0][0].numero );
            this.gridCartasJugador1.add(jugador1, 5, 0);
            //this.gridCartasJugador2.add(jugador2, 5, 10);
            //this.gridCartasJugador3.add(jugador3, 5, 20);
            //this.gridCartasJugador4.add(jugador4, 5, 30);
        }else if(mazos.jugadores == 5){
            jugador1 = new Label(mazos.repartoPersonajes[0].nombre + " " + mazos.repartoPersonajes[0].rol + " " );
            jugador2 = new Label(mazos.repartoPersonajes[1].nombre + " " + mazos.repartoPersonajes[1].rol + " ");
            jugador3 = new Label(mazos.repartoPersonajes[2].nombre + " " + mazos.repartoPersonajes[2].rol + " ");
            jugador4 = new Label(mazos.repartoPersonajes[3].nombre + " " + mazos.repartoPersonajes[3].rol + " ");
            jugador5 = new Label(mazos.repartoPersonajes[4].nombre + " " + mazos.repartoPersonajes[4].rol + " ");
            this.gridCartasJugador1.add(jugador1, 5, 0);
            //this.gridCartasJugador2.add(jugador2, 5, 10);
            //this.gridCartasJugador3.add(jugador3, 5, 20);
            //this.gridCartasJugador4.add(jugador4, 5, 30);
            //this.gridCartasJugador4.add(jugador5, 5, 40);
        }else if(mazos.jugadores == 6){
            jugador1 = new Label(mazos.repartoPersonajes[0].nombre + " " + mazos.repartoPersonajes[0].rol + " " );
            jugador2 = new Label(mazos.repartoPersonajes[1].nombre + " " + mazos.repartoPersonajes[1].rol + " ");
            jugador3 = new Label(mazos.repartoPersonajes[2].nombre + " " + mazos.repartoPersonajes[2].rol + " ");
            jugador4 = new Label(mazos.repartoPersonajes[3].nombre + " " + mazos.repartoPersonajes[3].rol + " ");
            jugador5 = new Label(mazos.repartoPersonajes[4].nombre + " " + mazos.repartoPersonajes[4].rol + " ");
            jugador6 = new Label(mazos.repartoPersonajes[5].nombre + " " + mazos.repartoPersonajes[5].rol + " ");
            this.gridCartasJugador1.add(jugador1, 5, 0);
            //this.gridCartasJugador1.add(jugador2, 5, 10);
            //this.gridCartasJugador1.add(jugador3, 5, 20);
            //this.gridCartasJugador1.add(jugador4, 5, 30);
            //this.gridCartasJugador1.add(jugador5, 5, 40);
            //this.gridCartasJugador1.add(jugador6, 5, 50);
        }else if(mazos.jugadores == 7){
            jugador1 = new Label(mazos.repartoPersonajes[0].nombre + " " + mazos.repartoPersonajes[0].rol + " " );
            jugador2 = new Label(mazos.repartoPersonajes[1].nombre + " " + mazos.repartoPersonajes[1].rol + " ");
            jugador3 = new Label(mazos.repartoPersonajes[2].nombre + " " + mazos.repartoPersonajes[2].rol + " ");
            jugador4 = new Label(mazos.repartoPersonajes[3].nombre + " " + mazos.repartoPersonajes[3].rol + " ");
            jugador5 = new Label(mazos.repartoPersonajes[4].nombre + " " + mazos.repartoPersonajes[4].rol + " ");
            jugador6 = new Label(mazos.repartoPersonajes[5].nombre + " " + mazos.repartoPersonajes[5].rol + " ");
            jugador7 = new Label(mazos.repartoPersonajes[6].nombre + " " + mazos.repartoPersonajes[6].rol + " ");
            this.gridCartasJugador1.add(jugador1, 5, 0);
            //this.gridCartasJugador1.add(jugador2, 5, 10);
            //this.gridCartasJugador1.add(jugador3, 5, 20);
            //this.gridCartasJugador1.add(jugador4, 5, 30);
            //this.gridCartasJugador1.add(jugador5, 5, 40);
            //this.gridCartasJugador1.add(jugador6, 5, 50);
            //this.gridCartasJugador1.add(jugador7, 5, 60);
        }
    this.gridCartasJugador1.setMaxWidth(300*9);
    this.gridCartasJugador1.setMaxHeight(300*mazos.jugadores);
    mostrarVistaJugador();
    }
    public void mostrarVistaJugador(){
        hboxCartaPersonajeJugador = new HBox();
        hboxCartaPersonajeJugador.setMinWidth(60);
        hboxCartaPersonajeJugador.setAlignment(Pos.BOTTOM_CENTER);
        hboxCartaPersonajeJugador.setSpacing(150);
        hboxCartaPersonajeJugador.getChildren().add(gridCartasJugador1);
        this.getChildren().add(hboxCartaPersonajeJugador);
    }
    
}