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
        var pantalla = new Scene(tablero, 640, 480);
        stage.setScene(pantalla);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}