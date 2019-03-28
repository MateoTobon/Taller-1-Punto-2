package com.appdispensador.app;
import mateo.tobon.dispensador.Model.*;

public class MaquinaDispensadora {

	public static void main(String[] args) {
		Producto arequipe = new Producto("Arequipe Alpina x 50g", "001", 12, 990);
		Producto avena = new Producto("Avena Alpina sabor a canela X 250g", "002",12, 2.990);
	    Producto barra = new Producto("Barra Tosh Lyne X 23g", "003", 12, 1.120);
	    Producto bimbo = new Producto("Bimboletes Bimbo sabor a coco X 40g", "004", 12, 1.250);
	    Producto choclitos = new Producto("Choclito Limon X 27g", "005", 12, 900);
	    
	    System.out.println("choclitos");
	}

}
