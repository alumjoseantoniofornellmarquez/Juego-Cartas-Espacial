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
        
        this.tablero = tablero;
        this.mazos = mazos;
        this.gridCartasJugador1.setStyle("-fx-grid-lines-visible: true");
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
            this.gridCartasJugador1.add(carta1 [i], i, 0);
        }
    this.gridCartasJugador1.setAlignment(Pos.CENTER_LEFT);
    this.gridCartasJugador1.setMaxWidth(TAM_X);
    this.gridCartasJugador1.setMaxHeight(TAM_Y);
    this.gridCartasJugador1.setMinWidth(TAM_X);
    this.gridCartasJugador1.setMinHeight(TAM_Y);
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
        hboxCartaPersonajeJugador.getChildren().add(gridCartasJugador1);
        this.getChildren().add(hboxCartaPersonajeJugador);
        VistaDeLasCartas vista1 = new VistaDeLasCartas(mazos);
        hboxCartaPersonajeJugador.getChildren().add(vista1);
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
                gridCartasJugador1.add(carta1 [5], 7, 0);
                carta1 [6] = new Label(mazos.cartasQueTieneElJugador[6][0].nombre + " " + 
                mazos.cartasQueTieneElJugador[6][0].accion + " " + mazos.cartasQueTieneElJugador[6][0].palo + " " + 
                mazos.cartasQueTieneElJugador[6][0].numero);
                carta1 [6].setMinSize(TAM_X, TAM_Y);
                gridCartasJugador1.add(carta1 [6], 8, 0);
            }
        });
        
        this.mouseController();
    }
    /**
     * Metodo para el control del ratón
     */
    private void mouseController() {
        gridCartasJugador1.setOnMouseClicked((MouseEvent mouseEvent) -> {
        System.out.println("X: " + mouseEvent.getX() + ", Y: "+ mouseEvent.getY() );
        int colClic = (int)(mouseEvent.getX() / TAM_X);
        System.out.println("Col: " + colClic );
        mazos.mazoDescartes [0] = mazos.cartasQueTieneElJugador [colClic][0];
        mazos.cartasQueTieneElJugador [colClic][0] = null;
        this.gridCartasJugador1.getChildren().remove(carta1[colClic]);
        int cuantasCartas = mazos.cartasQueTieneElJugador.length;
        /**for (i = colClic; i < cuantasCartas; i){
        }*/
        });
    }
}