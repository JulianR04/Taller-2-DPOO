package Procesos;

public class ProductoMenu implements Producto {
	private String nombre;
	private int precioBase;
	
	public ProductoMenu(String nombre, int precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase; 
		
	}
	
	public String toString() {
		return this.nombre +"\t" + this.precioBase;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPrecio() {
		// TODO Auto-generated method stub
		return this.precioBase;
	}

}
