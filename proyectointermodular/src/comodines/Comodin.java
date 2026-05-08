package comodines;

public abstract class Comodin {

	protected String nombre;
	protected boolean usado;

	public Comodin(String nombre) {
		this.nombre = nombre;
		this.usado = false;
	}

	public abstract void usarComodin();

	@Override
	public String toString() {
		return "Comodin [nombre=" + nombre + ", usado=" + usado + "]";
	}

}
