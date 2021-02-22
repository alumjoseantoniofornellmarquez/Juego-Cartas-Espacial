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
        Mazos mazo1 = new Mazos();
        Mazos mazo2 = new Mazos();
        mazo2.barajarMazoPersonaje();
        mazo1.barajarMazoCentro();
        mazo1.cogerCarta();
        mazo2.cogerCartaPersonajes();
    }

    public static void main(String[] args) {
        launch();
    }

}