package Bucles;

import java.util.Scanner;

public class Ejercicio5BuclesSucesion {
//Escribe un programa que lea una serie de n�meros, muestre el primero, no el segundo, si el tercero y as� sucesivamente.
	//Termina cuando insertamos un n�mero negativo. El n�mero negativo no se imprimir�.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un n�mero: ");
		int numero=teclado.nextInt();
		if(numero<0){
			System.out.println("Ha introducido en primer lugar un n�mero negativo.");
		}else{
			int contador=1;
			System.out.println("El n�mero introducido en "+contador+" lugar es: "+numero);
			while(numero>=0){
				numero=teclado.nextInt();
				if(numero<0){
					break;
				}else{
					contador++;
					if(contador%2!=0){
						System.out.println("El n�mero introducido en "+contador+" lugar es: "+numero);
					}
				}
			}
		}
		System.out.println("El programa termina ya que ha introducido un n�mero negativo.");
		teclado.close();
	}

}
