package Primeros_ejercicios;

	import java.util.Scanner;

	public class Ejercicio2 {

		public static void main(String[] args) {
			float numero1,numero2;
			float media;
			float suma;
			float producto;
			Scanner teclado = new Scanner(System.in); //scanner es una clase (hay que importarla) y teclado la variable.
														// esto sirve para solicitar los numeros.
			
			System.out.print("Dame el primer número: ");
			numero1 = teclado.nextFloat(); //solicitamos el numero1.
			System.out.print("Dame el segundo número: ");
			numero2 = teclado.nextFloat(); //solicitamos el numero2.
			
			suma=(numero1+numero2);
			media=(numero1+numero2)/2;
			producto=(numero1*numero2);
			
			System.out.print("La media es: ");
			System.out.print(media);

			System.out.print("\nLa suma es: "+suma);
			
			System.out.print("\nEl producto es: "+producto);

			teclado.close(); //cerramos el teclado ya que no se va a utilizar.
		}

	}