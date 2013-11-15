package EjerciciosInicial;

import java.util.Scanner;

public class Operaciones {
//Escribe un programa que pida dos números enteros. El usuario después indicará una operación: *, +, -, /. El programa visulizará el resultado de esa operación, o error si no se corresponde con ninguna.
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		String operacion;
		int a=0,b=0;
		
		System.out.println("Dame el primer número entero: ");
		a=teclado.nextInt();
		System.out.println("Dame el segundo número entero: ");
		b=teclado.nextInt();
		System.out.println("Dame la operación que deseas realizar (*,+,-,/): ");
		operacion=teclado.next();
		
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
			default:
				System.out.println("La operación introducida no se corresponde con las solicitadas.");
		}
		teclado.close();

	}

}
