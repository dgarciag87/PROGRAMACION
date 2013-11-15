package EjerciciosInicial;

import java.util.Scanner;

public class PalabraOcultaCondicionales {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String palabra="";
		String oculto="PROGRAMACION";
		
		System.out.println("ADIVINA LA CONTRASEÑA");
		System.out.println("Introduzca una contraseña: ");
		palabra=teclado.nextLine();
		palabra = palabra.toUpperCase();
		
		if ( palabra.equals(oculto) ) { //te devuelve cierto si lo que hay dentro de palabra es igual que lo que contiene la variable que hay entre parentesis
			System.out.println("¡ADIVINASTE!\n¡FELICIDADES!");
		} else{
			System.out.println("¡LASTIMA! CONTRASEÑA INCORRECTA. LA CORRECTA ERA: "+oculto);
		}
		
		teclado.close();

	}

}
