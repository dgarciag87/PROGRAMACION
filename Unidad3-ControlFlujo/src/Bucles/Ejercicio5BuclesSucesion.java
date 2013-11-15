package Bucles;

import java.util.Scanner;

public class Ejercicio5BuclesSucesion {
//Escribe un programa que lea una serie de números, muestre el primero, no el segundo, si el tercero y así sucesivamente.
	//Termina cuando insertamos un número negativo. El número negativo no se imprimirá.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero=teclado.nextInt();
		if(numero<0){
			System.out.println("Ha introducido en primer lugar un número negativo.");
		}else{
			int contador=1;
			System.out.println("El número introducido en "+contador+" lugar es: "+numero);
			while(numero>=0){
				numero=teclado.nextInt();
				if(numero<0){
					break;
				}else{
					contador++;
					if(contador%2!=0){
						System.out.println("El número introducido en "+contador+" lugar es: "+numero);
					}
				}
			}
		}
		System.out.println("El programa termina ya que ha introducido un número negativo.");
		teclado.close();
	}

}
