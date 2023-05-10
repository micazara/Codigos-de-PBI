package ar.edu.unlam.pb1.practicaarrays;

import java.util.Scanner;

public class ArraysTPPunto4 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

//Desarrolla una clase de prueba que contenga 2 arrays. Uno String y otro float. Se debe
//solicitar por teclado el ingreso del nombre de los alumnos y la nota de cada uno. Luego
//mostrá por pantalla el nombre del alumno junto con su resultado (Reprobado, Aprobado o
//Promocionado).

		String nombre = " ";
		String nombresDeAlumnos[] = { nombre };
		System.out.println("Ingrese el nombre del alumno: ");
		nombre = teclado.next().toLowerCase();

		Notas nota[] = new Notas[5];
		System.out.println("Ingrese la nota del alumno: ");
		int calificacion = teclado.nextInt();

	}

}
