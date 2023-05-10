package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.Ascensor;

public class MainAscensor {

	static Scanner teclado = new Scanner(System.in); // se puede usar en cualquier otro metodo del main al instanciarse
														// aca porque es static

	private static final int OPCION_IR_A_UN_PISO = 1;
	private static final int OPCION_MOSTRAR_PISO_ACTUAL = 2;
	private static final int OPCION_SONAR_ALARMA = 3;
	private static final int OPCION_APAGAR_ALARMA = 4;
	private static final int OPCION_ABRIR_LA_PUERTA = 5;
	private static final int OPCION_CERRAR_LA_PUERTA = 6;
	private static final int OPCION_SALIR = 9;

	public static void main(String[] args) {

		int pisoMaximo = 10;
		int pisoMinimo = -1;
		int pesoMaximo = 200;

		// piso actual interno del ascensor, atributo
		// piso destino: metodo

		Ascensor ascensor = new Ascensor();

		int seleccion;

		do {
			mostrarMenu();
			seleccion = teclado.nextInt();

			switch (seleccion) {
			case OPCION_IR_A_UN_PISO:
				irAUnPiso(ascensor);
				break;
			case OPCION_MOSTRAR_PISO_ACTUAL:
				mostrarPisoActual(ascensor);
				break;
			case OPCION_SONAR_ALARMA:
				encenderAlarma(ascensor);
				break;
			case OPCION_APAGAR_ALARMA:
				apagarAlarma(ascensor);
				break;
			case OPCION_ABRIR_LA_PUERTA:
				abrirPuerta(ascensor);
				break;
			case OPCION_CERRAR_LA_PUERTA:
				cerrarPuerta(ascensor);
				break;
			case OPCION_SALIR:
				break;
			}
		} while (seleccion != OPCION_SALIR);

//		int pisoDeseado = teclado.nextInt();
//		ascensor.irAlPiso(pisoDeseado);

	}

	private static void irAUnPiso(Ascensor ascensor) {
		System.out.println("Ingrese a que piso desea ir: ");
		int pisoDeseado = teclado.nextInt();
		boolean elAscensorSeMovio = ascensor.irAlPiso(pisoDeseado);
		if (elAscensorSeMovio) {
			System.out.println("Piso actual: " + ascensor.mostrarPisoActual());
		} else {
			System.out.println("Ingrese un piso valido");
		}

	}

	private static void mostrarPisoActual(Ascensor ascensor) {
		System.out.println("Piso actual: " + ascensor.mostrarPisoActual());

	}

	private static void encenderAlarma(Ascensor ascensor) {
		ascensor.encenderAlarma();
		boolean alarmaEncendida = ascensor.mostrarEstadoAlarma();
		if (alarmaEncendida) {
			System.out.println("La alarma esta encendida");
		} else {
			System.out.println("No fue posible encender la alarma");
		}
	}

	private static void apagarAlarma(Ascensor ascensor) {
		ascensor.apagarAlarma();
		boolean alarmaEncendida = ascensor.mostrarEstadoAlarma();
		if (!alarmaEncendida) {
			System.out.println("La alarma esta apagada");
		} else {
			System.out.println("No fue posible apagar la alarma");
		}

	}

	private static void abrirPuerta(Ascensor ascensor) {
		ascensor.abrirPuerta();
		boolean laPuertaSeAbrio = ascensor.mostrarEstadoPuerta();
		if (laPuertaSeAbrio) {
			System.out.println("La puerta esta abierta");
		} else {
			System.out.println("No fue posible abrir la puerta");
		}
	}

	private static void cerrarPuerta(Ascensor ascensor) {
		ascensor.cerrarPuerta();
		boolean laPuertaSeAbrio = ascensor.mostrarEstadoPuerta();
		if (!laPuertaSeAbrio) {
			System.out.println("La puerta esta cerrada");
		} else {
			System.out.println("No fue posible cerrar la puerta");
		}
	}

	private static void mostrarMenu() {
		System.out.println("Ingrese 1 para ir a un piso");
		System.out.println("Ingrese 2 para mostrar el piso actual");
		System.out.println("Ingrese 3 para sonar la alarma");
		System.out.println("Ingrese 4 para apagar la alarma");
		System.out.println("Ingrese 5 para abrir la puerta");
		System.out.println("Ingrese 6 para cerrar la puerta");
	}

}
