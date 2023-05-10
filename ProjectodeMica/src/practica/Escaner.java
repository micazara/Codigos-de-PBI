package practica;

import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		 
		int a;
		double b;
		short c;
		long d; 
		float e;
		char f;
		
		Scanner teclado = new Scanner (System.in);
		a = teclado.nextInt();
		b = teclado.nextDouble();
		c = teclado.nextShort();
		d = teclado.nextLong();
		e = teclado.nextFloat();
		f = teclado.next().charAt(0);
		
		
		
		
	}

}
