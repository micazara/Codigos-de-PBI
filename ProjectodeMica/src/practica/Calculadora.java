package practica;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		double num1, num2;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese dos numeros");
		num1 = teclado.nextDouble();
		num2 = teclado.nextDouble();
		
		double suma = num1 + num2;
		double resta = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		double resto = num1 % num2;
		double potencia = Math.pow(num1, num2);
		double raizcuadrada = Math.sqrt(num1);
		double raiz_cuadrada = Math.sqrt(num2);
		double raizcubica = Math.cbrt(num1);
		double raiz_cubica = Math.cbrt(num2);
		
		
		System.out.println(num1 + "+" + num2 + "=" + suma + "\n" +
							num1 + "-" + num2 + "=" + resta + "\n" +
							num1 + "x" + num2 + "=" + mult + "\n" + 
							num1 + ":" + num2 + "=" + div + "\n" + 
							num1 + "%" + num2 + "=" + resto + "\n" +
							num1 + " a la " + num2 + "=" + potencia + "\n" +
							"El cuadrado de " + num1 + " es " + raizcuadrada + "\n" +
							"El cuadrado de " + num2 + " es " + raiz_cuadrada + "\n" + 
							"La raiz cubica de " + num1 + " es " + raizcubica + "\n" + 
							"La raiz cubica de " + num2 + " es " + raiz_cubica + "\n");
							
		
							
						
				 
				 
		
	}

}
