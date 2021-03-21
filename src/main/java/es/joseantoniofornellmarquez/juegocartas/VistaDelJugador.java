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

/**
 * Clase para la parte visual del jugador y el juego
 * @author 1DAW09
 */
public class VistaDelJugador extends StackPane{
    // Declaracacion de los Hbox que va a llevar la parte visual del jugador
    HBox paneCartasJugador1 = new HBox();
    HBox hboxCartaPersonajeJugador;
    //Variable mazos de la clase mazos
    Mazos mazos;
    //Variable para el label que va a decir que personaje ha tocado al jugador
    Label jugador;
    //Array de la clase Vista de las cartas
    VistaDeLasCartas [] cartas;
    //Constantes con el tamaño de las cartas y sus hbox
    final int TAM_X = 100;
    final int TAM_Y = 180;
    //Declaracion del boton para robar
    Button robarCarta;
    //Variable del tablero
    BorderPane tablero;
    //Cartas que el jugador va a tener inicialmente
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
        cartas = new VistaDeLasCartas [mazos.CARTASDELCENTRO];
        jugador = new Label(mazos.repartoPersonajes[0].nombre + "\n " + 
        mazos.repartoPersonajes[0].rol + " " );
        jugador.setMaxSize(TAM_X, TAM_Y);
        jugador.setAlignment(Pos.CENTER_LEFT);
        for (int i = 0; i < cartasDelJugador ; i++){
            cartas [i] = new VistaDeLasCartas(mazos.cartasQueTieneElJugador[i][0]);
            this.paneCartasJugador1.getChildren().add(cartas[i]);
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
                cartas [5] = new VistaDeLasCartas(mazos.cartasQueTieneElJugador[5][0]);
                cartas [5].setMinSize(TAM_X, TAM_Y);
                paneCartasJugador1.getChildren().add(cartas [5]);
                cartas [6] = new VistaDeLasCartas(mazos.cartasQueTieneElJugador[6][0]);
                cartas [6].setMinSize(TAM_X, TAM_Y);
                paneCartasJugador1.getChildren().add(cartas [6]);
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
        this.paneCartasJugador1.getChildren().remove(cartas[colClic]);
        });
    }
}