package mateo.tobon.dispensador.Model;

public class Producto {


	private String nombre;
	private String codigo;
	private int unidadesProducto;
	private double precio;

	public Producto(String nombre, String codigo, int unidadesProducto, double precio) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.unidadesProducto = unidadesProducto;
		this.precio = precio;
		
	}
	
	
	public int getUnidadesProducto() {
		return unidadesProducto;
	}

	public void setUnidadesProducto(int unidadesProducto) {
		this.unidadesProducto = unidadesProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	
	
	//Metodo remover producto
	public void removerProducto() {
		 this.unidadesProducto = unidadesProducto -1;
		 
		
		}
	
	
	//Metodo aumentar producto
	public boolean aumentarUnidadesProducto(int cantidadAAumentar) {
		if (unidadesProducto < 12 ) {
			if(unidadesProducto + cantidadAAumentar > 12) {
				return false;
			}
			else {
				this.unidadesProducto += cantidadAAumentar;
				return true;
			}
		}
		
		else {
			return true;
		}
	}
		
}


