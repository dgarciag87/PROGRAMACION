package Bucles;

import java.util.Scanner;

public class Ejercicio2Bucles {
//Pedir n�meros hasta que se inserte un 0. Mostrar la cantidad de n�meros le�dos y el resultado de multiplicar todos ellos.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un n�mero: ");
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
		System.out.println("El total de n�meros es: "+contador);
		System.out.println("La multiplicaci�n de todos los n�meros es: "+multiplicacion);
		
		teclado.close();
	}

}
