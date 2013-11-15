package EjerciciosInicial;

import java.util.Scanner;

public class MenorDeLos3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el primer número: ");
		int a= teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int b= teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int c= teclado.nextInt();
		
		
		
		/*if(a<b && a<c){
			System.out.println("El primer número introducido: ("+a+") es el menor.");
		}else if(b<a && b<c){
			System.out.println("El segundo número introducido: ("+b+") es el menor.");
		}else{
			System.out.println("El tercer número introducido: ("+c+") es el menor.");
		}*/
		
		teclado.close();
		
		/*if(a<=b && a<=c){
			if(a==b){
				System.out.println("Los números introducidos: ("+a+" y "+b+") son los menores.");
			}else if(a==c){
				System.out.println("Los números introducidos: ("+a+" y "+c+") son los menores.");
			}else{
			System.out.println("El primer número introducido: ("+a+") es el menor.");
			}
		}else if(b<=a && b<=c){
			if(b==a){
				System.out.println("Los números introducidos: ("+b+" y "+a+") son los menores.");
			}else if(b==c){
				System.out.println("Los números introducidos: ("+b+" y "+c+") son los menores.");
			}else{
			System.out.println("El segundo número introducido: ("+b+") es el menor.");
			}
		}else{
			System.out.println("El tercer número introducido: ("+c+") es el menor.");
		}*/
		
		if(a<=b && a<=c){
			if(a==b && a==c){
				System.out.println("Los números introducidos: ("+a+" , "+b+" y "+c+") son los menores.");
			}else if(a!=b && a==c){
				System.out.println("Los números introducidos: ("+a+" y "+c+") son los menores.");
			}else if(a==b && a!=c){
				System.out.println("Los números introducidos: ("+a+" y "+b+") son los menores.");
			}else{
				System.out.println("El primer número introducido: ("+a+") es el menor.");
			}
		}else if(b<=a && b<=c){
			if(b!=a && b==c){
				System.out.println("Los números introducidos: ("+b+" y "+c+") son los menores.");
			}else{
				System.out.println("El segundo número introducido: ("+b+") es el menor.");
			}
		}else{
			System.out.println("El tercer número introducido: ("+c+") es el menor.");
		}

	}

}
