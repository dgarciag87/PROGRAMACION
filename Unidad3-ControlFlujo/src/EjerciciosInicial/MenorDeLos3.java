package EjerciciosInicial;

import java.util.Scanner;

public class MenorDeLos3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el primer n�mero: ");
		int a= teclado.nextInt();
		System.out.print("Introduzca el segundo n�mero: ");
		int b= teclado.nextInt();
		System.out.print("Introduzca el segundo n�mero: ");
		int c= teclado.nextInt();
		
		
		
		/*if(a<b && a<c){
			System.out.println("El primer n�mero introducido: ("+a+") es el menor.");
		}else if(b<a && b<c){
			System.out.println("El segundo n�mero introducido: ("+b+") es el menor.");
		}else{
			System.out.println("El tercer n�mero introducido: ("+c+") es el menor.");
		}*/
		
		teclado.close();
		
		/*if(a<=b && a<=c){
			if(a==b){
				System.out.println("Los n�meros introducidos: ("+a+" y "+b+") son los menores.");
			}else if(a==c){
				System.out.println("Los n�meros introducidos: ("+a+" y "+c+") son los menores.");
			}else{
			System.out.println("El primer n�mero introducido: ("+a+") es el menor.");
			}
		}else if(b<=a && b<=c){
			if(b==a){
				System.out.println("Los n�meros introducidos: ("+b+" y "+a+") son los menores.");
			}else if(b==c){
				System.out.println("Los n�meros introducidos: ("+b+" y "+c+") son los menores.");
			}else{
			System.out.println("El segundo n�mero introducido: ("+b+") es el menor.");
			}
		}else{
			System.out.println("El tercer n�mero introducido: ("+c+") es el menor.");
		}*/
		
		if(a<=b && a<=c){
			if(a==b && a==c){
				System.out.println("Los n�meros introducidos: ("+a+" , "+b+" y "+c+") son los menores.");
			}else if(a!=b && a==c){
				System.out.println("Los n�meros introducidos: ("+a+" y "+c+") son los menores.");
			}else if(a==b && a!=c){
				System.out.println("Los n�meros introducidos: ("+a+" y "+b+") son los menores.");
			}else{
				System.out.println("El primer n�mero introducido: ("+a+") es el menor.");
			}
		}else if(b<=a && b<=c){
			if(b!=a && b==c){
				System.out.println("Los n�meros introducidos: ("+b+" y "+c+") son los menores.");
			}else{
				System.out.println("El segundo n�mero introducido: ("+b+") es el menor.");
			}
		}else{
			System.out.println("El tercer n�mero introducido: ("+c+") es el menor.");
		}

	}

}
