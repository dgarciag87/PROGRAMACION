package EjerciciosInicial;

import java.util.Scanner;
//Pide un número del 1 al 7. Imprime el día de la semana equivalente (con letra).
public class DiaSemana {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero_dia;
		String letra_dia="";
		
		System.out.print("Dame el día de la semana (en número): ");
		numero_dia=teclado.nextInt();
		
		/*if (numero_dia==1){
			//letra_dia=new String("Lunes");
			letra_dia="Lunes";
		}else if(numero_dia==2){
			letra_dia="Martes";
		}else if(numero_dia==3){
			letra_dia="Miércoles";
		}else if(numero_dia==4){
			letra_dia="Jueves";
		}else if(numero_dia==5){
			letra_dia="Viernes";
		}else if(numero_dia==6){
			letra_dia="Sábado";
		}else if(numero_dia==7){
			letra_dia="Domingo";
		}else{
			System.out.println("El número introducido no corresponte a ningún día de la semana.");
			letra_dia="Error";
		}
		if(!letra_dia.equals("Error")){//si la cadena contiene error devuelve cierto, pero como lo negamos produce un false y produce lo contrario, por lo que se ejecutará el if.
			System.out.println("El día "+numero_dia+" corresponde al: "+letra_dia);
		}*/
		
		switch(numero_dia){
			case 1: 
				letra_dia="Lunes";
				break;
			case 2:
				letra_dia="Martes";
				break;
			case 3:
				letra_dia="Miércoles";
				break;
			case 4:
				letra_dia="Jueves";
				break;
			case 5:
				letra_dia="Viernes";
				break;
			case 6:
				letra_dia="Sábado";
				break;
			case 7:
				letra_dia="Domingo";
				break;
			default:
				System.out.println("El número introducido no corresponte a ningún día de la semana.");
				letra_dia="Error";	
		}
		if(!letra_dia.equals("Error")){//si la cadena contiene error devuelve cierto, pero como lo negamos produce un false y produce lo contrario, por lo que se ejecutará el if.
			System.out.println("El día "+numero_dia+" corresponde al: "+letra_dia);
		}
		
		teclado.close();
	}

}
