package Bucles;

import java.util.Scanner;

public class Ejercicio4BuclesNegativo {
//Escribir un programa que lea tantos n�meros como el usuario quiera (hasta que se inserte un n�mero negativo).
	//El primer n�mero hay que visualizarlo en la pantalla.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un n�mero: ");
		int numero=teclado.nextInt();
		System.out.println("N�mero introducido: "+numero);
		while(numero>=0){
			numero=teclado.nextInt();
		}
		System.out.println("N�mero negativo introducido.");
		teclado.close();

	}

}
