package application.figura3D;

import application.Figura2D;
import application.Figura3D;

public class Piramide extends Figura3D {

	private double altura;
	private double arestaBase;
	private double apotemaLateral;
	private int numArestas;

	public Figura2D base;

	public static void main(String[] args) {

	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotemaLateral() {
		return apotemaLateral;
	}

	public void setApotema(double apotemaLateral) {
		this.apotemaLateral = apotemaLateral;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	public int getNumArestas() {
		return numArestas;
	}

	public void setNumArestas(int numArestas) {
		this.numArestas = numArestas;
	}

	@Override
	public double calcularArea() {
		if (base != null) {
			double superficieLateral = numArestas * ((arestaBase * apotemaLateral) / 2);
			double areaTotal = base.calcularArea() + superficieLateral;

			return areaTotal;
		}
		return 0;
	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			return (base.calcularArea() * altura) / 3;
		}
		return 0;
	}
}
