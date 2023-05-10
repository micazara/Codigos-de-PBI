package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Coche;

public class EjemploDeCoche {

	public static void main(String[] args) {
		
		Coche auto1 = new Coche("Ford", "Ka", 5632.6);
		Coche auto2 = new Coche("Fiat", "Uno", 239, 2006, 4231.3);
	
	// Cantidad de coches
	System.out.println("La cantidad de coches es: " + Coche.getCantidadCoches() + '\n');
	
	// Km actuales
	auto1.setKmActuales(541);
	System.out.println("La cantidad de kilometros actuales del auto 1 es: " + auto1.getKmActuales() + '\n');
	
	auto2.setKmActuales(123);
	System.out.println("La cantidad de kilometros actuales del auto 2 es: " + auto2.getKmActuales() + '\n');
	
	// Precio
	auto1.setPrecio(4566.51);
	System.out.println("El precio del auto 1 es: " + auto1.getPrecio() + '\n');
	
	auto2.setPrecio(5945.9);
	System.out.println("El precio del auto 2 es: " + auto2.getPrecio() + '\n');
	
	// Antiguedad
	System.out.println("El auto 1 tiene: " + auto1.calcularAntiguedad() + " anios" + '\n');
	System.out.println("El auto 2 tiene: " + auto2.calcularAntiguedad() + " anios" + '\n');
	
	}
	


}
