package EjerciciosInicial;

import java.util.Scanner;

public class PiedraPapelTijeraCondicionales {
//El juego de piedra/papel/tijera. Haz un programa para jugar a piedra/papel/tijera con el ordenador. Solo una ronda por ejecución.
	//para obtener un número aleatorio en Java entre 1 y 3: resultado = (int )(Math.random() * 3 + 1);
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);  
	    int eleccion=0,resultado=0;  
	    System.out.println("¿Piedra(1), papel(2) o tijera(3)?: ");  
	    eleccion= teclado.nextInt();
	    
	    resultado=(int)(Math.random()*3+1);
	    
	    System.out.println("User: "+eleccion);
	    System.out.println("Computer: "+resultado);
	    
	    if(eleccion>=1 && eleccion<=3){
	    	if(eleccion==resultado){
	    		System.out.println("EMPATE.");
	    	}else{
	    		switch (eleccion){
	    			case 1:
	    				if(resultado==2){
	    					System.out.println("PIERDES. Papel gana a piedra.");
	    				}else if(resultado==3){
	    					System.out.println("GANAS. Piedra gana a tijera.");
	    				}
	    				break;
	    			case 2:
	    				if(resultado==1){
	    					System.out.println("GANAS. Papel gana a piedra.");
	    				}else if(resultado==3){
	    					System.out.println("PIERDES. Tijera gana a papel.");
	    				}
	    				break;
	    			case 3:
	    				if(resultado==1){
	    					System.out.println("PIERDES. Piedra gana a tijera.");
	    				}else if(resultado==2){
	    					System.out.println("GANAS. Tijera gana a papel.");
	    				}
	    				break;
	    		}
	    	}
	    }else{
	    	System.out.println("El valor introducido no es correcto.");
	    }
	    teclado.close();
	}

}
