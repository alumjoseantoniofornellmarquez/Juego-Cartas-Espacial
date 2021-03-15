/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author 1DAW09
 */
public class VistaDeLasCartas extends VBox{
    
    public VistaDeLasCartas(Mazos mazos){

        Image cartas = new Image(getClass().getResourceAsStream("/images/Carta.png"));
        ImageView mostrarCartas = new ImageView();
        this.getChildren().add(mostrarCartas);
        mostrarCartas.setImage(cartas);
        this.setMinWidth(91);
        this.setMinHeight(128);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(150);
        Text textNombre = new Text(mazos.cartasQueTieneElJugador[0][0].nombre);
        Text textAccion = new Text(mazos.cartasQueTieneElJugador[0][0].accion);
        textNombre.setFont(Font.font(12));
        textNombre.setFill(Color.BLACK);
        textAccion.setFont(Font.font(12));
        textAccion.setFill(Color.BLACK);
        this.getChildren().add(textNombre);
        this.getChildren().add(textAccion);
    }
    
}
