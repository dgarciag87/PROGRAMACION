package Ejemplos.primeros_proyectos;

import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		float numero1,numero2;
		float media;
		float resto;
		Scanner teclado = new Scanner(System.in); //scanner es una clase (hay que importarla) y teclado la variable.
													// esto sirve para solicitar los numeros.
		
		System.out.print("Dame el primer número: ");
		numero1 = teclado.nextFloat(); //solicitamos el numero1.
		System.out.print("Dame el segundo número: ");
		numero2 = teclado.nextFloat(); //solicitamos el numero2.
		
		
		media=(numero1+numero2)/2;
		resto=(numero1%numero2);
		
		System.out.print("La media es: ");
		System.out.print(media);

		System.out.print("\nEl resto es: "+resto);
		
		//System.out.print("\nLa media es: "+media); //otra forma de solicitar la media.

		teclado.close(); //cerramos el teclado ya que no se va a utilizar.
	}

}
