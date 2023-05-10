package ar.edu.unlam.pb1.motor.dominio;

public class Motor {

	private int tipoBomba;
	private char tipoMotor;
	private String combustible;
	private int autonomia;

	public Motor() {

	}

	public int getTipoBomba() {
		return tipoBomba;
	}

	public void setTipoBomba(int tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	public char getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(char tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String dimeTipoMotor() {
		String mensaje = " ";
		switch (this.tipoMotor) {
		case 'n':
			mensaje = "motor de combustion a nafta";
			break;
		case 'd':
			mensaje = "motor de combustion diesel";
			break;
		case 'g':
			mensaje = "motor de combustion por gas";
			break;
		case 'm':
			mensaje = "motor de combustion por nafta/gas";
			break;
		case 'h':
			mensaje = "motor hibrido nafta y electrico";
			break;
		default:
			mensaje = "error";
		}
		return mensaje;
	}

	public String dimeTipoBomba() {
		String mensaje = " ";
		switch (tipoMotor) {
		case 'n':
			this.tipoBomba = 0;
			mensaje = "bomba de combustible y de agua";
			break;
		case 'd':
			this.tipoBomba = 1;
			mensaje = "bomba combustible y calentador";
			break;
		case 'g':
			this.tipoBomba = 2;
			mensaje = "bomba de gas y tanque presurizado";
			break;
		case 'm':
			this.tipoBomba = 3;
			mensaje = "bomba de combustible y conversor dual";
			break;
		case 'h':
			this.tipoBomba = 4;
			mensaje = "bomba de combustible y de agua y otro sistema que posee un conjunto de baterías y sistema de recarga";
			break;
		}
		
		return mensaje;
	}

}
