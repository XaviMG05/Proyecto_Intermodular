package comodines;

import javax.swing.JOptionPane;

import main.Juego;
import modelo.Pregunta;

public class ComodinPista extends Comodin {

	public ComodinPista() {
		super("Pista");
	}

	@Override
	public void usarComodin(Juego juego) {
		if(usado) return;
		Pregunta p = juego.listaPreguntas.get(juego.indicePregunta);
		String respuesta = p.getRespuesta();
		char inicial = respuesta.charAt(0);
		JOptionPane.showMessageDialog(null,"La respuesta empieza por: " + inicial);
		usado = true;
	}
}