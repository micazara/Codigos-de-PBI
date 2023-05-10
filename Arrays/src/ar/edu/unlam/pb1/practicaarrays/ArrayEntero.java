package ar.edu.unlam.pb1.practicaarrays;

public class ArrayEntero {

	public static void main(String[] args) {
//		tipo nombre				tamanio
		Integer enteros[] = new Integer[5];

//		___/___/___/___/___/
//		0	1	2	3	4

		agregarAlArray(enteros);
		ordenarDeFormaAscendente(enteros);
		ordenarDeFormaDescendente(enteros);
		buscarNumerosPares(enteros);
		buscarNumerosImpares(enteros);

	}

	private static void ordenarDeFormaAscendente(Integer[] enteros) {
		for (int i = 1; i < enteros.length; i++) {
			for (int j = 0; j < enteros.length - 1; j++) {
				if (enteros[j] > enteros[j + 1]) {
					int aux = enteros[j];
					enteros[j] = enteros[j + 1];
					enteros[j + 1] = aux;
				}
			}
		}

		System.out.println("\nArray ordenado de forma ascendente");
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i] + " ");
		}
	}

	private static void buscarNumerosImpares(Integer[] enteros) {
		System.out.println("\nNumeros impares encontrados en el array: ");
		for (int indice = 0; indice < enteros.length; indice++) {
			if (enteros[indice] != null && enteros[indice] % 2 != 0) {
				System.out.print(enteros[indice] + " ");
			}
		}
	}

	private static void buscarNumerosPares(Integer[] enteros) {
		System.out.println("\nNumeros pares encontrados en el array: ");
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] != null && enteros[i] % 2 == 0) {
				System.out.print(enteros[i] + " ");
			}

		}
	}

	private static void agregarAlArray(Integer[] enteros) {
		System.out.println("Array con numeros enteros aleatorios del 0 al 100");
		for (int indice = 0; indice < enteros.length; indice++) {
			if (enteros[indice] == null) {
				int enteroAleatorio = (int) (Math.round(Math.random() * 100));
				enteros[indice] = enteroAleatorio;
			}
			System.out.print(enteros[indice] + " ");
		}
	}

	private static void ordenarDeFormaDescendente(Integer[] enteros) {
		for (int i = 1; i < enteros.length; i++) {
			for (int j = 0; j < enteros.length - 1; j++) {
				if (enteros[j] < enteros[j + 1]) {
					int aux = enteros[j];
					enteros[j] = enteros[j + 1];
					enteros[j + 1] = aux;
				}
			}
		}

		System.out.println("\nArray ordenado de forma descendente");
		for (int indice = 0; indice < enteros.length; indice++) {
			System.out.print(enteros[indice] + " ");
		}
	}

}
