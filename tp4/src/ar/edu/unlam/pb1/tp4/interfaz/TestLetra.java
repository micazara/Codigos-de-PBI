package ar.edu.unlam.pb1.tp4.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.tp4.dominio.Letra;

public class TestLetra {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {

		Letra letra = new Letra ();
		
		System.out.println("Este programa evalua si una letra es vocal o no. "
				+ "Ingrese una letra: ");
		
		char letraIngresada = teclado.next().charAt(0);
		
		System.out.println("La letra ingresada es una vocal: " + letra.esVocal(letraIngresada));
		
		

	}

}
