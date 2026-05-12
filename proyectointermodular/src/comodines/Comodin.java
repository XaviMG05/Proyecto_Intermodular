package comodines;

import main.Juego;

public abstract class Comodin {
	protected String nombre;
	protected boolean usado;

	public Comodin(String nombre) {
		this.nombre = nombre;
		this.usado = false;
	}

	public abstract void usarComodin(Juego juego);

	public boolean isUsado() {
		return usado;
	}
}