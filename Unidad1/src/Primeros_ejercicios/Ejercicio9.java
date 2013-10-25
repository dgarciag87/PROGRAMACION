package Primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		double peso,velocidad,tiempo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el peso del archivo en Mbytes: ");
		peso = teclado.nextDouble();
		
		System.out.print("Introduzca la velocidad de transmision en mbps: ");
		velocidad = teclado.nextDouble();
		
		peso= peso*1024*1024*8;
		velocidad=velocidad*1000000;
		
		tiempo=peso/velocidad;
		
		System.out.print("El tiempo que tardara en transmitirlo es: "+Math.round(tiempo) +(" segundos"));

		teclado.close();
	}
}
