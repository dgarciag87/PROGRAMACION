package Ejemplos.primeros_proyectos;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		String nombre; //variable que permite guardar cadenas de texto.
		
		System.out.print("Introduzca su nombre: ");
		nombre=teclado.nextLine();
		
		System.out.print("Hola " +nombre);
	}

}
