package es.joseantoniofornellmarquez.juegocartas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
BorderPane tablero;
StackPane parteDeAbajo;
    @Override
    public void start(Stage stage) {
        tablero = new BorderPane();
        parteDeAbajo = new StackPane();
        var pantalla = new Scene(tablero, 800, 600);
        stage.setScene(pantalla);
        stage.show();
        Mazos mazo = new Mazos(6);
        mazo.barajarMazoPersonaje();
        mazo.barajarMazoCentro();
        mazo.cogerCarta();
        mazo.cogerCartaPersonajes();
        //mazo.repartirPersonajes();
        
        VistaDelJugador visionJugador = new VistaDelJugador(mazo);
        tablero.setBottom(visionJugador);
    }

    public static void main(String[] args) {
        launch();
    }

}