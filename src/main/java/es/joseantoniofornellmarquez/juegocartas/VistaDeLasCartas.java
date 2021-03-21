/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author 1DAW09
 */
public class VistaDeLasCartas extends VBox{
    /**
     * Metodo constructor para el diseño y creación de la visualización de las cartas
     * @param carta 
     */
    public VistaDeLasCartas(Carta carta){
        Rectangle superior =  new Rectangle(100, 160);
        StackPane panelCarta = new StackPane();
        superior.setFill(Color.rgb(255, 255, 255, 0.90));
        superior.setStroke(Color.rgb(0, 0, 0, 0.90));
        superior.setStrokeWidth(1.5);
        superior.setTranslateX(10);
        superior.setTranslateY(10);
        superior.setArcWidth(25);
        superior.setArcHeight(25);
        Text textNombre = new Text(carta.nombre);
        Text textAccion = new Text(carta.accion);
        Text textPalo = new Text(carta.palo);
        Text textNumero = new Text(Integer.toString(carta.numero));
        textNombre.setLayoutY(0);
        textNombre.setLayoutX(10);
        textNombre.setFill(Color.web("FA2C2C"));
        textNombre.setStroke(Color.web("FA2C2C"));
        textNombre.setFont(Font.font("Aparajita", FontWeight.BOLD, 12));
        textAccion.setY(30);
        textAccion.setX(20);
        textAccion.setFill(Color.web("FA2C2C"));
        textAccion.setStroke(Color.web("FA2C2C"));
        textAccion.setFont(Font.font("Aparajita", FontWeight.BOLD, 12));
        textPalo.setY(40);
        textPalo.setX(20);
        textPalo.setFill(Color.web("FA2C2C"));
        textPalo.setStroke(Color.web("FA2C2C"));
        textPalo.setFont(Font.font("Aparajita", FontWeight.BOLD, 12));
        textNumero.setY(50);
        textNumero.setX(20);
        textNumero.setFill(Color.web("FA2C2C"));
        textNumero.setStroke(Color.web("FA2C2C"));
        textNumero.setFont(Font.font("Aparajita", FontWeight.BOLD, 12));
        panelCarta.getChildren().add(superior);
        panelCarta.getChildren().add(textNombre);
        //panelCarta.getChildren().add(textAccion);
        //panelCarta.getChildren().add(textPalo);
        //panelCarta.getChildren().add(textNumero);
        this.getChildren().add(panelCarta);
    }
    
    
}
