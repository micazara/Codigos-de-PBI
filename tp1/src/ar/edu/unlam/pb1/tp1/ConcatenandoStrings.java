package ar.edu.unlam.pb1.tp1;

import java.util.Scanner;

public class ConcatenandoStrings {

	public static void main(String[] args) {
		
		String saludo = "Buenos dias";
		
		String nombre; 
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = teclado.next();
		
		
		System.out.println(saludo + ", " + nombre + " <3");

	}

}
