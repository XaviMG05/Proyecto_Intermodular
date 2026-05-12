package comodines;

import javax.swing.JButton;

import main.Juego;
import modelo.Pregunta;

public class Comodin5050 extends Comodin {

	public Comodin5050() {
		super("50%");
	}

	@Override
	public void usarComodin(Juego juego) {
	    if (usado) return;

	    Pregunta p = juego.listaPreguntas.get(juego.indicePregunta);
	    String correcta = p.getRespuesta();

	    JButton[] botones = {
	        juego.Respuesta1,
	        juego.Respuesta2,
	        juego.Respuesta3,
	        juego.Respuesta4
	    };

	    // Guardar botones incorrectos
	    java.util.List<JButton> incorrectas = new java.util.ArrayList<>();

	    for (JButton boton : botones) {
	        if (!boton.getText().equals(correcta)) {
	            incorrectas.add(boton);
	        }
	    }

	    // Mezclar para aleatoriedad
	    java.util.Collections.shuffle(incorrectas);

	    // Deshabilitar 2 (o la mitad)
	    int aEliminar = Math.min(2, incorrectas.size());

	    for (int i = 0; i < aEliminar; i++) {
	        incorrectas.get(i).setEnabled(false);
	    }

	    usado = true;
	}
}
