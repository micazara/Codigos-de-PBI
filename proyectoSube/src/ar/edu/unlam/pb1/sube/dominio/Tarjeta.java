package ar.edu.unlam.pb1.sube.dominio;

public class Tarjeta {

	// ATRIBUTES
	private double saldo;
	private String id;
	private boolean tarifaSocial;
	private boolean boletoEstudiantil;
	public static final double SALDO_MAX_NEGATIVO = -100.80;
	public static final double SALDO_MAX_POSITIVO = 1800d;
	/*when we use the “static final” it´s said that we created a constante de
	 * clase, un atributo común a todos los objetos de esa clase.
	 */

	public Tarjeta(double saldo, String id) {
		this.saldo = saldo;
		this.id = id;
		this.tarifaSocial = tarifaSocial;
		this.boletoEstudiantil = boletoEstudiantil;
	}
//------------SALDO / ID--------------
	public double getSaldo() {
		return saldo;
		}	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		}
	public String getId() {
		return id;
		}
	public void setId(String id) {
		this.id = id;
		}
//----------SALDO (FUNCIONES)----------
	public boolean cargarSaldo(double newSaldo) {
		this.saldo += newSaldo;
		return true;
		}
	public boolean cobrarBoleto(double boleto) {
		if (this.saldo - boleto >= SALDO_MAX_NEGATIVO) {
			this.saldo -= boleto;
			return true;
		}
		return false;
		}
		
//---------BOLETO EST. / TARIFA--------
	public boolean isBoletoEstudiantil() {
		return boletoEstudiantil;
		}
	public void setBoletoEstudiantil(boolean boletoEstudiantil) {
		this.boletoEstudiantil = boletoEstudiantil;
		}
	public boolean isTarifaSocial() {
		return tarifaSocial;
		}
	public void setTarifaSocial(boolean tarifaSocial) {
		this.tarifaSocial = tarifaSocial;
		}
//--------------------------------------
	public static double getSaldoMaxNegativo() {
		return SALDO_MAX_NEGATIVO;
	}

	public static double getSaldoMaxPositivo() {
		return SALDO_MAX_POSITIVO;
	}

	// Si este saldo es mayor o igual al saldo maximo negativo, entonces se
	// resta lo
	// del boleto y se le asigna al saldo.


	public String toString() {
		return "\nTarjeta [saldo=" + saldo + " - id=" + id + "]";
	}
}


