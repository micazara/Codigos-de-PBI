package ar.edu.unlam.pb1.sube.dominio;

public class Encargado {
	    private String id;
	    private String nombre;

	public Encargado(String id, String nombre) {
	    this.id=id;
	    this.nombre=nombre;
	}

	public String getId() {
	    return id;
	}

	public void setId(String id) {
	    this.id = id;
	}

	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

}