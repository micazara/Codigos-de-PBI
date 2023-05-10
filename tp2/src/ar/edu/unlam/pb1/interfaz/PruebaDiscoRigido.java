package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.DiscoRigido;

public class PruebaDiscoRigido {

	public static void main(String[] args) {

//		Crear la clase DiscoRigido que contenga un atributo tamaño y un método que informe
//		cuantos cuántos dvd (4.5GB) equivale dicha capacidad y otro  Crear la clase PruebaDiscoRigido que verifique el
//		correcto funcionamiento para los siguientes ejemplos:
//		a. seagate de 10 TB
//		b. hitachi de 20 TB
//		c. westernDigital de 32 TB
//		d. toshiba de 48 TB

		DiscoRigido seagate = new DiscoRigido(10.0);
		DiscoRigido hitachi = new DiscoRigido(20.0);
		DiscoRigido westernDigital = new DiscoRigido(32.0);
		DiscoRigido toshiba = new DiscoRigido(48.0);

		// metodo que pasa los teras a gigas
		// Seagate
		System.out.println("El tamanio de Seagate en gigas es: " + equivalenciaAGigas(seagate));
		// Hitachi
		System.out.println("\nEl tamanio de Hitachi en gigas es: " + equivalenciaAGigas(hitachi));

		// Western Digital
		System.out.println("\nEl tamanio de Western Digital en gigas es: " + equivalenciaAGigas(westernDigital));

		// Toshiba
		System.out.println("\nEl tamanio de Toshiba en gigas es: " + equivalenciaAGigas(toshiba));
		

		// método que informe a cuántos dvd de 4.5GB equivale dicha capacidad
		// Seagate
		System.out.println(
				"El tamanio de Seagate en gigas esquivale a: " + equivalenciaADVD_DVDUno(seagate) + " DVD's de 4.5 GB");
		// Hitachi
		System.out.println(
				"El tamanio de Hitachi en gigas esquivale a: " + equivalenciaADVD_DVDUno(hitachi) + " DVD's de 4.5 GB");
		// Western Digital
		System.out.println("El tamanio de Western Digital en gigas esquivale a: "
				+ equivalenciaADVD_DVDUno(westernDigital) + " DVD's de 4.5 GB");
		// Toshiba
		System.out.println(
				"El tamanio de Toshiba en gigas esquivale a: " + equivalenciaADVD_DVDUno(toshiba) + " DVD's de 4.5 GB");
		

		// método que informe a cuántos blue ray (15GB) equivalen.

		// Seagate
		System.out.println("El tamanio de Seagate en gigas esquivale a: " + equivalenciaADVD_DVDDos(seagate)
				+ " blue rays de 15 GB");
		// Hitachi
		System.out.println("El tamanio de Hitachi en gigas esquivale a: " + equivalenciaADVD_DVDDos(hitachi)
				+ " blue rays de 15 GB");
		// Western Digital
		System.out.println("El tamanio de Western Digital en gigas esquivale a: "
				+ equivalenciaADVD_DVDDos(westernDigital) + " blue rays de 15 GB");
		// Toshiba
		System.out.println("El tamanio de Toshiba en gigas esquivale a: " + equivalenciaADVD_DVDDos(toshiba)
				+ " blue rays de 15 GB");

	}

	private static double equivalenciaAGigas(DiscoRigido seagate) {
		double tamanioAGigas = ((seagate.getTamanio()) * 1024) / 1;
		return tamanioAGigas;
	}

	private static double equivalenciaADVD_DVDUno(DiscoRigido seagate) {
		double tamanioAGigas = ((seagate.getTamanio()) * 1024) / 1;
		double cantidadDeDvdsEquivalente = Math.ceil(tamanioAGigas / 4.5);
		return cantidadDeDvdsEquivalente;

	}

	private static double equivalenciaADVD_DVDDos(DiscoRigido seagate) {
		double tamanioAGigas = ((seagate.getTamanio()) * 1024) / 1;
		double cantidadDeDvdsEquivalente = Math.ceil(tamanioAGigas / 15);
		return cantidadDeDvdsEquivalente;

	}

	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
