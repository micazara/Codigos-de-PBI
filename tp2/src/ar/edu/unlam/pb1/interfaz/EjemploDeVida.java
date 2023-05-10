package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Persona;

public class EjemploDeVida {

	public static void main(String[] args) {
		
		Persona sofia = new Persona("Sofia", "Mujer", 38432153, 2.8, 0.50);

		// Imprimo el objeto. Muestra la direccion de memoria
		System.out.println(sofia);
		
		// Sofia se alimento
		sofia.alimentar(1.0, 2.8);
		
		// Sofia ahora pesa
		System.out.println("Sofia ahora pesa: " + sofia.pesar());
	
		// Sofia crecio
		sofia.crecer(0.5, 0.50);
		
		// Sofia ahora mide
		System.out.println("Sofia ahora mide: " + sofia.medir());
	
		// Sofia cumplio años
		sofia.cumplirAnios(1, 0);
		
		// La edad de Sofia ahora es
		System.out.println("Sofia ahora tiene: " + sofia.mostrarAnios() + " anios");
	
		// Sofia muere
		sofia.morir(9);
		System.out.println(sofia.estaMuerta());
		
	}

}
