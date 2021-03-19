/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.joseantoniofornellmarquez.juegocartas;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
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

        //Image cartas = new Image(getClass().getResourceAsStream("/images/Carta.png"));
        //ImageView mostrarCartas = new ImageView();
        //this.getChildren().add(mostrarCartas);
        //mostrarCartas.setImage(cartas);
        Group cartas = new Group();
        Group grupoSuperior = new Group();
        Group grupoMedio = new Group();
        Group grupoInferior = new Group();
        Rectangle superior = new Rectangle(100,60);
        Rectangle medio = new Rectangle(100,40);
        Rectangle inferior = new Rectangle(100,100);
        medio.setY(60);
        inferior.setY(100);
        superior.setFill(Color.BLUE);
        superior.setStroke(Color.RED);
        medio.setFill(Color.BLUE);
        medio.setStroke(Color.RED);
        inferior.setFill(Color.BLUE);
        inferior.setStroke(Color.RED);
        superior.setStyle("-fx-border-radius: 50px");
        //this.getChildren().add(cartas);
        //this.setMinWidth(91);
        //this.setMinHeight(128);
        //this.setAlignment(Pos.CENTER);
        //this.setSpacing(150);
        Text textNombre = new Text(carta.nombre);
        Text textAccion = new Text(carta.accion);
        Text textPalo = new Text(carta.palo);
        Text textNumero = new Text(Integer.toString(carta.numero));
        textNombre.setFont(Font.font(12));
        textNombre.setFill(Color.BLACK);
        textAccion.setFont(Font.font(12));
        textAccion.setFill(Color.BLACK);
        textPalo.setFont(Font.font(12));
        textPalo.setFill(Color.BLACK);
        textNumero.setFont(Font.font(12));
        textNumero.setFill(Color.BLACK);
        grupoSuperior.getChildren().add(superior);
        grupoSuperior.getChildren().add(textNombre);
        grupoMedio.getChildren().add(medio);
        grupoMedio.getChildren().add(textPalo);
        grupoMedio.getChildren().add(textNumero);
        grupoInferior.getChildren().add(inferior);
        grupoInferior.getChildren().add(textAccion);
        cartas.getChildren().add(grupoSuperior);
        cartas.getChildren().add(grupoMedio);
        cartas.getChildren().add(grupoInferior);
        this.getChildren().add(cartas);
    }
    
}
