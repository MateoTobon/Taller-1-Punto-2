package com.appdispensador.app;
import java.util.ArrayList;
import java.util.Arrays;


import mateo.tobon.dispensador.Model.Dispensador;
import mateo.tobon.dispensador.Model.Producto;

public class MaquinaDispensadora {
	
	public static void main(String[] args) {
		
		Dispensador maquina = new Dispensador("Dispensador de Mecato");
		
		Producto arequipe = new Producto("Arequipe Alpina x 50g", "001", 11, 990);
		Producto avena = new Producto("Avena Alpina sabor a canela X 250g", "002",12, 2990);
	    Producto barra = new Producto("Barra Tosh Lyne X 23g", "003", 0, 1120);
	    Producto bimbo = new Producto("Bimboletes Bimbo sabor a coco X 40g", "004", 0, 1250);
	    Producto choclitos = new Producto("Choclito Limon X 27g", "005", 12, 900);
	    Producto chococrispis = new Producto("Choco Crispis de Melvin X 35g", "006", 12 , 1000);
	    Producto gol = new Producto("Chocolate Gol sabor a coco X 31g", "007", 12, 800);
	    Producto jumbo = new Producto("Chocolatina Jumbo Flowblancmini", "008", 9, 600);
	    Producto mix = new Producto("Chocolatina Jumbo Mix X 60g", "009", 11, 1599);
	    Producto galleta = new Producto("Galleta club social original X 26g", "010", 7 , 450);
		
		
				ArrayList<Producto> productos = new ArrayList<Producto>(Arrays.asList(arequipe, avena, barra, bimbo, choclitos, chococrispis, gol, jumbo, mix, galleta));
		        maquina.setProductos(productos);
		        
		      
				
				
				//Nombre y precio de un producto
				
		        System.out.println("El primero producto de mi máquina es el " + arequipe.getNombre() + " y cuesta " + arequipe.getPrecio() + "$" + "\n");
				System.out.println("El segundo producto de mi máquina es el " + avena.getNombre() + " y cuesta " + avena.getPrecio() + "$" + "\n");
				System.out.println("El tercer producto de mi máquina es el " + barra.getNombre() + " y cuesta " + barra.getPrecio() + "$" + "\n");
				System.out.println("El cuarto producto de mi máquina es el " + bimbo.getNombre() + " y cuesta " + bimbo.getPrecio() + "$" + "\n");
				System.out.println("El quinto producto de mi máquina es el " + choclitos.getNombre() + " y cuesta " + choclitos.getPrecio() + "$" + "\n");
				System.out.println("El sexto producto de mi máquina es el " + chococrispis.getNombre() + " y cuesta " + chococrispis.getPrecio() + "$" + "\n");
				System.out.println("El séptimo producto de mi máquina es el " + gol.getNombre() + " y cuesta " + gol.getPrecio() + "$" + "\n");
				System.out.println("El octavo producto de mi máquina es el " + jumbo.getNombre() + " y cuesta " + jumbo.getPrecio() + "$" + "\n");
				System.out.println("El noveno producto de mi máquina es el " + mix.getNombre() + " y cuesta " + mix.getPrecio() + "$" + "\n");
				System.out.println("El décimo producto de mi máquina es el " + galleta.getNombre() + " y cuesta " + galleta.getPrecio() + "$" + "\n");

				//Retirar una unidad de un producto de acuerdo a su código.
				maquina.retirarProducto("008");
				System.out.println(jumbo.getUnidadesProducto());
				
				//Retirar una unidad de un producto de acuerdo a su nombre.
				maquina.retirarProducto("Galleta club social original X 26g");
				System.out.println(galleta.getUnidadesProducto() + "\n");
				
				//Nombre de los productos agotados.
				System.out.println("Los productos agotados son: " + maquina.consultarProductosAgotados() + "\n");
				
				//Total de unidades de un producto determinado.
				System.out.println("El total de unidades de " + avena.getNombre() + " que hay son:  " + maquina.consultarTotalUnidadesDeProducto(avena) + "\n");
				
				//Total de unidades de todos los productos.
				System.out.println("El total de unidades de todos los productos es: " + maquina.consultarTotalUnidadesTodosProductos() + "\n");

				//aumentar producto con la condicion de que solo se pueden almacenar 12 productos
				maquina.aumentarCantidadUnidadesProducto(arequipe, 20);
				System.out.println(arequipe.getUnidadesProducto());
				maquina.aumentarCantidadUnidadesProducto(avena, 20);
				System.out.println(avena.getUnidadesProducto());
				maquina.aumentarCantidadUnidadesProducto(barra, 20);
				System.out.println(barra.getUnidadesProducto());
				maquina.aumentarCantidadUnidadesProducto(arequipe, 20);
				System.out.println(arequipe.getUnidadesProducto());
				maquina.aumentarCantidadUnidadesProducto(mix, 20);
				System.out.println(mix.getUnidadesProducto());
				maquina.aumentarCantidadUnidadesProducto(arequipe, 20);
				System.out.println(arequipe.getUnidadesProducto());
				maquina.aumentarCantidadUnidadesProducto(mix, 20);
				System.out.println(mix.getUnidadesProducto());
				maquina.aumentarCantidadUnidadesProducto(arequipe, 20);
				System.out.println(arequipe.getUnidadesProducto());
	    
	}

}