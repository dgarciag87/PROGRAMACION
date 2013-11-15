package Bucles;

import java.util.Scanner;

public class Ejercicio6BuclesOperadores {
//Modifica el ejercicio 3 de condicionales switch (operadores '+', '-', '*', '/') de forma que permita hacer una operación,
	//volverá a pedir al usuario el operador, para, con los mismos números, volver a hacer otra operación.
	//El programa terminará cuando se inserte un caracter que no es un operador.
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String operacion;
		int a=0,b=0;
		
		System.out.println("Dame el primer número entero: ");
		a=teclado.nextInt();
		System.out.println("Dame la operación que deseas realizar (*,+,-,/): ");
		operacion=teclado.next();
		System.out.println("Dame el segundo número entero: ");
		b=teclado.nextInt();
			while (operacion.equals("*")||operacion.equals("+")||operacion.equals("-")||operacion.equals("/")){
				switch (operacion){
					case "*":
						System.out.println("El resultado de "+a+operacion+b+"="+(a*b));
						break;
					case "+":
						System.out.println("El resultado de "+a+operacion+b+"="+(a+b));
						break;
					case "-":
						System.out.println("El resultado de "+a+operacion+b+"="+(a-b));
						break;
					case "/":
						System.out.println("El resultado de "+a+operacion+b+"="+(a/b));
						break;				
				}
				System.out.println("Dame la operación que deseas realizar (*,+,-,/): ");
				operacion=teclado.next();
			}
			System.out.println("La operación introducida no se corresponde con las solicitadas.");
		teclado.close();
	}

}
