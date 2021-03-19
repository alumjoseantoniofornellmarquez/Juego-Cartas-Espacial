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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;

/**
 * Clase para la parte visual del jugador y el juego
 * @author 1DAW09
 */
public class VistaDelJugador extends StackPane{
    HBox paneCartasJugador1 = new HBox();
    //GridPane gridCartasJugador2 = new GridPane();
    //GridPane gridCartasJugador3 = new GridPane();
    //GridPane gridCartasJugador4 = new GridPane();
    HBox hboxCartaPersonajeJugador;
    Mazos mazos;
    Label jugador;
    Label [] carta1;
    final int TAM_X = 100;
    final int TAM_Y = 100;
    Button robarCarta;
    BorderPane tablero;
    int cartasDelJugador= 5;
    /**
     * Metodo de la la clase VistaDelJugador que va a contener que ve el jugador
     * @param mazos espera un objeto de la clase Mazos
     */
    public VistaDelJugador(Mazos mazos, BorderPane tablero){
        paneCartasJugador1.setStyle("-fx-border-color: black");
        this.tablero = tablero;
        this.mazos = mazos;
        this.paneCartasJugador1.setStyle("-fx-grid-lines-visible: true");
        carta1 = new Label [mazos.CARTASDELCENTRO];
        jugador = new Label(mazos.repartoPersonajes[0].nombre + " " + 
        mazos.repartoPersonajes[0].rol + " " );
        jugador.setMaxSize(TAM_X, TAM_Y);
        jugador.setAlignment(Pos.CENTER_LEFT);
        for (int i = 0; i < cartasDelJugador ; i++){
            carta1 [i] = new Label(mazos.cartasQueTieneElJugador[i][0].nombre + " " + 
            mazos.cartasQueTieneElJugador[i][0].accion + " " + mazos.cartasQueTieneElJugador[i][0].palo + " " + 
            mazos.cartasQueTieneElJugador[i][0].numero);
            carta1 [i].setMinSize(TAM_X, TAM_Y);
            VistaDeLasCartas vista1 = new VistaDeLasCartas(mazos.cartasQueTieneElJugador[i][0]);
            this.paneCartasJugador1.getChildren().add(vista1);
        }
    this.paneCartasJugador1.setAlignment(Pos.CENTER_LEFT);
    this.paneCartasJugador1.setMaxWidth(TAM_X);
    this.paneCartasJugador1.setMaxHeight(TAM_Y);
    this.paneCartasJugador1.setMinWidth(TAM_X);
    this.paneCartasJugador1.setMinHeight(TAM_Y);
    mostrarVistaJugador();
    }
    /**
     * Metodo que va a mostrar que ve el jugador en pantalla
     */
    public void mostrarVistaJugador(){
        hboxCartaPersonajeJugador = new HBox();
        hboxCartaPersonajeJugador.setPrefWidth(TAM_X);
        hboxCartaPersonajeJugador.setPrefHeight(TAM_Y);
        hboxCartaPersonajeJugador.setMinWidth(TAM_X);
        hboxCartaPersonajeJugador.setMinHeight(TAM_Y);
        hboxCartaPersonajeJugador.setAlignment(Pos.CENTER_LEFT);
        hboxCartaPersonajeJugador.setSpacing(0);
        hboxCartaPersonajeJugador.setStyle("-fx-border-color: white");
        this.hboxCartaPersonajeJugador.getChildren().add(jugador);
        hboxCartaPersonajeJugador.getChildren().add(paneCartasJugador1);
        this.getChildren().add(hboxCartaPersonajeJugador);
        robarCarta = new Button("Robar");
        robarCarta.setMinSize(60, 40);
        tablero.setTop(robarCarta);
        robarCarta.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                mazos.cogerCarta(0);
                carta1 [5] = new Label(mazos.cartasQueTieneElJugador[5][0].nombre + " " + 
                mazos.cartasQueTieneElJugador[5][0].accion + " " + mazos.cartasQueTieneElJugador[5][0].palo + " " + 
                mazos.cartasQueTieneElJugador[5][0].numero);
                carta1 [5].setMinSize(TAM_X, TAM_Y);
                paneCartasJugador1.getChildren().add(carta1 [5]);
                carta1 [6] = new Label(mazos.cartasQueTieneElJugador[6][0].nombre + " " + 
                mazos.cartasQueTieneElJugador[6][0].accion + " " + mazos.cartasQueTieneElJugador[6][0].palo + " " + 
                mazos.cartasQueTieneElJugador[6][0].numero);
                carta1 [6].setMinSize(TAM_X, TAM_Y);
                paneCartasJugador1.getChildren().add(carta1 [6]);
            }
        });
        
        this.mouseController();
    }
    /**
     * Metodo para el control del ratón
     */
    private void mouseController() {
        paneCartasJugador1.setOnMouseClicked((MouseEvent mouseEvent) -> {
        System.out.println("X: " + mouseEvent.getX() + ", Y: "+ mouseEvent.getY() );
        int colClic = (int)(mouseEvent.getX() / TAM_X);
        System.out.println("Col: " + colClic );
        mazos.mazoDescartes [0] = mazos.cartasQueTieneElJugador [colClic][0];
        mazos.cartasQueTieneElJugador [colClic][0] = null;
        this.paneCartasJugador1.getChildren().remove(carta1[colClic]);
        int cuantasCartas = mazos.cartasQueTieneElJugador.length;
        /**for (i = colClic; i < cuantasCartas; i){
        }*/
        });
    }
}