package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Cubo;

public class TestCubo {

	public static void main(String[] args) {
		
		Cubo cubo = new Cubo(5.3);
		
		// Superficie cara
		System.out.println("La superficie de la cara del cubo es: " + cubo.getSuperficieCara());
		
		// Volumen cubo
		System.out.println("El volumen del cubo es: " + cubo.getVolumen());
	}

}
