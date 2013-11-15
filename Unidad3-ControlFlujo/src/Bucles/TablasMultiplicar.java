package Bucles;

import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el número de tabla de multiplicar que desee visualizar: ");
		int numero=teclado.nextInt();
		int linea=1;
		System.out.println("Tabla del: "+numero+"\n");
		/*while(linea<=10){
			System.out.println(numero+" x "+linea+" = "+(numero*linea));
			linea++;
		}*/
		do{
			System.out.println(numero+" x "+linea+" = "+(numero*linea));
			linea++;
		}while(linea<=10);
		teclado.close();
	}

}
