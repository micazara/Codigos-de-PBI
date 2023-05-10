package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Usuario;

public class TestUsuario {

	public static void main(String[] args) {
		
		Usuario user = new Usuario("Mica", "mica123", "Micaela", "Zara", 44892966, 19);

		// Edad
		System.out.println("Bienvenido. \nPor favor, ingrese su edad: ");
		user.setEdad(0);
		System.out.println("La edad del usuario es: " + user.getEdad());
		
		// Usuario
		user.setUsuario("Mica");
		System.out.println("El usuario es: " + user.getUsuario());
	
		// Contraseña
		user.setContrasenia("mica123");
		System.out.println("La contrasenia es: " + user.getContrasenia());
	}

}
