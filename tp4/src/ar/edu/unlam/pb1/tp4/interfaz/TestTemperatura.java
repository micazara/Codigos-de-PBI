package ar.edu.unlam.pb1.tp4.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.tp4.dominio.Temperatura;

public class TestTemperatura {

	private static final int OPCION_KELVIN = 1;
	private static final int OPCION_FARENHEIT = 2;
	private static final int OPCION_SALIR = 9;

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

//			Desarrolla la clase Temperatura. El valor de la temperatura se almacena internamente en
//			CELSIUS. Pero el usuario debe tener la posibilidad de indicar la unidad que desea enviar, y
//			para el caso que se envíe, el método setValor debe realizar la conversión correspondiente.
//			Luego, puede solicitar el valor en CELSIUS (getValor), o convertir el valor en la unidad que
//			indique a partir del método convertir. (Notar que los atributos constantes CELSIUS,
//			FARENHEIT y KELVIN son públicos para que sea mas sencillo el envío del tipo de unidad en
//			el formato objetoEjemplo.KELVIN).

		Temperatura temperatura = new Temperatura();

		mostrarMensaje("Bienvenido al programa de conversion de temperatura :) "
				+ "\nIngrese los grados Celsius que desea convertir:");

		double celsiusIngresado = teclado.nextDouble();

		mostrarMensaje("Ingreso: " + celsiusIngresado + " grados Celsius");

		int opcion;

		do {

			mostrarMenu();

			opcion = teclado.nextInt();

			switch (opcion) {
			case OPCION_KELVIN:
				mostrarMensaje("Conversion a: Kelvin");
				mostrarMensaje(celsiusIngresado + " a Kelvin es: " + celsiusAKelvin(celsiusIngresado));
				break;

			case OPCION_FARENHEIT:
				mostrarMensaje("Conversion a: Farenheit");
				mostrarMensaje(celsiusIngresado + " a Farenheit es : " + celsiusAFarenheit(celsiusIngresado));
				break;

			case OPCION_SALIR:
				mostrarMensaje("SALIR");
				break;
			}
		} while (opcion != 9);

	}

	private static double celsiusAFarenheit(double celsiusIngresado) {
//		Para convertir de ºC a ºF use la fórmula: ºF = ºC x 1.8 + 32
		double conversionCelsiusAFarenheit = (celsiusIngresado) * 1.8 + 32;
		return conversionCelsiusAFarenheit;
	}

	private static double celsiusAKelvin(double celsiusIngresado) {
//			Para convertir de ºC a K use la fórmula: K = ºC + 273.15.
		double conversionCelsiusAKelvin = celsiusIngresado + 273.15;
		return conversionCelsiusAKelvin;

	}

	private static void mostrarMenu() {
		mostrarMensaje("\nSeleccione a que unidad desea convertir la temperatura ingresada en Celsius: " + "\n1: Kelvin"
				+ "\n2: Farenheit" + "\nSeleccione 9 para salir del menu");

	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);

	}
}
