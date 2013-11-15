package EjerciciosInicial;

import java.util.Scanner;

public class BisiestoCondicionales {
//Un año es bisiesto si es divisible entre 4, excepto el último de cada siglo (aquel divisible por 100),
	//salvo que este último sea divisible por 400 http://es.wikipedia.org/wiki/Año_bisiesto.
	//Haz un programa que pida un año y muestre un mensaje de si es o no bisiesto.
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);  
	       int a=0;  
	      System.out.println("Ingrese un año: ");  
	      a= teclado.nextInt();  
	      
	     if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){  
	         System.out.println("El año "+a+" Si es bisiesto.");  
	     }else{  
	         System.out.println("El año "+a+" No es bisiesto.");  
	     }  
	     teclado.close();
	}

}
