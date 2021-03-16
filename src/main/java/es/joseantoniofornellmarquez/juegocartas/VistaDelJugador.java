/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

/**
 * Clase para la parte visual del jugador y el juego
 * @author 1DAW09
 */
public class VistaDelJugador extends StackPane{
    GridPane gridCartasJugador1 = new GridPane();
    //GridPane gridCartasJugador2 = new GridPane();
    //GridPane gridCartasJugador3 = new GridPane();
    //GridPane gridCartasJugador4 = new GridPane();
    HBox hboxCartaPersonajeJugador;
    Mazos mazos;
    Label carta6;
    Label carta7;
    /**
     * Metodo de la la clase VistaDelJugador que va a contener que ve el jugador
     * @param mazos espera un objeto de la clase Mazos
     */
    public VistaDelJugador(Mazos mazos){
        this.mazos = mazos;
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
            this.gridCartasJugador1.add(jugador, 1, 0);
            carta1 = new Label(mazos.cartasQueTieneElJugador[0][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[0][0].accion + " " + mazos.cartasQueTieneElJugador[0][0].palo + " " + 
            mazos.cartasQueTieneElJugador[0][0].numero);
            this.gridCartasJugador1.add(carta1, 2, 0);
            carta2 = new Label(mazos.cartasQueTieneElJugador[1][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[1][0].accion + " " + mazos.cartasQueTieneElJugador[1][0].palo + " " + 
            mazos.cartasQueTieneElJugador[1][0].numero);
            this.gridCartasJugador1.add(carta2, 3, 0);
            carta3 = new Label(mazos.cartasQueTieneElJugador[2][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[2][0].accion + " " + mazos.cartasQueTieneElJugador[2][0].palo + " " + 
            mazos.cartasQueTieneElJugador[2][0].numero);
            this.gridCartasJugador1.add(carta3, 4, 0);
            carta4 = new Label(mazos.cartasQueTieneElJugador[3][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[3][0].accion + " " + mazos.cartasQueTieneElJugador[3][0].palo + " " + 
            mazos.cartasQueTieneElJugador[3][0].numero);
            this.gridCartasJugador1.add(carta4, 5, 0);
            carta5 = new Label(mazos.cartasQueTieneElJugador[4][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[4][0].accion + " " + mazos.cartasQueTieneElJugador[4][0].palo + " " + 
            mazos.cartasQueTieneElJugador[4][0].numero);
            this.gridCartasJugador1.add(carta5, 6, 0);    
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
    /**
     * Metodo que va a mostrar que ve el jugador en pantalla
     */
    public void mostrarVistaJugador(){
        hboxCartaPersonajeJugador = new HBox();
        hboxCartaPersonajeJugador.setMaxWidth(300*300);
        hboxCartaPersonajeJugador.setMaxHeight(300*300);
        hboxCartaPersonajeJugador.setMinWidth(200);
        hboxCartaPersonajeJugador.setMinHeight(200);
        hboxCartaPersonajeJugador.setAlignment(Pos.BOTTOM_CENTER);
        hboxCartaPersonajeJugador.setSpacing(150);
        hboxCartaPersonajeJugador.setStyle("-fx-border-color: white");
        hboxCartaPersonajeJugador.getChildren().add(gridCartasJugador1);
        this.getChildren().add(hboxCartaPersonajeJugador);
        VistaDeLasCartas vista1 = new VistaDeLasCartas(mazos);
        hboxCartaPersonajeJugador.getChildren().add(vista1);
        Button robarCarta = new Button("Robar");
        robarCarta.setMinSize(60, 40);
        robarCarta.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                mazos.cogerCarta(0);
                carta6 = new Label(mazos.cartasQueTieneElJugador[5][0].nombre + " " + 
                mazos.cartasQueTieneElJugador[5][0].accion + " " + mazos.cartasQueTieneElJugador[5][0].palo + " " + 
                mazos.cartasQueTieneElJugador[5][0].numero);
                gridCartasJugador1.add(carta6, 7, 0);
                carta7 = new Label(mazos.cartasQueTieneElJugador[6][0].nombre + " " + 
                mazos.cartasQueTieneElJugador[6][0].accion + " " + mazos.cartasQueTieneElJugador[6][0].palo + " " + 
                mazos.cartasQueTieneElJugador[6][0].numero);
                gridCartasJugador1.add(carta7, 8, 0);
            }
        });
        hboxCartaPersonajeJugador.getChildren().add(robarCarta);
    
    }
}