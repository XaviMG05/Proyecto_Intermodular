package modelo;

public class Ronda {

	private int num;

	public Ronda(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Ronda [num=" + num + "]";
	}

}
