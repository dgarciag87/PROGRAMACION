package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		double kilos,onzas;
		final double onzasporkilo=35.2739619;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un peso en kilos: ");
		kilos = teclado.nextFloat();
		
		onzas=kilos*onzasporkilo;
		
		System.out.print("El peso en onzas es: ");
		System.out.print(onzas);

		teclado.close();
	}
}
