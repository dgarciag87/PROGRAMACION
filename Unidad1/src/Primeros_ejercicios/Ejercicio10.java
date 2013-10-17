package Primeros_ejercicios;

public class Ejercicio10 {
	public static void main(String[] args) {
		float x,y,z;
		final float PI=3.14f;
		boolean a,b,c,d,e,f;
		
		a=((4-2)*(5+1)/2)>2-(4+3);
		System.out.print("\nEl resultado es: "+a);
		
		b=(6+3)>8 && (6-1)*2 < 8 || 23==8;
		System.out.print("\nEl resultado es: "+b);
		
		x=7;
		z=2;
		c=(1.0 < x) && (x < z+7.0);
		System.out.print("\nEl resultado es: "+c);
			
		x=1;
		y=4;
		z=10;
		d=(PI * x*x > y || 2*PI*x <= z);
		System.out.print("\nEl resultado es: "+d);
				
		x=1;
		y=4;
		z=10;
		e=(x>3 && y==4 || x + y <= z);
		System.out.print("\nEl resultado es: "+e);
			
		x=1;
		y=4;
		z=10;
		f=(x>3 && (y==4 || x + y <= z));
		System.out.print("\nEl resultado es: "+f);		
	}
}
