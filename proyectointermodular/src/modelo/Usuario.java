package modelo;

public class Usuario {

	private String nombre;
	private String respuesta;

	public Usuario(String nombre, String respuesta) {
		this.nombre = nombre;
		this.respuesta = respuesta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", respuesta=" + respuesta + "]";
	}

}
