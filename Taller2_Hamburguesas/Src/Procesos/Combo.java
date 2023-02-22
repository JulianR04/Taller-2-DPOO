package Procesos;

import java.util.List;

public class Combo implements Producto{

	private String nombreCombo;
	private Double descuento;
	private List<ProductoMenu> Productos;
	public Combo(Double descuento, String nombreCombo, List<ProductoMenu> Productos) {
		this.descuento = descuento;
		this.nombreCombo = nombreCombo;
		this.Productos= Productos;
	}
	
	public void agregarItemsACombo(ProductoMenu itemCombo) {
		this.Productos.add(itemCombo);
	}

	public int getPrecio() {
		int precio_parcial= 0;
		for (int j=0;j<this.Productos.size();j++) {
			precio_parcial= precio_parcial + (Productos.get(j)).getPrecio();
		}
		int precio_final = (int) (precio_parcial - (Double) (precio_parcial*this.descuento*0.01));
		return precio_final;
	}
	public String getNombre() {
		return this.nombreCombo;
	}
	public List<ProductoMenu> getlista() {
		return this.Productos;
	}
	
	public String generarTextoFactura() {	
			String textoFactura= this.nombreCombo + " ; " + Integer.toString(getPrecio());
			return textoFactura;
		}
	}