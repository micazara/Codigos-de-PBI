package ar.edu.unlam.pb1.dominio;

public class Calculadora {

	private double operador1;
	private double operador2;
	private double resultado;

	public Calculadora() {

	}

	public void sumar(double operador1, double operador2) {
		double sumar = operador1 + operador2;
		double resultadoSuma = sumar;
		this.resultado = resultadoSuma;
	}

	public double mostrarSuma() {
		return this.resultado;
	}

	public void restar(double operador1, double operador2) {
		double restar = operador1 - operador2;
		double resultadoResta = restar;
		this.resultado = resultadoResta;
	}

	public double mostrarResta() {
		return this.resultado;
	}

	public void multiplicar(double operador1, double operador2) {
		double multiplicar = operador1 * operador2;
		double resultadoMultiplicacion = multiplicar;
		this.resultado = resultadoMultiplicacion;
	}

	public double mostrarMultiplicacion() {
		return this.resultado;

	}

	public void dividir(double operador1, double operador2) {
		double dividir = operador1 * operador2;
		double resultadoDivision = dividir;
		this.resultado = resultadoDivision;
	}

	public double mostrarDivision() {
		return this.resultado;
	}

	public void raizCuadrada(double operador1) {
		double raizCuadrada = Math.sqrt(operador1);
		double resultadoRaizCuadrada = raizCuadrada;
		this.resultado = resultadoRaizCuadrada;

	}

	public double mostrarRaizCuadrada() {
		return this.resultado;
	}

	public void raizCubica(double operador1) {
		double raizCubica = Math.cbrt(operador1);
		double resultadoRaizCubica = raizCubica;
		this.resultado = resultadoRaizCubica;

	}

	public double mostrarRaizCubica() {
		return this.resultado;

	}

	public void potencia(double operador1, double operador2) {
		double potencia = Math.pow(operador1, operador2);
		double resultadoPotencia = potencia;
		this.resultado = resultadoPotencia;

	}

	public double mostrarPotencia() {
		return this.resultado;
	}

}
