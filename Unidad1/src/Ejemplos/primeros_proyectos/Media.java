package Ejemplos.primeros_proyectos;

public class Media {

	public static void main(String[] args) {
		float numero1,numero2; //podemos declarar variables del mismo tipo a continuacion una de otra.
		float media;
		
		numero1=4;
		numero2=7.5f; //hay que poner la f para que identifique que es un float.
		
		media=(numero1+numero2)/2;
		
		System.out.print("La media es: ");
		System.out.print(media);

		System.out.print("\nLa media es: "+media);
		
	}

}
