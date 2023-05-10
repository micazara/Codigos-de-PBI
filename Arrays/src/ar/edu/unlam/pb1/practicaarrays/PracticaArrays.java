package ar.edu.unlam.pb1.practicaarrays;

public class PracticaArrays {

	public static void main(String[] args) {

//		tipoDeDato [] nombre = new tipoDeDato [numeroDeElementos];
		final int TAMANIO = 4;
		String[] fruits = new String[TAMANIO];

//		Para acceder a un elemento e inicializarlo: nombre [subindice] = valor;
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		fruits[3] = "Watermelon";

//		Muestra la direccion de memoria
		System.out.println(fruits);

//		Para mostrar el contenido
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		String mes[] = new String[13];

		mes[0] = "";
		mes[1] = "Enero";
		mes[2] = "Febrero";
		mes[3] = "Marzo";
		mes[4] = "Abril";
		mes[5] = "Mayo";
		mes[6] = "Junio";
		mes[7] = "Julio";
		mes[8] = "Agosto";
		mes[9] = "Septiembre";
		mes[10] = "Octubre";
		mes[11] = "Noviembre";
		mes[12] = "Diciembre";

//		for (int j = 0; j < 13; j++) {
//			System.out.println("El subindice " + j + " corresponde al mes: " + mes[j]);
//		}

		String dias[] = { "", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		// Para saber el tamanio
//		for (int k = 0; k < dias.length; k++) {
//			System.out.println(k);
//		} 

		

//		ArrayList fruitList = new ArrayList();
//		fruitList.add("Mango");
//		fruitList.add("Apple");
//		fruitList.add("Strawberry");
//		fruitList.add("Watermelon");
//
//		fruitList.remove("Strawberry");
////		fruitList.clear();
//		System.out.println(fruitList.contains("Raspberry"));
//
//		System.out.println(fruitList);

	}

}
