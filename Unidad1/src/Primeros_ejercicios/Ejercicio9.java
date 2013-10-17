package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		float peso,velocidad,tiempo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el peso del archivo en Mbytes: ");
		peso = teclado.nextFloat();
		
		System.out.print("Introduzca la velocidad de transmision en mbps: ");
		velocidad = teclado.nextFloat();
		
		tiempo=peso*velocidad;
		
		System.out.print("El tiempo que tardara en transmitirlo es: "+tiempo +(" segundos"));

		teclado.close();
	}
}
