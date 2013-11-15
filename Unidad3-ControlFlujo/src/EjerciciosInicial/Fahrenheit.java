package EjerciciosInicial;

import java.util.Scanner;

public class Fahrenheit {
//Escribe un programa que pida una temperatura en Fahrenheit. Pasará esa temperatura a grados Centígrados. Si la temperatura es menor que cero, mostrará un mensaje de aviso de congelación.
	public static void main(String[] args) {
		//Solicitar y leer temperatura fahrenheit
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime la temperatura (ºF): ");
		double temperatura= teclado.nextDouble();
		
		//Pasar a grados centigrados
		temperatura=(temperatura-32)/1.8;
		
		//Si la temperatura es menor que 0
		if(temperatura<0){
			System.out.println("Aviso,la temperatura es de: "+temperatura+" ºC. Puedes congelarte.");
		}else if(temperatura>50){
			System.out.println("La temperatura es de: "+temperatura+" ºC. Puedes achicharrarte.");
		}else{
			System.out.println("La temperatura es de: "+temperatura+" ºC. Ni te congelas ni te achicharras.");
		}
		teclado.close();

	}
		

}
