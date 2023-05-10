package ar.edu.unlam.pb1.dominio;

public class Calculadora {

	// ATRIBUTOS
	double operador1;
	double operador2;
	double resultado;

	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	public Calculadora() {
		// constructor sin parametros
	}

	// MÉTODOS de la casio

	public void sumar() {
		double op1 = this.operador1;
		double op2 = this.operador2;
		double resultado = op1 + op2;
		this.resultado = resultado;

	}

	public double mostrarSuma() {
		return resultado;

	}

	public void restar() {
		double op1 = this.operador1;
		double op2 = this.operador2;
		double resultado = op1 - op2;
		this.resultado = resultado;

	}

	public double mostrarResta() {
		return resultado;
	}

	public void multiplicar() {
		double op1 = this.operador1;
		double op2 = this.operador2;
		double resultado = op1 * op2;
		this.resultado = resultado;
	}

	public double mostrarMultiplicacion() {
		return resultado;
	}

	public void dividir() {
		double op1 = this.operador1;
		double op2 = this.operador2;
		double resultado = op1 / op2;
		this.resultado = resultado;

	}

	public double mostrarDivision() {
		return resultado;
	}

	// Metodos de la calculadora del celular

	public void sumar(double numero1, double numero2) {
		double suma = numero1 + numero2;
		double resultadoSuma = suma;
		this.resultado=resultadoSuma;
	}

	public double mostrarSuma(double numero1, double numero2) {
		return resultado;
	}

	public void restar(double numero1, double numero2) {
		double resta = numero1 - numero2;
		double resultadoResta = resta;
		this.resultado = resultadoResta;
	}

	public double mostrarResta(double numero1, double numero2) {
		return resultado;
	}

	public void dividir(double numero1, double numero2) {
		if (numero2 > 0) {
			double division = numero1 / numero2;
			double resultadoDivision = division;
			this.resultado = resultadoDivision;
		} else {
			System.out.println("No se puede dividir por cero");
		}
	}

	public double mostrarDivision(double numero1, double numero2) {
		return resultado;
	}

	public void multiplicar(double numero1, double numero2) {
		double multiplicacion = numero1 * numero2;
		double resultadoMultiplicacion = multiplicacion;
		this.resultado = resultadoMultiplicacion;
	}

	public double mostrarMultiplicacion(double numero1, double numero2) {
		return resultado;
	}

	public void calcularArea(double radio, double pi) {
		double area = radio * radio * pi;
		double resultadoArea = area;
		this.resultado = resultadoArea;

	}

	public double mostrarArea() {

		return resultado;
	}

	public String esPositivo() {
		String mensaje;
		if (resultado > 0) {
			mensaje = "El resultado es positivo";
		} else {
			mensaje = "El resultado es negativo";
		}
		return mensaje;
	}

}
