package Primeros_ejercicios;

public class Ejercicio4 {
	public static void main(String[] args) {
		int radio; 
		float perimetro,area,PI;
		radio=4;
		PI=3.1416f;
		
		area=(PI*(radio^2));
		perimetro=(2*PI*radio);
		
		System.out.print("El area del circulo es: " +area);
		
		System.out.print("\nEl perimetro del circulo es: ");
		System.out.print(perimetro);

	}
}
