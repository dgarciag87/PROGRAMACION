package EjerciciosInicial;

import java.util.Scanner;

public class AutonomiaCondicionales {
//El ordenador de nuestro coche calcula los kil�metros que nos quedan antes de repostar.
	//Crea un programa que pida: tama�o del dep�sito (en litros), porcentaje del dep�sito que est� lleno y litros de consumo por 100kms.
	//El programa mostrar� los kil�metros que quedan de autonom�a.
	//Si quedan menos de 30 kil�metros mostrar� un aviso de que hay que repostar porque estamos usando la reserva.
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double tama�o=0,porcentaje=0,consumo=0,autonomia=0;
		
		System.out.println("Introduzca el tama�o del dep�sito (en litros): ");
		tama�o=teclado.nextDouble();
		System.out.println("Introduzca el porcentaje de combustible que haya (sin el caracter %): ");
		porcentaje=teclado.nextDouble();
		System.out.println("Introduzca el consumo por cada 100 kms: ");
		consumo=teclado.nextDouble();
		
		autonomia=tama�o*(porcentaje/100);
		autonomia=(autonomia/consumo)*100;
		
		if(autonomia>=0) {
			System.out.println("La autonom�a del dep�sito permite recorrer: "+Math.round(autonomia*100)/100.0+" kilometros.");
		}else{
			System.out.println("Dato introducido no es correcto.");
		}
		
		if(autonomia>=0 && autonomia<30){
			System.out.println("El dep�sito ha entrado en reserva. Pare a repostar. ("+Math.round(autonomia*100)/100.0+" kms de autonom�a).");
		}else if(autonomia>=30){
			System.out.println("La autonom�a es correcta. Puede continuar.");
		}
		teclado.close();
	}

}
