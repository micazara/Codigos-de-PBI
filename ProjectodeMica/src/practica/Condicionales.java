package practica;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
//		Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
		
		System.out.println("Ingrese un numero entero");
		int numero = 0;
		Scanner teclado = new Scanner (System.in);
		numero = teclado.nextInt();
		
		
		if (numero%10==0) {
			System.out.println("El numero es multiplo de 10");	
		} else {
			System.out.println("El numero no es multiplo de 10");
		}
		
	}

}
