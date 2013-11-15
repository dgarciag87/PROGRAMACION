package Bucles;

import java.util.Scanner;

public class Ejercicio4BuclesNegativo {
//Escribir un programa que lea tantos números como el usuario quiera (hasta que se inserte un número negativo).
	//El primer número hay que visualizarlo en la pantalla.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero=teclado.nextInt();
		System.out.println("Número introducido: "+numero);
		while(numero>=0){
			numero=teclado.nextInt();
		}
		System.out.println("Número negativo introducido.");
		teclado.close();

	}

}
