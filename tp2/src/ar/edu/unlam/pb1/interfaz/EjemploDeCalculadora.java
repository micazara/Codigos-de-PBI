package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.Calculadora;

public class EjemploDeCalculadora {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Calculadora casio = new Calculadora(5.0, 3.0);
		Calculadora calculadoraDelCelular = new Calculadora();

		// MENSAJE BIENVENIDA Y SELECCIÓN DE OBJETO
		System.out.println("Bienvenido al programa calculadora, ¿que calculadora desea usar?");
		System.out.println("\nSelecione 1 para usar la casio" + "\nSelecciona 2 para usar la Calculadora del Celular");
		// MÉTODO SELECCIÓN DE OBJETO
		int numeroTecla;
		numeroTecla = teclado.nextInt();

		switch (numeroTecla) {

		case 1:
			EjemploDeCalculadora.usarCasio(casio);

		case 2:
			EjemploDeCalculadora.usarCalculadoraCelular(calculadoraDelCelular);
		}

	}

	// métodosdelmenu

// Calculadora del celular 
	private static void usarCalculadoraCelular(Calculadora calculadoraDelCelular) {
		int opcion = 0;

		do {
			mostrarMenuCalculadoraDelCelular();
			opcion = teclado.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("Ingrese el numero 1: ");
				double numero1 = teclado.nextDouble();
				System.out.println("Ingrese el numero 2: ");
				double numero2 = teclado.nextDouble();
				System.out.println("\nLa calculadora del celular realiza esta suma: ");
				calculadoraDelCelular.sumar(numero1, numero2);
				System.out.println(calculadoraDelCelular.mostrarSuma());
				System.out.println(calculadoraDelCelular.esPositivo());
				break;

			case 2:
				System.out.println("Ingrese el numero 1: ");
				double primerNumero = teclado.nextDouble();
				System.out.println("Ingrese el numero 2: ");
				double segundoNumero = teclado.nextDouble();
				System.out.println("\nLa calculadora del celular realiza esta resta: ");
				calculadoraDelCelular.restar(primerNumero, segundoNumero);
				System.out.println(calculadoraDelCelular.mostrarResta());
				System.out.println(calculadoraDelCelular.esPositivo());
				break;

			case 3:
				System.out.println("Ingrese el numero 1: ");
				double numberOne = teclado.nextDouble();
				System.out.println("Ingrese el numero 2: ");
				double numberTwo = teclado.nextDouble();
				System.out.println("\nLa calculadora del celular realiza esta multiplicacion: ");
				calculadoraDelCelular.multiplicar(numberOne, numberTwo);
				System.out.println(calculadoraDelCelular.mostrarMultiplicacion());
				System.out.println(calculadoraDelCelular.esPositivo());
				break;

			case 4:
				System.out.println("Ingrese el numero 1: ");
				double numeroUno = teclado.nextDouble();
				System.out.println("Ingrese el numero 2: ");
				double numeroDos = teclado.nextDouble();
				System.out.println("\nLa calculadora del celular realiza esta division: ");
				calculadoraDelCelular.dividir(numeroUno, numeroDos);
				System.out.println(calculadoraDelCelular.mostrarDivision());
				System.out.println(calculadoraDelCelular.esPositivo());
				break;

			}
		} while (opcion != 0);
		teclado.close();
	}

	private static void mostrarMenuCalculadoraDelCelular() {
		System.out.println("\nSeleccione que operacion desea realizar" + "\nSelecione 1 para sumar"
				+ "\nSelecciona 2 para restar" + "\nSelecciona 3 para multiplicar" + "\nSelecciona 4 para dividir"
				+ "\nSelecciona 0 para salir" + "\n............................");
	}

// CASIO
	public static void usarCasio(Calculadora casio) {

		int opcion = 0;

		do {
			mostrarMenuCasio();
			opcion = teclado.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("\nCasio realiza esta suma preestablecida");
				casio.sumar();
				System.out.println(casio.mostrarSuma());
				System.out.println(casio.esPositivo());
				break;

			case 2:
				System.out.println("\nCasio realiza esta resta preestablecida");
				casio.restar();
				System.out.println(casio.mostrarResta());
				System.out.println(casio.esPositivo());
				break;

			case 3:
				System.out.println("\nCasio realiza esta multiplicacion preestablecida");
				casio.multiplicar();
				System.out.println(casio.mostrarMultiplicacion());
				System.out.println(casio.esPositivo());
				break;

			case 4:
				System.out.println("\nCasio realiza esta division preestablecida");
				casio.dividir();
				System.out.println(casio.mostrarDivision());
				System.out.println(casio.esPositivo());
				break;

			case 5:
				System.out.println("Ingrese el radio del circulo:");
				double radio = teclado.nextDouble();
				double pi = Math.PI;
				casio.calcularArea(radio, pi);
				System.out.println("El area del circulo es: " + casio.mostrarArea());
				System.out.println(casio.esPositivo());
				break;

//            	3. Volvé al ejercicio 9 del trabajo práctico 2. ¿Es el resultado obtenido realmente el correcto?
//            	Con los conocimientos que adquiriste, ¿Podrías corregirlo para que funcione
//            	correctamente?

			}
		} while (opcion != 0);
		teclado.close();
	}

	private static void mostrarMenuCasio() {
		System.out.println("\nSeleccione que operacion desea realizar" + "\nSelecione 1 para sumar"
				+ "\nSelecciona 2 para restar" + "\nSelecciona 3 para multiplicar" + "\nSelecciona 4 para dividir"
				+ "\nSelecciona 5 para calcular area del circulo" + "\nSelecciona 0 para salir"
				+ "\n............................");
	}

}
