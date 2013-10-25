package Primeros_ejercicios;

public class Ejercicio5 {
	public static void main(String[] args) {
		int radio; 
		double volumen, PI;
		radio=24;
		PI=3.1416f;
		
		volumen=((4*PI*(Math.pow(radio,3)))/3);
		
		System.out.print("El volumen de la esfera es: " +Math.round(volumen*100)/100.0);

	}
}
