package practica;

public class Cadenas {

	public static void main(String[] args) {
		
		String frase1 = "Hola mundo";
		String frase2 = " Hola mundo";
		System.out.println("La segunda palabra de la frase " + frase1 + " es " + frase1.substring(5, 10));
		System.out.println(frase1.substring(2)); // incluye el caracter elegido y muestra ese y los que le siguen
		System.out.println("La frase " + frase1 + " tiene " + frase1.length() + " caracteres ");
		System.out.println(frase1.charAt(6));
		System.out.println((frase1.length()-1));
		System.out.println(frase1.equals(frase2));
		System.out.println(frase1.toLowerCase());
		System.out.println(frase1.toUpperCase());
		System.out.println(frase2.trim());
	}

}
