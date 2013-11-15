package Ejemplos.graficos;

import Ejemplos.graphics.Color;
import Ejemplos.graphics.Ellipse;
import Ejemplos.graphics.Rectangle;


public class Semaforo {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		
		caja=new Rectangle(10,10,60,110);
		caja.draw();
		
		palo=new Rectangle(30,120,20,100);
		palo.draw();
		
		palo.fill();
		
		verde=new Ellipse(35,80,20,20);
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
		
	}

}
