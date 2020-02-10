package application;

import application.figura2D.Circulo;
import application.figura2D.Quadrado;
import application.figura2D.Triangulo;
import application.figura3D.Cilindro;
import application.figura3D.Cubo;
import application.figura3D.Piramide;

public class Main {

	public static void main(String[] args) {
		// Declarando Objetos Figura
		Quadrado f1 = new Quadrado();
		f1.setLado(2);
		f1.setNome("Quadrado");

		Circulo f2 = new Circulo();
		f2.setRaio(2);
		f2.setNome("Circulo");

		Triangulo f3 = new Triangulo();
		f3.setAltura(2);
		f3.setBase(3);
		f3.setNome("Triangulo");

		Cubo f4 = new Cubo();
		f4.setLado(3);
		f4.setNome("Cubo");

		Cilindro f5 = new Cilindro();
		f5.setAltura(3);
		f5.setRaio(2);
		f5.setNome("Cilindro");

		Piramide f6 = new Piramide();
		f6.setAltura(3);
		f6.setApotema(4);
		f6.setArestaBase(2);
		f6.setArestaBase(4);
		f6.setBase(f1);
		f6.setNome("Piramide");

		// Array de Figuras
		FiguraGeometrica[] figuras = new FiguraGeometrica[9];
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		figuras[5] = f6;
		figuras[6] = f6;
		figuras[7] = f6;
		figuras[8] = f6;

		// Imprimindo
		for (FiguraGeometrica index : figuras) {
			System.out.println("----------------");
			System.out.println(index.getNome());

			if (index instanceof Figura2D) {
				Figura2D f2d = (Figura2D) index;
				System.out.println("Area: " + f2d.calcularArea());
			}

			if (index instanceof Figura3D) {
				Figura3D f3d = (Figura3D) index;
				System.out.println("Area: " + f3d.calcularArea());
				System.out.println("Volume: " + f3d.calcularVolume());
			}

		}

	}

}
