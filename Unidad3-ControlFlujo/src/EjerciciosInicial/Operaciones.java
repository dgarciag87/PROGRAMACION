package EjerciciosInicial;

import java.util.Scanner;

public class Operaciones {
//Escribe un programa que pida dos n�meros enteros. El usuario despu�s indicar� una operaci�n: *, +, -, /. El programa visulizar� el resultado de esa operaci�n, o error si no se corresponde con ninguna.
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		String operacion;
		int a=0,b=0;
		
		System.out.println("Dame el primer n�mero entero: ");
		a=teclado.nextInt();
		System.out.println("Dame el segundo n�mero entero: ");
		b=teclado.nextInt();
		System.out.println("Dame la operaci�n que deseas realizar (*,+,-,/): ");
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
				System.out.println("La operaci�n introducida no se corresponde con las solicitadas.");
		}
		teclado.close();

	}

}
