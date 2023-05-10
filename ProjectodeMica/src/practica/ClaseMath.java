package practica;

public class ClaseMath {

	public static void main(String[] args) {
		
		// Raiz cuadrada
		double raiz2 = Math.sqrt(16); 
		System.out.println(raiz2);

		// Raiz cúbica
		double raiz3 = Math.cbrt(27);
		System.out.println(raiz3);
	
		// Potencia
		double potencia = Math.pow(8, 2); 
		System.out.println(potencia);
		
		// Redondear con double
		double redondear = Math.round(3.1415926535897932);
		System.out.println(redondear);
		
		// Redondear con float
		float red0ndear = Math.round(3.1415926535897932);
		System.out.println(red0ndear);
		
		// Aleatorio
		double aleatorio = Math.random();
		System.out.println(aleatorio);
		
	}
	
}