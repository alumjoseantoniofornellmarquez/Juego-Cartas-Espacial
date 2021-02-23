package es.joseantoniofornellmarquez.juegocartas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
BorderPane tablero;

    @Override
    public void start(Stage stage) {
        tablero = new BorderPane();
        var pantalla = new Scene(tablero, 800, 600);
        stage.setScene(pantalla);
        stage.show();
        Mazos mazo = new Mazos();
        mazo.barajarMazoPersonaje();
        mazo.barajarMazoCentro();
        mazo.cogerCarta();
        mazo.cogerCartaPersonajes();
        
        ParteGrafica partegrafica = new ParteGrafica(mazo);
        tablero.setCenter(partegrafica);
        
    }

    public static void main(String[] args) {
        launch();
    }

}