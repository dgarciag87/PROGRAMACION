package EjerciciosInicial;

import java.util.Scanner;

public class DiaLaborableCadena {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String dia;
		
		System.out.print("Dame el día de la semana (en número): ");
		dia=teclado.nextLine();
		
		/*
		 dia=dia.toLowerCase();
		 if(dia.equals("lunes"))//dia=="lunes"
		 
		 (comienzo de hacerlo con el if)
		 */
		
		switch (dia.toLowerCase()){//transforma lo introducido en dia en minisculas
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("Día laborable.");
				break;
			case "sabado":
			case "domingo":
				System.out.println("Día festivo.");
				break;
			default:
				System.out.println("El día introducido no corresponde a ningún día de la semana.");
		}
		teclado.close();
	}

}
