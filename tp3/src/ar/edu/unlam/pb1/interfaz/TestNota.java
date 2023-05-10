package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.Promedio;

public class TestNota {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Promedio prom = new Promedio();

		mostrarMensaje("Este programa calcula el promedio de dos notas.");

		mostrarMensaje("\nIngrese la primer nota: ");
		double nota1 = teclado.nextDouble();

		mostrarMensaje("Ingrese la segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		System.out.println("El promedio es: " + prom.promediar(nota1, nota2));
		
		
	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
