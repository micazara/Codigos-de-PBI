package ar.edu.unlam.pb1.tp1;

public class PruebaConEnteros {

	public static void main(String[] args) {
		
		// Punto 2
		
		int entero = 2147483647;
		
		System.out.println("El entero es " + 2147483647);
		
		//Post incremento
		
		System.out.println("Post incremento: " + entero++);
		
		// Pre incremento
		System.out.println("Pre incremento: " + ++entero);
		
		// Punto 3
		
		byte maxbyte = 127;
		short maxshort = 32767;
		char maxchar = 127;
		long maxlong = 9223372036854775807l;
		
		// Post incremento
		System.out.println("Post incremento: " + "Byte: " + maxbyte++ + " Short: " + maxshort++ + " Char: " + maxchar++ + " Long: " + maxlong++);
		
		// Pre incremento
		System.out.println("Pre incremento: ");
		

		
		// Punto 8
		
		int preIncremento = 5;
		int postIncremento = 5;
		
		System.out.println("Pre Incremento:" + ++preIncremento);
		System.out.println("Post Incremento:" + postIncremento++);
		
		System.out.println(postIncremento);
		
		// Punto 9
		
		double capacidadHdd = 1; // Expresada en TERA
		double capacidadDvd = 8.5; // Expresada en GIGA
		double capacidadBlueRay = 25.0; // Expresada en GIGA
		double cantidadDeDvdsParaBackupearHdd;
		double cantidadBlueRaysParaBackupearHdd;
		
		double conversionDeUnidad = 1024;
		cantidadDeDvdsParaBackupearHdd = ((capacidadHdd*conversionDeUnidad)/capacidadDvd);
		cantidadBlueRaysParaBackupearHdd = ((capacidadHdd*conversionDeUnidad)/capacidadBlueRay);
	
		System.out.println("Cantidad de DVD que se necesitan para backupear el disco rigido: " + cantidadDeDvdsParaBackupearHdd);
		System.out.println("Cantidad de Blue Ray que se necesitan para backupear el disco rigido: " + cantidadBlueRaysParaBackupearHdd);
	}

}
