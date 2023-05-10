package ar.edu.unlam.pb1.dominio;

public class Ascensor {

	private int pisoActual;
	private int pisoMaximo;
	private int pisoMinimo;
	private int pesoMaximo;
	private boolean alarmaEncendida;
	private boolean puertaAbierta = false;

	public Ascensor() {
		this.pisoActual = 0;
		this.pisoMaximo = 10;
		this.pisoMinimo = -1;
		this.pesoMaximo = 200;

	}

	public boolean irAlPiso(int pisoIngresado) {
		if (pisoIngresado >= pisoMinimo && pisoIngresado <= pisoMaximo) {
			this.pisoActual = pisoIngresado;
			return true;
		} else {
			return false;
		}
	}

	public int mostrarPisoActual() {
		return this.pisoActual;
	}

	public void encenderAlarma() {
		this.alarmaEncendida = true;

	}

	public void apagarAlarma() {
		this.alarmaEncendida = false;
	}

	public boolean mostrarEstadoAlarma() {
		return this.alarmaEncendida;
	}

	public void abrirPuerta() {
		this.puertaAbierta = true;

	}

	public void cerrarPuerta() {
		this.puertaAbierta = false;
	}

	public boolean mostrarEstadoPuerta() {
		return this.puertaAbierta;
	}

}
