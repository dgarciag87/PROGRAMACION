package Bucles;

import java.util.Scanner;

public class Ejercicio2Bucles {
//Pedir números hasta que se inserte un 0. Mostrar la cantidad de números leídos y el resultado de multiplicar todos ellos.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero=teclado.nextInt();
		int contador=1,multiplicacion=numero;
		while(numero!=0){
			numero=teclado.nextInt();
			if(numero!=0){
				multiplicacion=multiplicacion*numero;
				contador++;
			}else{
				break;
			}
		}
		System.out.println("El total de números es: "+contador);
		System.out.println("La multiplicación de todos los números es: "+multiplicacion);
		
		teclado.close();
	}

}
