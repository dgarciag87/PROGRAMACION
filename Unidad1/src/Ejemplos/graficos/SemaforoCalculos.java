package Ejemplos.graficos;

import Ejemplos.graphics.Color;
import Ejemplos.graphics.Ellipse;
import Ejemplos.graphics.Rectangle;


public class SemaforoCalculos {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		int ancho,alto,centro_x,centro_y,diametro_disco;
		
		//inicializamos los valores del dibujo del semaforo
		ancho=150;
		alto=300;
		centro_x=100;
		centro_y=200;
		diametro_disco=ancho/2;
		
		caja=new Rectangle(centro_x-ancho/2, centro_y-alto/2,ancho,alto);
		caja.fill();
		caja.setColor(Color.GRAY);
		palo=new Rectangle(centro_x-ancho/10,centro_y+alto/2,ancho/5,alto);
		palo.fill();
		
		rojo=new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco*2+10,diametro_disco,diametro_disco);
		rojo.setColor(Color.RED);
		rojo.fill();
		
		ambar=new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco/2,diametro_disco,diametro_disco);
		ambar.setColor(Color.ORANGE);
		ambar.fill();
		
		verde=new Ellipse(centro_x-diametro_disco/2,centro_y+diametro_disco-10,diametro_disco,diametro_disco);
		verde.setColor(Color.GREEN);
		verde.fill();

		
		/*verde=new Ellipse(35,80,20,20);
		verde.setColor(new Color(0,200,0));
		//Color color_verde=new Color(0,200,0);
		//verde.setColor(color_verde);
		
		ambar=new Ellipse(35,55,20,20);
		ambar.setColor(new Color(255,255,0));
		
		rojo=new Ellipse(35,40,20,20);
		rojo.setColor(new Color(255,0,0));

		verde.fill();
		ambar.fill();
		rojo.fill();
		*/
	}
}