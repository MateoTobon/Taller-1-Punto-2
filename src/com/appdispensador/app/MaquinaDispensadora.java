package com.appdispensador.app;
import java.util.ArrayList;
import java.util.Arrays;


import mateo.tobon.dispensador.Model.Dispensador;
import mateo.tobon.dispensador.Model.Producto;

public class MaquinaDispensadora {
	
	public static void main(String[] args) {
		
		Dispensador maquina = new Dispensador("Dispensador de Mecato");
		
		Producto arequipe = new Producto("Arequipe Alpina x 50g", "001", 12, 990);
		Producto avena = new Producto("Avena Alpina sabor a canela X 250g", "002", 4, 2990);
	    Producto barra = new Producto("Barra Tosh Lyne X 23g", "003", 0, 1120);
	    Producto bimbo = new Producto("Bimboletes Bimbo sabor a coco X 40g", "004", 0, 1250);
	    Producto choclitos = new Producto("Choclitos Limon X 27g", "005", 5, 900);
	    Producto chococrispis = new Producto("ChocoCrispis de Melvin X 35g", "006", 1 , 1000);
	    Producto gol = new Producto("Chocolate Gol sabor a coco X 31g", "007", 3, 800);
	    Producto jumbo = new Producto("Chocolatina Jumbo Flowblancmini", "008", 2, 600);
	    Producto mix = new Producto("Chocolatina Jumbo Mix X 60g", "009", 1, 1599);
	    Producto galleta = new Producto("Galleta club social original X 26g", "010", 12 , 450);
		
		
		ArrayList<Producto> productos = new ArrayList<Producto>(Arrays.asList(arequipe, avena, barra, bimbo, choclitos, chococrispis, gol, jumbo, mix, galleta));
		        maquina.setProductos(productos);
		        
		      
				
				
				//Nombres y precios de los productos.
				
		        System.out.println("*El primer producto de la máquina es el " + arequipe.getNombre() + " y cuesta " + arequipe.getPrecio() + "$" + "\n");
				System.out.println("*El segundo producto de la máquina es la " + avena.getNombre() + " y cuesta " + avena.getPrecio() + "$" + "\n");
				System.out.println("*El tercer producto de la máquina es la " + barra.getNombre() + " y cuesta " + barra.getPrecio() + "$" + "\n");
				System.out.println("*El cuarto producto de la máquina son los " + bimbo.getNombre() + " y cuesta " + bimbo.getPrecio() + "$" + "\n");
				System.out.println("*El quinto producto de la máquina son los " + choclitos.getNombre() + " y cuesta " + choclitos.getPrecio() + "$" + "\n");
				System.out.println("*El sexto producto de la máquina son los " + chococrispis.getNombre() + " y cuesta " + chococrispis.getPrecio() + "$" + "\n");
				System.out.println("*El séptimo producto de la máquina es el " + gol.getNombre() + " y cuesta " + gol.getPrecio() + "$" + "\n");
				System.out.println("*El octavo producto de la máquina es la " + jumbo.getNombre() + " y cuesta " + jumbo.getPrecio() + "$" + "\n");
				System.out.println("*El noveno producto de la máquina es la " + mix.getNombre() + " y cuesta " + mix.getPrecio() + "$" + "\n");
				System.out.println("*El décimo producto de la máquina es la " + galleta.getNombre() + " y cuesta " + galleta.getPrecio() + "$" + "\n");

				//Retirar una unidad de un producto de acuerdo a su código.
				maquina.retirarProducto("008");
				System.out.println(jumbo.getUnidadesProducto());
				
				//Retirar una unidad de un producto de acuerdo a su nombre.
				maquina.retirarProducto("Galleta club social original X 26g");
				System.out.println(galleta.getUnidadesProducto() + "\n");
				
				//Nombre de los productos agotados.
				System.out.println("Los productos agotados en el momento son: " + maquina.consultarProductosAgotados() + "\n");
				
				//Total de unidades de un producto determinado.
				System.out.println("El total de unidades de " + avena.getNombre() + " que hay son:  " + maquina.consultarTotalUnidadesDeProducto(avena) + "\n");
				
				//Total de unidades de todos los productos.
				
				System.out.println("El total de unidades de todos los productos en la máquina son: " + maquina.consultarTotalUnidadesTodosProductos() + "\n");

				//Aumentar la cantidad de unidades de los productos.
				
				maquina.aumentarCantidadUnidadesProducto(arequipe, 3);
				System.out.println(arequipe.getNombre() + " es de: " + arequipe.getUnidadesProducto() + "\n");
				
				maquina.aumentarCantidadUnidadesProducto(avena, 40);
				System.out.println(avena.getNombre() + " es de: " + avena.getUnidadesProducto() + "\n");
				
				maquina.aumentarCantidadUnidadesProducto(barra, 1);
				System.out.println(barra.getNombre() + " es de: " + barra.getUnidadesProducto() + "\n");
				
				maquina.aumentarCantidadUnidadesProducto(bimbo, 2);
				System.out.println(bimbo.getNombre() + " es de: " + bimbo.getUnidadesProducto() + "\n");
				
				maquina.aumentarCantidadUnidadesProducto(choclitos, 5);
				System.out.println(choclitos.getNombre() + " es de: " + choclitos.getUnidadesProducto() + "\n");
				
				maquina.aumentarCantidadUnidadesProducto(chococrispis, 4);
				System.out.println(chococrispis.getNombre() + " es de: " + chococrispis.getUnidadesProducto() + "\n");
				
				maquina.aumentarCantidadUnidadesProducto(gol, 4);
				System.out.println(gol.getNombre() + " es de: " + gol.getUnidadesProducto()+ "\n");
				
				maquina.aumentarCantidadUnidadesProducto(jumbo, 3);
				System.out.println(jumbo.getNombre() + " es de: " + jumbo.getUnidadesProducto() + "\n");
				
				maquina.aumentarCantidadUnidadesProducto(mix, 9);
				System.out.println(mix.getNombre() + " es de: " + mix.getUnidadesProducto() + "\n");
				
				maquina.aumentarCantidadUnidadesProducto(galleta, 5);
				System.out.println(galleta.getNombre() + " es de: " + galleta.getUnidadesProducto() + "\n");
	    
	}

}