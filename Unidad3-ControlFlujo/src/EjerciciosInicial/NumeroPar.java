package EjerciciosInicial;

import java.util.Scanner;
//Escribe un programa que pida un número con el fin de visualizarlo, siempre que dicho número sea par.
public class NumeroPar {

	public static void main(String[] args) {
	
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int par= teclado.nextInt();
		
		if(par%2==0){
			System.out.println("El número introducido "+par+" es par.");
		}else{
			System.out.println("El número introducido es impar.");
		}
		teclado.close();
	}
}
