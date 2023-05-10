package ar.edu.unlam.pb1.dominio;

public class Cubo {

	private double longitudLado;

	public Cubo(double lado) {

		this.longitudLado = lado;
	}

	public double getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(double longitudLado) {
		this.longitudLado = longitudLado;
	}

	public double getSuperficieCara() {
		double superficieCara = Math.pow(longitudLado, 2);
		return superficieCara;
		
	}

	public double getVolumen() {
		double volumen = Math.pow(longitudLado, 3);
		return volumen;
	}

}
