package es.joseantoniofornellmarquez.juegocartas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
Pane tablero;

    @Override
    public void start(Stage stage) {
        tablero = new Pane();
        var pantalla = new Scene(tablero, 800, 600);
        stage.setScene(pantalla);
        stage.show();
        //LLamada al la creación del mazo central
        CartasCreadas mazo = new CartasCreadas();
        Carta carta;
        carta = mazo.cogerCarta();
        //Mostrar información de la carta cogida
        System.out.println(carta.nombre + "\n" +
        carta.accion + "\n" +
        carta.numero + " " +
        carta.palo);
        CartasCreadas mazo2 = new CartasCreadas();
        Personajes perso;
        perso = mazo2.cogerCartaPersonajes();
        System.out.println(perso.nombre + "\n" + perso.rol);
    }

    public static void main(String[] args) {
        launch();
    }

}