package EjerciciosInicial;

import java.util.Scanner;
//Escribe un programa que pida un n�mero con el fin de visualizarlo, siempre que dicho n�mero sea par.
public class NumeroPar {

	public static void main(String[] args) {
	
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca un n�mero: ");
		int par= teclado.nextInt();
		
		if(par%2==0){
			System.out.println("El n�mero introducido "+par+" es par.");
		}else{
			System.out.println("El n�mero introducido es impar.");
		}
		teclado.close();
	}
}
