package es.joseantoniofornellmarquez.juegocartas;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
BorderPane tablero;
Scene pantalla;
    @Override
    public void start(Stage stage) {
        tablero = new BorderPane();
        pantalla = new Scene(tablero, 800, 600);
        stage.setScene(pantalla);
        stage.show();
        tablero.setBackground(new Background(new BackgroundFill(Color.DARKGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        Mazos mazo = new Mazos(4);
        mazo.barajarMazoPersonaje();
        mazo.barajarMazoCentro();
        mazo.repartirPersonajes();
        mazo.repartirCartasCentro();
        VistaDelJugador visionJugador = new VistaDelJugador(mazo, tablero);
        tablero.setBottom(visionJugador);
    }

    public static void main(String[] args) {
        launch();
    }

}