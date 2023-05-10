package ar.edu.unlam.pb1.practicaarrays;

import java.util.Scanner;

public class PruebaDeEscritorioArrays {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

//		1. Desarrolla una clase de prueba, que solicite valores enteros a ingresar por teclado. Luego,
//		se debe mostrar por cada posición del array el índice y el número guardado en el mismo.

//		Integer[] enteros = new Integer[5];
//
//		for (int i =3; i>0; i--) {
//			System.out.println("Contando: " + i + " ...");
//		}
//		
//		 for (int indice = 0; indice<enteros.length; indice++) {
//			 System.out.println("\nIngrese un numero entero: ");
//			 enteros[indice] = teclado.nextInt();
//			 System.out.println("En el indice " + indice + " ingreso " + enteros[indice]);
//		 }

//		 verificarSiSeLlenoCorrectamente

//		2. Desarrolla una clase de prueba, que solicite que se ingrese por teclado el tamaño de un
//		array. Luego, se debe rellenar con números aleatorios (enteros positivos) cada posición de
//		éste. Para finalizar se debe mostrar el índice, el número calculado y el promedio de todos
//		los números ingresados.
//		Integer largoVector;
//		Integer sumaTotalNumeros = 0;
//
//		System.out.println("Ingrese la dimension del array");
//		int dimension = teclado.nextInt();
//
//		Integer[] numerosEnteros = new Integer[dimension];
//
//		for (int indice = 0; indice < numerosEnteros.length; indice++) {
//			numerosEnteros[indice] = (int) Math.round(Math.random() * 100);
//			System.out.println(indice + ": " + numerosEnteros[indice]);
//			sumaTotalNumeros += numerosEnteros[indice];
//		}
//		
//		System.out.println("El promedio de los numeros ingresados es: "
//				+ sacarPromedioIngresadosEnElArray(dimension, sumaTotalNumeros));

//		3. Desarrolla un array de caracteres que contenga las letras de la A a la Z. Se debe solicitar el
//		ingreso de números por teclado. Por cada número ingresado se irá generando un String
//		que contenga la letra asociada a la posición del array asociada al número ingresado. El
//		ingreso de valores finalizará cuando el usuario ingrese -1. Al terminar se debe mostrar la
//		cadena construida.
		
		char [] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z'};
	
		System.out.println("Ingrese un numero: ");
		int numeroIngresado = teclado.nextInt();
		
		for (int i = 0; i < abecedario.length; i++) {
			if (numeroIngresado == i) {
				System.out.println("El contenido del indice es: " + abecedario[i]);
			} 
		}
		
	}

	private static Integer sacarPromedioIngresadosEnElArray(int dimension, Integer sumaTotalNumeros) {
		Integer promedio = sumaTotalNumeros / dimension;
		return promedio;
	}
}
