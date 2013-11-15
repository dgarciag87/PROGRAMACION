package Primeros_ejercicios;

public class Ejercicio2_Operadores {

	public static void main(String[] args) {
		boolean a,b;
		
		a=3>5;
		b=12!=8;
		
		System.out.println("a\tb\ta and b\t\ta or b\t\tnot a\t\tnot b");
		System.out.println("3>5\t12!=8\t"+(a && b)+"\t\t"+(a || b)+"\t\t"+(!a)+"\t\t"+(!b));
		
		a=5>=6;
		b=3!=3; // DA WARNING YA QUE ECLIPSE RECONOCE QUE ESTÁS COMPARANDO DOS ENTEROS IGUALES
		System.out.println("5>=6\t3!=3\t"+(a && b)+"\t\t"+(a || b)+"\t\t"+(!a)+"\t\t"+(!b));
		
		/* ESTO DA UN ERROR YA QUE NO PUEDE AGRUPAR BOOLEAN CON ENTEROS
		 * a=-7==8;
		 * b=22;
		 */
		 System.out.println("-7==8\t22\tERROR\t\tERROR\t\tERROR\t\tERROR");
		
		
		a=21!=12;
		b=true;
		System.out.println("21!=12\ttrue\t"+(a && b)+"\t\t"+(a || b)+"\t\t"+(!a)+"\t\t"+(!b));
		
		a=4==2;
		b=7>=-9;
		System.out.println("4==2\t7>=-9\t"+(a && b)+"\t\t"+(a || b)+"\t\t"+(!a)+"\t\t"+(!b));
	}

}
