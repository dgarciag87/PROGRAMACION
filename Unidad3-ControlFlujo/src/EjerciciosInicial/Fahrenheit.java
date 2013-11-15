package EjerciciosInicial;

import java.util.Scanner;

public class Fahrenheit {
//Escribe un programa que pida una temperatura en Fahrenheit. Pasar� esa temperatura a grados Cent�grados. Si la temperatura es menor que cero, mostrar� un mensaje de aviso de congelaci�n.
	public static void main(String[] args) {
		//Solicitar y leer temperatura fahrenheit
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime la temperatura (�F): ");
		double temperatura= teclado.nextDouble();
		
		//Pasar a grados centigrados
		temperatura=(temperatura-32)/1.8;
		
		//Si la temperatura es menor que 0
		if(temperatura<0){
			System.out.println("Aviso,la temperatura es de: "+temperatura+" �C. Puedes congelarte.");
		}else if(temperatura>50){
			System.out.println("La temperatura es de: "+temperatura+" �C. Puedes achicharrarte.");
		}else{
			System.out.println("La temperatura es de: "+temperatura+" �C. Ni te congelas ni te achicharras.");
		}
		teclado.close();

	}
		

}
