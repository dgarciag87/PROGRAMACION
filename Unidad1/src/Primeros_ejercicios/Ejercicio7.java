package Primeros_ejercicios;

public class Ejercicio7 {
	public static void main(String[] args) {
		double cateto1, cateto2;
		double hipotenusa;
		
		cateto1=5.5d;
		cateto2=10;
		
		hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));

		System.out.print("La hipotenusa del triangulo es: " +hipotenusa);
		

	}
}
