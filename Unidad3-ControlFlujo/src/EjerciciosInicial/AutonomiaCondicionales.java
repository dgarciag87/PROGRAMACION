package EjerciciosInicial;

import java.util.Scanner;

public class AutonomiaCondicionales {
//El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar.
	//Crea un programa que pida: tamaño del depósito (en litros), porcentaje del depósito que está lleno y litros de consumo por 100kms.
	//El programa mostrará los kilómetros que quedan de autonomía.
	//Si quedan menos de 30 kilómetros mostrará un aviso de que hay que repostar porque estamos usando la reserva.
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double tamaño=0,porcentaje=0,consumo=0,autonomia=0;
		
		System.out.println("Introduzca el tamaño del depósito (en litros): ");
		tamaño=teclado.nextDouble();
		System.out.println("Introduzca el porcentaje de combustible que haya (sin el caracter %): ");
		porcentaje=teclado.nextDouble();
		System.out.println("Introduzca el consumo por cada 100 kms: ");
		consumo=teclado.nextDouble();
		
		autonomia=tamaño*(porcentaje/100);
		autonomia=(autonomia/consumo)*100;
		
		if(autonomia>=0) {
			System.out.println("La autonomía del depósito permite recorrer: "+Math.round(autonomia*100)/100.0+" kilometros.");
		}else{
			System.out.println("Dato introducido no es correcto.");
		}
		
		if(autonomia>=0 && autonomia<30){
			System.out.println("El depósito ha entrado en reserva. Pare a repostar. ("+Math.round(autonomia*100)/100.0+" kms de autonomía).");
		}else if(autonomia>=30){
			System.out.println("La autonomía es correcta. Puede continuar.");
		}
		teclado.close();
	}

}
