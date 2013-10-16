package Ejemplos.primeros_proyectos;

public class Identificadores {

	public static void main(String[] args) {
		int año; //declaración de una variable entera y le damos el identificador año.
				 //int 1año; no sería válido porque debe empezar por letra.
		int Año=2012; //si declarásemos otra variable int Año; sería válida ya que distingue entre mayús y minús.
					//se puede inicializar la variable en su declaración o hacerlo como abajo.
		
		año=2013; //estamos indicando que el valor de año es 2013 (inicializando).
		
		System.out.println("El año es " + año);
		System.out.println("El Año es " + Año);

	}

}
