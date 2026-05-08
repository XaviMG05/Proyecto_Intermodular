package modelo;

import java.util.ArrayList;

public class Pregunta {

	private String pregunta;
	private ArrayList<String> opciones;
	private String respuesta;

	public Pregunta(String pregunta, ArrayList<String> opciones, String respuesta) {
		this.pregunta = pregunta;
		this.opciones = opciones;
		this.respuesta = respuesta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public ArrayList<String> getOpciones() {
		return opciones;
	}

	public void setOpciones(ArrayList<String> opciones) {
		this.opciones = opciones;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Override
	public String toString() {
		return "Pregunta [pregunta=" + pregunta + ", opciones=" + opciones + ", respuesta=" + respuesta + "]";
	}

}
