package Bucles;

import java.util.Scanner;

public class Ejercicio3BuclesPar {
//Escribir un programa que pida varios números hasta que el usuario inserte un número par.
	//Hay que ir mostrando cada uno de los números insertados (excepto el par).
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero=teclado.nextInt();
		while((numero%2)!=0){
			System.out.println("Número impar: "+numero);
			numero=teclado.nextInt();
		}
		System.out.println("Número par introducido.");
		teclado.close();
	}

}
