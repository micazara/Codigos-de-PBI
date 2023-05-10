package practica;

import java.util.Scanner;

public class ContadorDeEdad {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al contador de edad");
		
		Scanner teclado = new Scanner (System.in);
		int añoDeNacimiento = 0;
		System.out.println("Ingrese ano de nacimiento: ");
		añoDeNacimiento = teclado.nextInt();
		

		String nombrePersona;
		System.out.println("Ingrese nombre de persona: ");
		nombrePersona = teclado.next();
		
		int añoActual = 2022;
		
		System.out.println(nombrePersona + " tiene " + (añoActual-añoDeNacimiento) + " anos ");
		
		if (añoActual-añoDeNacimiento<13) {
			System.out.println(nombrePersona + "es niño");
				} if (añoActual-añoDeNacimiento>=13 && añoActual-añoDeNacimiento<18) {
				System.out.println(nombrePersona + "es adolescente");
					} if (añoActual-añoDeNacimiento>=18) {
						System.out.println(nombrePersona + " es adulto");
		
	}

}
}