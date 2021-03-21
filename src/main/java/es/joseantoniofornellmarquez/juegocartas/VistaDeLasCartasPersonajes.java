/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author Fornell
 */
public class VistaDeLasCartasPersonajes extends VBox {
    /**
     * 
     * @param personaje 
     */
    public void VistaDeLasCartasPersonajes(Personaje personaje){
        
        Rectangle superior =  new Rectangle(100, 160);
        StackPane panelCartaPersonaje = new StackPane();
        superior.setFill(Color.rgb(255, 255, 255, 0.90));
        superior.setStroke(Color.rgb(0, 0, 0, 0.90));
        superior.setStrokeWidth(1.5);
        superior.setTranslateX(10);
        superior.setTranslateY(10);
        superior.setArcWidth(25);
        superior.setArcHeight(25);
        Text textPersonaje = new Text(personaje.nombre);
        textPersonaje.setLayoutY(0);
        textPersonaje.setLayoutX(10);
        textPersonaje.setFill(Color.web("FA2C2C"));
        textPersonaje.setStroke(Color.web("FA2C2C"));
        textPersonaje.setFont(Font.font("Aparajita", FontWeight.BOLD, 12));
        panelCartaPersonaje.getChildren().add(superior);
        panelCartaPersonaje.getChildren().add(textPersonaje);
        this.getChildren().add(panelCartaPersonaje);
    }
}
