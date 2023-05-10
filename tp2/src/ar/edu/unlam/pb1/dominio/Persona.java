package ar.edu.unlam.pb1.dominio;

import java.util.Iterator;

public class Persona {

	// Atributos
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;

	// Constructor (public clase (parametros que estan en la instanciacion de la
	// clase)

	public Persona(String nombre, String genero, long dni, double peso, double altura) {

		// this.
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;

	}
	// Metodos

	public void alimentar(double kilos, double peso) {
		double sofiaComio = kilos + peso;
		this.peso = sofiaComio;
	}

	public double pesar() {
		return this.peso;
	}

	public void crecer(double metros, double altura) {
		double sofiaCrecio = metros + altura;
		this.altura = sofiaCrecio;
	}

	public double medir() {
		return this.altura;
	}

	public void cumplirAnios(int años, int edad) {
		int sofiaCumplio = años + edad;
		this.edad = sofiaCumplio;
	}

	public int mostrarAnios() {
		return this.edad;

	}

	public void morir(int edad) {
		// hacer for hasta 100 años y muere
		for (int años; edad <= 100; edad++) {
			System.out.println(edad);
		
		}
	}

	public String estaMuerta() {
		
		int edad = this.edad;
		String mensaje = "Sofia murio :(";
		
		if (edad==100) {
			System.out.println(mensaje);
		}
		return mensaje;
		
	}
}
