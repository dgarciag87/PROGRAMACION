package EjerciciosInicial;

import java.util.Scanner;

public class NumeroMayor {
//Escribe un programa que pida dos números y que visualice el número que sea mayor de los dos. Si los dos son iguales, imprimirá cualquiera de ellos.
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el primer número: ");
		int a= teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int b= teclado.nextInt();
		
		if(a>b){
			System.out.println("El primer número introducido: ("+a+") es el mayor.");
		}else if(b>a){
			System.out.println("El segundo número introducido  ("+b+") es el mayor.");
		}else{
			System.out.println("Los dos números introducidos son iguales: ("+a+"="+b+")");
		}
		teclado.close();

	}

}
