package ar.edu.unlam.pb1.motor.interfaz;

import ar.edu.unlam.pb1.motor.dominio.Motor;

public class TestMotor {

	public static void main(String[] args) {
		
//		Definí una clase Motor considerando los siguientes atributos de clase:
//			tipoBomba (int),
//			tipoMotor (char),
//			combustible (String).
//			autonomia (int)
//			Definí un constructor asignando unos valores de
//			defecto a los atributos y los métodos para poder establecer y obtener los valores de los
//			atributos.
//			Crea un método tipo procedimiento denominado dimeTipoMotor() donde a
//			través de un condicional switch hagas lo siguiente:
//			n - Motor de combustión por nafta
//			d - motor de combustion diesel
//			g - Motor de combustion por gas
//			m - Motor de combustion por nafta / gas
//			h - Motor hibrido nafta y eléctrico
//
//			Si es 'n' con 0 identificamos que tiene bomba de combustible y de agua
//			Si es 'd' con 1 identificamos que tiene bomba combustible y calentador
//			Si es 'g' con 2 identificamos que gas tiene bomba de gas y tanque presurizado
//			Si es 'm' con 3 identificamos que mixto tiene bomba de combustible y conversor dual
//			Si es 'h' con 4 identificamos que tiene lo mismo del 0 y otro sistema que posee un conjunto de baterías y sistema de recarga
//
//			Crear un vehículo y asignarle el tipo de motor que desea con su correspondiente bomba y/o sistema.

		Motor motor = new Motor ();
	
		motor.setTipoMotor('m');
		System.out.println("La seleccion " + motor.getTipoMotor() + " es " + motor.dimeTipoMotor());

		System.out.println(motor.dimeTipoBomba());
	
	
	
	}

}
