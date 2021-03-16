
package es.joseantoniofornellmarquez.juegocartas;

import java.util.Random;

/**
 * Clase Mazos donde se realiza la lógica del juego
 * @author 1DAW09
 */
public class Mazos{
    //Variables jugadores
    int jugadores;
    //Variable para la cantidad de cartas del mazo central
    final int  CARTASDELCENTRO = 80;
    //Array del mazo central
    Carta [] mazoCentral = new Carta [CARTASDELCENTRO];
    Personaje [] mazoPersonajes;
    //Array para repartir los personajes
    Personaje [] repartoPersonajes;
    //Array para repartir las cartas del centro
    Carta [] [] cartasQueTieneElJugador;
    //Variable que cuenta las cartas que se han dado
    int contadorCartas = 0;
    //Personajes del juego
    Personaje capitan;
    Personaje ayudante1;
    Personaje ayudante2;
    Personaje asesino1;
    Personaje asesino2;
    Personaje asesino3;
    Personaje espia;
    //Contador de turno
    int turnoActual = 0;
    /**
     * Metodo para crear cartas
     * @param numJugadores Número de jugadores que van a jugar
     */
    public Mazos(int numJugadores){
        jugadores = numJugadores;
        //Array del mazo de personajes
        mazoPersonajes = new Personaje[jugadores];
        //Cartas del mazo central
        this.mazoCentral [0] = new Carta("Shot",12, "Pierde una vida","Rombos");
        this.mazoCentral [1] = new Carta("Shot",10, "Pierde una vida","Rombos");
        this.mazoCentral [2] = new Carta("Shot",3, "Pierde una vida","Rombos");
        this.mazoCentral [3] = new Carta("Shot",6, "Pierde una vida","Rombos");
        this.mazoCentral [4] = new Carta("Shot",1, "Pierde una vida","Rombos");
        this.mazoCentral [5] = new Carta("Shot",5, "Pierde una vida","Rombos");
        this.mazoCentral [6] = new Carta("Shot",8, "Pierde una vida","Rombos");
        this.mazoCentral [7] = new Carta("Shot",13, "Pierde una vida","Rombos");
        this.mazoCentral [8] = new Carta("Shot",9, "Pierde una vida","Rombos");
        this.mazoCentral [9] = new Carta("Shot",2, "Pierde una vida","Rombos");
        this.mazoCentral [10] = new Carta("Shot",11, "Pierde una vida","Rombos");
        this.mazoCentral [11] = new Carta("Shot",4, "Pierde una vida","Rombos");
        this.mazoCentral [12] = new Carta("Shot",7, "Pierde una vida","Rombos");
        this.mazoCentral [13] = new Carta("Shot",1, "Pierde una vida","Corazones");
        this.mazoCentral [14] = new Carta("Shot",13, "Pierde una vida","Corazones");
        this.mazoCentral [15] = new Carta("Shot",12, "Pierde una vida","Corazones");
        this.mazoCentral [16] = new Carta("Shot",3, "Pierde una vida","Treboles");
        this.mazoCentral [17] = new Carta("Shot",2, "Pierde una vida","Treboles");
        this.mazoCentral [18] = new Carta("Shot",4, "Pierde una vida","Treboles");
        this.mazoCentral [19] = new Carta("Shot",5, "Pierde una vida","Treboles");
        this.mazoCentral [20] = new Carta("Shot",9, "Pierde una vida","Treboles");
        this.mazoCentral [21] = new Carta("Shot",6, "Pierde una vida","Treboles");
        this.mazoCentral [22] = new Carta("Shot",7, "Pierde una vida","Treboles");
        this.mazoCentral [23] = new Carta("Shot",8, "Pierde una vida","Treboles");
        this.mazoCentral [24] = new Carta("Shot",1, "Pierde una vida","Picas");
        this.mazoCentral [25] = new Carta("Esquivas",13, "Esquivas un shot","Treboles");
        this.mazoCentral [26] = new Carta("Esquivas",12, "Esquivas un shot","Treboles");
        this.mazoCentral [27] = new Carta("Esquivas",11, "Esquivas un shot","Treboles");
        this.mazoCentral [28] = new Carta("Esquivas",10, "Esquivas un shot","Treboles");
        this.mazoCentral [29] = new Carta("Esquivas",1, "Esquivas un shot","Treboles");
        this.mazoCentral [30] = new Carta("Esquivas",8, "Esquivas un shot","Picas");
        this.mazoCentral [31] = new Carta("Esquivas",2, "Esquivas un shot","Picas");
        this.mazoCentral [32] = new Carta("Esquivas",5, "Esquivas un shot","Picas");
        this.mazoCentral [33] = new Carta("Esquivas",7, "Esquivas un shot","Picas");
        this.mazoCentral [34] = new Carta("Esquivas",3, "Esquivas un shot","Picas");
        this.mazoCentral [35] = new Carta("Esquivas",4, "Esquivas un shot","Picas");
        this.mazoCentral [36] = new Carta("Esquivas",6, "Esquivas un shot","Picas");
        this.mazoCentral [37] = new Carta("Kit Médico",11, "Gana una vida","Corazones");
        this.mazoCentral [38] = new Carta("Kit Médico",7, "Gana una vida","Corazones");
        this.mazoCentral [39] = new Carta("Kit Médico",9, "Gana una vida","Corazones");
        this.mazoCentral [40] = new Carta("Kit Médico",6, "Gana una vida","Corazones");
        this.mazoCentral [41] = new Carta("Kit Médico",10, "Gana una vida","Corazones");
        this.mazoCentral [42] = new Carta("Kit Médico",8, "Gana una vida","Corazones");
        this.mazoCentral [43] = new Carta("Defensa",12, "Roba una carta, si es de corazones esquivas un shot","Picas");
        this.mazoCentral [44] = new Carta("Defensa",13, "Roba una carta, si es de corazones esquivas un shot","Picas");
        this.mazoCentral [45] = new Carta("Mirilla",1, "La distancia de visión se aumenta en 1","Picas");
        this.mazoCentral [46] = new Carta("Rifle Laser",1, "Puedes disparar a 4 de distancia","Treboles");
        this.mazoCentral [47] = new Carta("Fracotirador Laser",8, "Puedes disparar a 5 de distancia","Picas");
        this.mazoCentral [48] = new Carta("Pistola Laser",12, "Puedes disparar a 2 de distancia","Treboles");
        this.mazoCentral [49] = new Carta("Pistola Laser",11, "Puedes disparar a 2 de distancia","Treboles");
        this.mazoCentral [50] = new Carta("Pistola Laser",13, "Puedes disparar a 2 de distancia","Picas");
        this.mazoCentral [51] = new Carta("Revolver Laser",13, "Puedes disparar a 3 de distancia","Treboles");
        this.mazoCentral [52] = new Carta("Metralleta Laser",10, "Puedes disparar a 1 de distancia, todos los shot que quieras","Treboles");
        this.mazoCentral [53] = new Carta("Metralleta Laser",10, "Puedes disparar a 1 de distancia, todos los shot que quieras","Picas");
        this.mazoCentral [54] = new Carta("Arresto",10, "Pierdes el turno. Si robas una carta de corazones te libras","Picas");
        this.mazoCentral [55] = new Carta("Arresto",11, "Pierdes el turno. Si robas una carta de corazones te libras","Picas");
        this.mazoCentral [56] = new Carta("Arresto",4, "Pierdes el turno. Si robas una carta de corazones te libras","Corazones");
        this.mazoCentral [57] = new Carta("Suerte",9, "Puedes robar 2 cartas","Picas");
        this.mazoCentral [58] = new Carta("Suerte",9, "Puedes robar 2 cartas","Picas");
        this.mazoCentral [59] = new Carta("Cara a Cara",11, "Descartais shots, el primero que se quede sin ellos pierde una vida","Picas");
        this.mazoCentral [60] = new Carta("Cara a Cara",12, "Descartais shots, el primero que se quede sin ellos pierde una vida","Rombos");
        this.mazoCentral [61] = new Carta("Cara a Cara",8, "Descartais shots, el primero que se quede sin ellos pierde una vida","Treboles");
        this.mazoCentral [62] = new Carta("Aliens",13, "Todos los demas descartan un shot, si no pierden una vida","Rombos");
        this.mazoCentral [63] = new Carta("Aliens",1, "Todos los demas descartan un shot, si no pierden una vida","Rombos");
        this.mazoCentral [64] = new Carta("Descarte",13, "Haces que un jugador descarte una de sus cartas de la mesa","Corazones");
        this.mazoCentral [65] = new Carta("Descarte",9, "Haces que un jugador descarte una de sus cartas de la mesa","Rombos");
        this.mazoCentral [66] = new Carta("Descarte",11, "Haces que un jugador descarte una de sus cartas de la mesa","Rombos");
        this.mazoCentral [67] = new Carta("Descarte",10, "Haces que un jugador descarte una de sus cartas de la mesa","Rombos");
        this.mazoCentral [68] = new Carta("Bomba",2, "Robas una carta si es del 2 al 9 de picas pierdes 3 puntos de vida, si no pasa al siguente jugador","Corazones");
        this.mazoCentral [69] = new Carta("Torreta Laser",10, "Disparas 1 shot a todos los demas jugadores","Corazones");
        this.mazoCentral [70] = new Carta("Escudo",9, "Aumentas la distancia que te ven en 1","Corazones");
        this.mazoCentral [71] = new Carta("Escudo",8, "Aumentas la distancia que te ven en 1","Corazones");
        this.mazoCentral [72] = new Carta("Ruleta",9, "Todos los jugadores roban una carta","Treboles");
        this.mazoCentral [73] = new Carta("Ruelta",12, "Todos los jugadores roban una carta","Picas");
        this.mazoCentral [74] = new Carta("Hospital",5, "Todos los jugadores reciben una vida","Corazones");
        this.mazoCentral [75] = new Carta("Fortuna",3, "Robas 3 cartas","Corazones");
        this.mazoCentral [76] = new Carta("Miedo",12, "Robas una carta de la mano de un jugador","Corazones");
        this.mazoCentral [77] = new Carta("Miedo",11, "Robas una carta de la mano de un jugador","Corazones");
        this.mazoCentral [78] = new Carta("Miedo",1, "Robas una carta de la mano de un jugador","Corazones");
        this.mazoCentral [79] = new Carta("Miedo",8, "Robas una carta de la mano de un jugador","Rombos");
        //Cartas del mazo de personajes
        capitan = new Personaje("Capitán","Ha de sobrevivir toda la partida y encontrar a los asesinos y al espia");
        ayudante1 = new Personaje("Ayudante","Ha ayudar al capitan a encontrar a los asesinos y al espia");
        ayudante2 = new Personaje("Ayudante","Ha ayudar al capitan a encontrar a los asesinos y al espia");
        asesino1 = new Personaje("Asesino","Ha de matar al capitan");
        asesino2 = new Personaje("Asesino","Ha de matar al capitan");
        asesino3 = new Personaje("Asesino","Ha de matar al capitan");
        espia = new Personaje("Espia","Ha de quedarse solo con el capitán y matarlo");
        mazoPersonajes [0] = capitan;
        mazoPersonajes [1] = asesino1;
        mazoPersonajes [2] = asesino2;
        mazoPersonajes [3] = espia;
        if(jugadores >= 5){
           mazoPersonajes [4] = ayudante1;
        }
        if (jugadores >= 6){
            mazoPersonajes [5] = asesino3;
        }
        if (jugadores >= 7){
            mazoPersonajes [6] = ayudante2;
        }
    }
    /**
     * Metodo para repartir los personajes a los jugadores
     */
    public void repartirPersonajes(){
        repartoPersonajes = new Personaje[jugadores];
        barajarMazoPersonaje();
        for (int i= 0; i <= jugadores-1; i++){
            repartoPersonajes [i] = mazoPersonajes [i];
        }
    }
    /**
     * Metodo para repartir cartas del centro
     */
    public void repartirCartasCentro(){
        cartasQueTieneElJugador = new Carta [10][jugadores];
        barajarMazoCentro();
        for (int i= 0; i <= jugadores -1; i++){
            for (int e= 0; e <= 4 ; e++){
                cartasQueTieneElJugador [e][i] = mazoCentral [contadorCartas];
                contadorCartas++;
            } 
        }
        System.out.println(contadorCartas);
    }
    /**
     * Metodo para coger y mostrar una carta aleatoria del mazo central y mostrarlo
     */
    //Variables para saber las cartas que tiene que robar cada jugador
    int cartasQueRobar = 2;
    int numJugador;
    public void cogerCarta(int numJugador){
        this.numJugador = numJugador;
        for (int i= 0; i <= cartasQueRobar -1; i++){
            cartasQueTieneElJugador[mazoPersonajes[numJugador].vidas+i][numJugador] = mazoCentral[contadorCartas];
            contadorCartas++;
            System.out.println(contadorCartas);
        }
        System.out.println(cartasQueRobar);
    }
    public void jugarCarta(){
        Carta [] mazoDescartes = new Carta [CARTASDELCENTRO];
        mazoDescartes [0] = cartasQueTieneElJugador [0][0];
        
    }
    /**
     * Metodo para barajar las cartas de los personajes
     */
    public void barajarMazoPersonaje(){
        for (int i = 0; i<= 100; i++){
            int num1 = getNumAleatorio(0, jugadores-1);
            int num2 = getNumAleatorio(0, jugadores-1);
            Personaje carta1 = mazoPersonajes[num1];
            Personaje carta2 = mazoPersonajes[num2];
            mazoPersonajes[num2] = carta1;
            mazoPersonajes[num1] = carta2;
        }
    }
    /**
     * Metodo para barajar las cartas de centro
     */
    public void barajarMazoCentro(){
        for (int i = 0; i<= 200; i++){
            int num1 = getNumAleatorio(0, CARTASDELCENTRO-1);
            int num2 = getNumAleatorio(0, CARTASDELCENTRO-1);
            Carta carta1 = mazoCentral[num1];
            Carta carta2 = mazoCentral[num2];
            mazoCentral[num2] = carta1;
            mazoCentral[num1] = carta2;
        }
    }
    /**
     * Metodo para generar números aleatorios
     * @param min número minimo
     * @param max número maximo
     * @return devuelve el número
     */
    public int getNumAleatorio(int min, int max){
        Random random = new Random();
        int num = random.nextInt(max-min+1) + min;
        return num;
    }
}
