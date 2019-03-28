package mateo.tobon.dispensador.Model;

public class Producto {

	public Producto() {
	}

	private String nombre;
	private String codigo;
	private int unidades;
	private double precio;

	public Producto(String nombre, String codigo, int unidades, double precio) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.unidades = unidades;
		this.precio = precio;
		
		
	}
	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
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


}