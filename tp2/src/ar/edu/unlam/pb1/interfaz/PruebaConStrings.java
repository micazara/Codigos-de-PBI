package ar.edu.unlam.pb1.interfaz;

public class PruebaConStrings {

	public static void main(String[] args) {
		
//		PruebaConStrings cadenaUno = new PruebaConStrings();
//		PruebaConStrings cadenaDos = new PruebaConStrings();
//		
		String minuscula = "java es case sensitive";
		
//		b. Declará la variable mayuscula y asígnale el valor que consideres le corresponda en
//		función de su nombre.
//		d. toUpperCase(); // MAYUSCULA
		String mayuscula = minuscula.toUpperCase();
		System.out.println(minuscula + " en mayuscula es: " + mayuscula);
		
//		b. length(); // CANTIDAD DE CARACTERES
		System.out.println(minuscula + " tiene " + minuscula.length() + " caracteres");
	
//		a. charAt(int index); // POSICION DE UN CARACTER
		System.out.println(minuscula.charAt(0));
		System.out.println(minuscula.charAt(4));
		
//		c. toLowerCase();
		System.out.println(mayuscula + " en minuscula es " + mayuscula.toLowerCase());
		
//		e. trim(); QUITA LOS ESPACIOS DELANTE O DETRAS DE UNA CADENA
		System.out.println(minuscula.trim());

//			c. Imprimí por pantalla el contenido de la variable mayuscula, pero incorporá el
//			punto al final, cumpliendo con la forma en la que se escriben las oraciones. 
		
		System.out.println(minuscula + ".");


	}

}
