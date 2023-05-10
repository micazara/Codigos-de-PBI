package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

public class TestMath {

	public static void main(String[] args) {
		
//		13. Explica los siguientes métodos de la clase Math:
//			a. pow(double a, double b)
//			b. random()
//			c. sqrt(double a); 
		
//		Scanner teclado =  new Scanner (System.in);
//		System.out.println("Ingrese un numero: ");
//		double numero;
//		numero = teclado.nextDouble();
		
		// pow
		double potencia = Math.pow(5, 2);
		System.out.println(potencia);
		
		// random
		double random = Math.random();
		System.out.println(random);
		
		// raiz cuadrada
		double raiz = Math.sqrt(9);
		System.out.println(raiz);
	}

}
