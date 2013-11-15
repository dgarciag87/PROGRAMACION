package EjerciciosInicial;

import java.util.Scanner;

public class DescuentoCondicionales {
//Una tienda hace un descuento del 10% por compras menores de 20€,
	//un 20% por compras entre 20 y 50€ y un 25% si la compra es mayor.
	//Escribe un programa que pida el precio de un producto y muestre su precio final en las rebajas.
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double precio=0,precio2=0;
		
		System.out.println("Introduzca el precio para realizar el descuento: ");
		precio=teclado.nextDouble();
		
		if(precio>0 && precio<20){
			precio2=precio*0.9;
			System.out.println("Precio del artículo: "+precio+"€");
			System.out.println("Descuento aplicado: 10%. \nPrecio TOTAL: "+Math.round(precio2*100)/100.0+"€");
		}else if (precio>=20 && precio<50){
			precio2=precio*0.8;
			System.out.println("Precio del artículo: "+precio+"€");
			System.out.println("Descuento aplicado: 20%. \nPrecio TOTAL: "+Math.round(precio2*100)/100.0+"€");
		}else if (precio>=50){
			precio2=precio*0.75;
			System.out.println("Precio del artículo: "+precio+"€");
			System.out.println("Descuento aplicado: 25%. \nPrecio TOTAL: "+Math.round(precio2*100)/100.0+"€");
		}else {
			System.out.println("El precio introducido no se corresponde con lo establecido.");
		}
		
		teclado.close();
	}

}
