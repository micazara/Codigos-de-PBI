package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

import ar.edu.unlam.pb1.dominio.CajaFuerte;

public class PruebaCajaFuerte {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		CajaFuerte cajaFuerte = new CajaFuerte();

//		int opcion;
//
//		do {
//
//			mostrarMenuCajaFuerte(); 
//			opcion = teclado.nextInt();
//
//			switch (opcion) {
//			case 1:
//				
//				break;
//			case 2:
//				
//				break;
//			}
//
//		} while (opcion != 0);
		
		// Crear contraseña
		
		mostrarMensaje("Cree su contrasenia: ");

		String contrasenia = teclado.next();

		boolean laContraseniaSeCreo;

		laContraseniaSeCreo = cajaFuerte.crearContrasenia(contrasenia);

		if (laContraseniaSeCreo == true) {
			mostrarMensaje("La contrasenia se creo correctamente. Su contrasenia es: "
					+ cajaFuerte.mostrarContraseniaCreada(contrasenia));
		} else {
			mostrarMensaje("La contrasenia no se creo correctamente. La contrasenia debe tener 4 caracteres");

		}
		
		// Abrir caja fuerte
		
		mostrarMensaje("Para abrir la caja fuerte, ingrese la contrasenia: ");
		
		String contraseniaParaAbrir = teclado.next();

		boolean laCajaSeAbrio = cajaFuerte.abrirCajaFuerte();

		// la contrasenia ingresada deber ser = contrasenia creada para abrir la caja

		if (cajaFuerte.mostrarContraseniaCreada(contrasenia) == contraseniaParaAbrir) {
			cajaFuerte.abrirCajaFuerte();
			if (laCajaSeAbrio) {
				mostrarMensaje("La caja fuerte esta abierta");
			}
		} else {
			mostrarMensaje("No se pudo abrir la caja fuerte");
		}
		
		// Cerrar caja fuerte
		
		do {
		
		if (cajaFuerte.mostrarContraseniaCreada(contrasenia) == contraseniaParaAbrir) {
			cajaFuerte.abrirCajaFuerte();
			if (!laCajaSeAbrio) {
				mostrarMensaje("La caja fuerte esta abierta");
			}
		} else {
			mostrarMensaje("No se pudo abrir la caja fuerte");
		}
		
		} while (laCajaSeAbrio=false);
	}

	private static void mostrarMenuCajaFuerte() {
		mostrarMensaje("Ingrese 1 para abrir la caja fuerte");
		mostrarMensaje("Ingrese 2 para cerrar la caja fuerte");
	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
