package application.figura2D;

import application.Figura2D;

public class Quadrado extends Figura2D {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

}
