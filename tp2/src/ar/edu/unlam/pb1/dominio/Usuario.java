package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class Usuario {

	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	

	public Usuario (String usuario, String contrasenia, String nombre, String apellido, int dni, int edad) {

	this.usuario=usuario;
	this.contrasenia=contrasenia;
	this.nombre=nombre;
	this.apellido=apellido;
	this.dni=dni;
	this.edad=edad;
		
	}


	public void setEdad(int edad) {
		Scanner teclado = new Scanner (System.in);
		this.edad=edad;
		edad = teclado.nextInt();
		
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setUsuario(String usuario) {
		this.usuario=usuario;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia=contrasenia;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
}
