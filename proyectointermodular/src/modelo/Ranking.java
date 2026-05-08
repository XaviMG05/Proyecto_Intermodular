package modelo;

import java.util.ArrayList;

public class Ranking {

	private ArrayList<String> nombres;
	private int ronda;

	public Ranking(ArrayList<String> nombres, int ronda) {
		this.nombres = nombres;
		this.ronda = ronda;
	}

	public ArrayList<String> getNombres() {
		return nombres;
	}

	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}

	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}

	@Override
	public String toString() {
		return "Ranking [nombres=" + nombres + ", ronda=" + ronda + "]";
	}

}
