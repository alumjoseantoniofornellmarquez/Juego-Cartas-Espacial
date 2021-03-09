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
        Label jugador;
        Label carta1;
        Label carta2;
        Label carta3;
        Label carta4;
        Label carta5;
        if(mazos.jugadores == 4){
            jugador = new Label(mazos.repartoPersonajes[0].nombre + " " + 
            mazos.repartoPersonajes[0].rol + " " );
            this.gridCartasJugador1.add(jugador, 5, 0);
            carta1 = new Label(mazos.cartasQueTieneElJugador[0][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[0][0].accion + " " + mazos.cartasQueTieneElJugador[0][0].palo + " " + 
            mazos.cartasQueTieneElJugador[0][0].numero);
            this.gridCartasJugador1.add(carta1, 10, 0);
            carta2 = new Label(mazos.cartasQueTieneElJugador[1][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[1][0].accion + " " + mazos.cartasQueTieneElJugador[1][0].palo + " " + 
            mazos.cartasQueTieneElJugador[1][0].numero);
            this.gridCartasJugador1.add(carta2, 15, 0);
            carta3 = new Label(mazos.cartasQueTieneElJugador[2][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[2][0].accion + " " + mazos.cartasQueTieneElJugador[2][0].palo + " " + 
            mazos.cartasQueTieneElJugador[2][0].numero);
            this.gridCartasJugador1.add(carta3, 20, 0);
            carta4 = new Label(mazos.cartasQueTieneElJugador[3][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[3][0].accion + " " + mazos.cartasQueTieneElJugador[3][0].palo + " " + 
            mazos.cartasQueTieneElJugador[3][0].numero);
            this.gridCartasJugador1.add(carta4, 30, 0);
            carta5 = new Label(mazos.cartasQueTieneElJugador[4][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[4][0].accion + " " + mazos.cartasQueTieneElJugador[4][0].palo + " " + 
            mazos.cartasQueTieneElJugador[4][0].numero);
            this.gridCartasJugador1.add(carta5, 35, 0);
        }else if(mazos.jugadores == 5){
            jugador = new Label(mazos.repartoPersonajes[0].nombre + " " + mazos.repartoPersonajes[0].rol + " " );
            this.gridCartasJugador1.add(jugador, 5, 0);
        }else if(mazos.jugadores == 6){
            jugador = new Label(mazos.repartoPersonajes[0].nombre + " " + mazos.repartoPersonajes[0].rol + " " );
            this.gridCartasJugador1.add(jugador, 5, 0);

        }else if(mazos.jugadores == 7){
            jugador = new Label(mazos.repartoPersonajes[0].nombre + " " + mazos.repartoPersonajes[0].rol + " " );
            this.gridCartasJugador1.add(jugador, 5, 0);

        }
    this.gridCartasJugador1.setMaxWidth(300*300);
    this.gridCartasJugador1.setMaxHeight(300*300);
    mostrarVistaJugador();
    }
    public void mostrarVistaJugador(){
        hboxCartaPersonajeJugador = new HBox();
        hboxCartaPersonajeJugador.setMaxWidth(300*300);
        hboxCartaPersonajeJugador.setMaxHeight(300*300);
        hboxCartaPersonajeJugador.setMinWidth(50);
        hboxCartaPersonajeJugador.setMinHeight(50);
        hboxCartaPersonajeJugador.setAlignment(Pos.BOTTOM_CENTER);
        hboxCartaPersonajeJugador.setSpacing(150);
        hboxCartaPersonajeJugador.setStyle("-fx-border-color: green");
        hboxCartaPersonajeJugador.getChildren().add(gridCartasJugador1);
        this.getChildren().add(hboxCartaPersonajeJugador);
    }
}