package ar.edu.unlam.pb1.crush.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.crush.dominio.Calculadora;

public class PruebaCrush {
	
	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Calculadora calculadoraDelAmor = new Calculadora();
		
		System.out.println("------------------<3 Bienvenido a la calculadora del amor <3------------------");
		
		String tuCrush;
		String tuNombre; 
		
		do {

		System.out.println("\nIngresa el nombre de tu crush: " );
		tuCrush = teclado.next();
		
		System.out.println("Ingresa tu nombre: " );
		tuNombre = teclado.next();
		
		int compatibilidad = calculadoraDelAmor.calcularCompatibilidad();
		
		System.out.println(tuCrush + " y " + tuNombre + " tienen " + compatibilidad + "% de compatibilidad");
		
		System.out.println(calculadoraDelAmor.mostrarGradoCompatibilidad(compatibilidad));
		
	}while (tuCrush!=null && tuNombre!=null);
		
		// edad
		// anio
		// signos
		// musica
		
		
//		compAlta
//		compMedia
//		compBaja
//		segun return
		
	}
}
