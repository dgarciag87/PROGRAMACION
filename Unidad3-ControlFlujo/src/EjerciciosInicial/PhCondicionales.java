package EjerciciosInicial;

import java.util.Scanner;

public class PhCondicionales {
//Escribe un programa que pida el ph de una solución y muestre el mensaje de si la solución es ácida (ph < 7.0)
	//o peligrósamente ácida: ph < 3.0).
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);  
	    float ph=0;  
	    System.out.println("Ingrese un Ph: ");  
	    ph= teclado.nextFloat();
	    
	    if(ph<7.0 && ph>3.0){
	    	System.out.println("La solución es ácida.");
	    }else if(ph>=0 && ph<=3.0){
	    	System.out.println("La solución es peligrosamente ácida.");
	    }else{
	    	System.out.println("El valor introducido no corresponde con una solución ácida.");
	    }
	      
	    teclado.close();
	}

}
