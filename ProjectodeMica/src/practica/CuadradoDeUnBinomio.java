package practica;

import java.util.Scanner;

public class CuadradoDeUnBinomio {

	public static void main(String[] args) {
		
//		(a+b)^2 = a^2 + b^2 + 2ab
		
//		Ingreso de datos por Scanner
		
		double a;
		double b;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese dos numeros");
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		
//		Operaciones
		// a^2
		double aa = Math.pow(a, 2);
		
		// b^2
		double bb = Math.pow(b, 2);
		
		double resultado = aa + bb + (2*a*b);
		
//		Mostrar resultado
		
		System.out.println(resultado);

	}

}
