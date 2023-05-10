package ar.edu.unlam.pb1.dominio;

public class Promedio {
	
	private double nota1;
	private double nota2;
	private double promedio;
	
	public Promedio() {
		
	}
	
	public void leerNumeros() {
		// hacer que lea si estan entre 1 y 10 y si es asi que haga prom.promediar
		
//		if ((!(nota1 >= 1 && nota1 <= 10)) && (!(nota2 >= 1 && nota2 <= 10))) {
//			mostrarMensaje("Error. Ingrese una nota valida");    esto iria en el main
//		}
	}

	public double promediar(double nota1, double nota2) {
		double promedio = (nota1+nota2)/2;
		return promedio;
		
	}

	
}
