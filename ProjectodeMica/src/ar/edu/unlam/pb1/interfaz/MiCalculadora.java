package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.Calculadora;

public class MiCalculadora {

	static Scanner teclado = new Scanner(System.in);

	private static final int OPCION_SUMA = 1;
	private static final int OPCION_RESTA = 2;
	private static final int OPCION_MULTIPLICACION = 3;
	private static final int OPCION_DIVISION = 4;
	private static final int OPCION_RAIZ_CUADRADA = 5;
	private static final int OPCION_RAIZ_CUBICA = 6;
	private static final int OPCION_POTENCIA = 7;
	private static final int OPCION_SALIR = 9;

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		int opcion;

		do {

			mostrarMenu();
			opcion = teclado.nextInt();

			switch (opcion) {

			case OPCION_SUMA:
				mostrarMensaje("Ingrese el operador 1: ");
				double op1 = teclado.nextDouble();
				mostrarMensaje("Ingrese el operador 2: ");
				double op2 = teclado.nextDouble();
				calculadora.sumar(op1, op2);
				mostrarMensaje("La suma es: " + calculadora.mostrarSuma());
				break;

			case OPCION_RESTA:
				mostrarMensaje("Ingrese el operador 1: ");
				double num1 = teclado.nextDouble();
				mostrarMensaje("Ingrese el operador 2: ");
				double num2 = teclado.nextDouble();
				calculadora.restar(num1, num2);
				mostrarMensaje("La resta es: " + calculadora.mostrarResta());
				break;

			case OPCION_MULTIPLICACION:
				mostrarMensaje("Ingrese el operador 1: ");
				double numeroPrimero = teclado.nextDouble();
				mostrarMensaje("Ingrese el operador 2: ");
				double numeroSegundo = teclado.nextDouble();
				calculadora.multiplicar(numeroPrimero, numeroSegundo);
				mostrarMensaje("La multiplicacion es: " + calculadora.mostrarMultiplicacion());
				break;

			case OPCION_DIVISION:
				mostrarMensaje("Ingrese el operador 1: ");
				double primerNumero = teclado.nextDouble();
				mostrarMensaje("Ingrese el operador 2: ");
				double segundoNumero = teclado.nextDouble();
				calculadora.dividir(primerNumero, segundoNumero);
				mostrarMensaje("La division es: " + calculadora.mostrarDivision());
				break;

			case OPCION_RAIZ_CUADRADA:
				mostrarMensaje("Ingrese el radicando: ");
				double radicandoCuadrado = teclado.nextDouble();
				calculadora.raizCuadrada(radicandoCuadrado);
				mostrarMensaje("La raiz es: " + calculadora.mostrarRaizCuadrada());
				break;

			case OPCION_RAIZ_CUBICA:
				mostrarMensaje("Ingrese el radicando: ");
				double radicandoCubico = teclado.nextDouble();
				calculadora.raizCubica(radicandoCubico);
				mostrarMensaje("La raiz es: " + calculadora.mostrarRaizCubica());
				break;

			case OPCION_POTENCIA:
				mostrarMensaje("Ingrese la base: ");
				double base = teclado.nextDouble();
				mostrarMensaje("Ingrese el exponente: ");
				double exponente = teclado.nextDouble();
				calculadora.potencia(base, exponente);
				mostrarMensaje("La potencia es: " + calculadora.mostrarPotencia());
				break;

			case OPCION_SALIR:
				mostrarMensaje("Salir");
				break;
			}
		} while (opcion != 9);

	}

	private static void mostrarMenu() {
		mostrarMensaje("Bienvenido a la calculadora. Seleccione que operacion desea realizar: " + "\n1: suma"
				+ "\n2: resta" + "\n3: multiplicacion" + "\n4: division" + "\n5: raiz cuadrada" + "\n6: raiz cubica"
				+ "\n7: potencia" + "\n9: salir");

	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
