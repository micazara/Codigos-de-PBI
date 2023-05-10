package practica;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese tres numeros enteros");
		int nota1, nota2, nota3;
		nota1 = teclado.nextInt();
		nota2 = teclado.nextInt();
		nota3 = teclado.nextInt();
		
		int suma = nota1 + nota2 + nota3;
		int promedio = (suma/3);
		System.out.println((double)promedio);


	}

}
