package comodines;

import main.Juego;

public class ComodinSkip extends Comodin {

	public ComodinSkip() {
		super("Skip");
	}

	@Override
	public void usarComodin(Juego juego) {
		if(usado) return;
		juego.indicePregunta++;
		if(juego.indicePregunta < juego.listaPreguntas.size()) {
			juego.mostrarPregunta();
		}
		usado = true;
	}
}