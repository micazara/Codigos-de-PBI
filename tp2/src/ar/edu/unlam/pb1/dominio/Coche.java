package ar.edu.unlam.pb1.dominio;

public class Coche {

	// Atributos
	private final int CERO_KM = 0;
	private final int ANIO_ACTUAL = 2022;
	private static int cantidadCoches; // se ejecuta con un metodo de clase
	private String marca;
	private String modelo;
	private int kmActuales;
	private int anioDeFabricacion;
	private double precio;

	// Constructor

	public Coche(String marca, String modelo, double precio) {

		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		cantidadCoches++;
	}

	public Coche(String marca, String modelo, int kmActuales, int anioDeFabricacion, double precio) {

		this.marca = marca;
		this.modelo = modelo;
		this.kmActuales = kmActuales;
		this.anioDeFabricacion = anioDeFabricacion;
		this.precio = precio;
		cantidadCoches++;
	}

	public static int getCantidadCoches() {
		return cantidadCoches;

	}

	public void setKmActuales(int kmActuales) {
		this.kmActuales = kmActuales;
	}

	public int getKmActuales() {
		return kmActuales;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public int calcularAntiguedad() {
		int edadAuto = ANIO_ACTUAL - anioDeFabricacion;
		return edadAuto;
	}

	public int getKm(int kmActuales) {
		return kmActuales;
	}
}
