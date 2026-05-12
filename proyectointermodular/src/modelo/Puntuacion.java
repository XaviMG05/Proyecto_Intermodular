package modelo;

public class Puntuacion {

    private String jugador;
    private int preguntasAcertadas;

    public Puntuacion(String jugador, int preguntasAcertadas) {

        this.jugador = jugador;
        this.preguntasAcertadas = preguntasAcertadas;
    }

    public String getJugador() {
        return jugador;
    }

    public int getPreguntasAcertadas() {
        return preguntasAcertadas;
    }
}