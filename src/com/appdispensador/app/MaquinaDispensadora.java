package com.appdispensador.app;
import java.util.ArrayList;
import java.util.Arrays;

import mateo.tobon.dispensador.Model.Dispensador;
import mateo.tobon.dispensador.Model.Producto;

public class MaquinaDispensadora {
	
	public static void main(String[] args) {
		
		Dispensador maquina = new Dispensador("Dispensador de Mecato");
		
		Producto arequipe = new Producto("Arequipe Alpina x 50g", "001", 12, 990);
		Producto avena = new Producto("Avena Alpina sabor a canela X 250g", "002",12, 2.990);
	    Producto barra = new Producto("Barra Tosh Lyne X 23g", "003", 12, 1.120);
	    Producto bimbo = new Producto("Bimboletes Bimbo sabor a coco X 40g", "004", 12, 1.250);
	    Producto choclitos = new Producto("Choclito Limon X 27g", "005", 12, 900);
	    Producto chococrispis = new Producto("Choco Crispis de Melvin X 35g", "006", 12 , 1.000);
	    Producto gol = new Producto("Chocolate Gol sabor a coco X 31g", "007", 12, 800);
	    Producto jumbo = new Producto("Chocolatina Jumbo Flowblancmini", "008", 12, 600);
	    Producto mix = new Producto("Chocolatina Jumbo Mix X 60g", "009", 12, 1.599);
	    Producto galleta = new Producto("Galleta club social original X 26g", "010", 12 , 450);
		
		//lista de productos
				ArrayList<Producto> productos = new ArrayList<Producto>(Arrays.asList(arequipe, avena, barra, bimbo, choclitos, chococrispis, gol, jumbo, mix, galleta));
		        maquina.setProductos(productos);
		        
		      //pruebas
				
				
				//conocer el nombre y precios de un producto
				System.out.println("El primero producto de mi máquina es el " + arequipe.getNombre() + " y cuesta " + arequipe.getPrecio() + " pesos" + "\n");
				
				//sacar una unidad de un producto de acuerdo a su nombre
				maquina.retirarProducto("Galleta club social original");
				System.out.println(galleta.getUnidadesProducto());
				
				//sacar una unidad de un producto de acuerdo a su codigo
				maquina.retirarProducto("005");
				System.out.println(choclitos.getUnidadesProducto() + "\n");
				
				//consultar el nombre de productos agotados
				System.out.println("Los productos agotados son: " + maquina.consultarProductosAgotados() + "\n");
				
				//consultar el total de unidades de un producto determinado
				System.out.println("El total de unidades de " + barra.getNombre() + " que hay son  " + maquina.consultarTotalUnidadesDeProducto(barra) + "\n");
				
				//consultar el total de unidades de todos los productos
				System.out.println("El total de unidades de todos los productos es " + maquina.consultarTotalUnidadesTodosProductos() + "\n");

				//aumentar producto con la condicion de que solo se pueden almacenar 12 productos
				maquina.aumentarCantidadUnidadesProducto(chococrispis, 3);
				System.out.println(chococrispis.getUnidadesProducto());
				maquina.aumentarCantidadUnidadesProducto(gol, 6);
				System.out.println(gol.getUnidadesProducto() + "\n");
	    
	}

}