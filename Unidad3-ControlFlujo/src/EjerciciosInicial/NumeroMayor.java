package EjerciciosInicial;

import java.util.Scanner;

public class NumeroMayor {
//Escribe un programa que pida dos n�meros y que visualice el n�mero que sea mayor de los dos. Si los dos son iguales, imprimir� cualquiera de ellos.
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el primer n�mero: ");
		int a= teclado.nextInt();
		System.out.print("Introduzca el segundo n�mero: ");
		int b= teclado.nextInt();
		
		if(a>b){
			System.out.println("El primer n�mero introducido: ("+a+") es el mayor.");
		}else if(b>a){
			System.out.println("El segundo n�mero introducido  ("+b+") es el mayor.");
		}else{
			System.out.println("Los dos n�meros introducidos son iguales: ("+a+"="+b+")");
		}
		teclado.close();

	}

}
