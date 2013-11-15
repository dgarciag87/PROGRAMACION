package EjerciciosInicial;

import java.util.Scanner;
//Crea un programa que tiene un numero oculto (del 1 al 10). El programa pregunta el número al jugador, si la adivina muestra un mensaje de éxito. Si no, muestra el error.
public class OcultoCondicionales {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int a=0;
		int oculto=0;
		
		System.out.println("ADIVINA UN NUMERO DEL 1 AL 10");
		oculto = (int)((Math.random()*10)+1);
		//System.out.println("Oculto="+oculto);
		System.out.println("Adivina el número entero (del 1 al 10): ");
		a=teclado.nextInt();
		
		if ( a == oculto ) { 
			System.out.println("¡ADIVINASTE!\n¡FELICIDADES!");
		} else if ( a < oculto || a > oculto ){
			System.out.println("¡LASTIMA! EL NUMERO OCULTO ERA "+oculto);
		}
		
		teclado.close();
	}

}
