package Bucles;

import java.util.Scanner;

public class Ejercicio3BuclesPar {
//Escribir un programa que pida varios n�meros hasta que el usuario inserte un n�mero par.
	//Hay que ir mostrando cada uno de los n�meros insertados (excepto el par).
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un n�mero: ");
		int numero=teclado.nextInt();
		while((numero%2)!=0){
			System.out.println("N�mero impar: "+numero);
			numero=teclado.nextInt();
		}
		System.out.println("N�mero par introducido.");
		teclado.close();
	}

}
