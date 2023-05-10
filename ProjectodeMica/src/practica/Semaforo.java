package practica;

import java.util.Scanner;

public class Semaforo {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al semaforo");
	
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese la inicial de un color");
		char letra = '\0';
		letra = teclado.next().charAt(0);
		
		switch(letra) {
		case 'r':
			System.out.println("El semaforo esta en rojo. Pare");
			break;
		case 'a':
			System.out.println("El semaforo esta en amarillo. Atencion");
			break;
		case 'v':
			System.out.println("El semaforo esta en verde. Avance");
			break;
		default:
			System.out.println("Error");
		}
		
	}

}
