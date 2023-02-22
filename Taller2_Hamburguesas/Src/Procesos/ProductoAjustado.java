package Procesos;

import java.util.ArrayList;

public class ProductoAjustado implements Producto{
		//ATRIBUTOS
	private String nombre;
	private int precio;
	private ArrayList<Ingrediente> Agregados;
	private ArrayList<Ingrediente> Eliminados;
	
	
	public int calcularPrecio(ArrayList<Ingrediente> agregados, int precio_base) {
		int precioFinal= precio_base;
		for (int i=0; i<agregados.size(); i++) {
			Ingrediente ingrediente_actual= agregados.get(i);
			int precioASumar= ingrediente_actual.getCostoAdicional();
			precioFinal= precioFinal + precioASumar;
		}
		return precioFinal;	
	}	
		public ProductoAjustado (ProductoMenu base, ArrayList<Ingrediente> agregados, ArrayList<Ingrediente> eliminados) {
			super();
			this.nombre = base.getNombre();
			this.precio= calcularPrecio(agregados, base.getPrecio());
			this.setAgregados(agregados);
			this.setEliminados(eliminados);
		}

		
		public int getPrecio() {
			return precio;
		}
		
		public String getNombre() {
			return nombre;
		}
		public String generarTextoFactura() {

				String textoFactura= this.nombre + " (ProductoAjustado)"+ " ; " + Integer.toString(getPrecio());
				return textoFactura;
			}
		public ArrayList<Ingrediente> getAgregados() {
			return Agregados;
		}
		public void setAgregados(ArrayList<Ingrediente> agregados) {
			Agregados = agregados;
		}
		public ArrayList<Ingrediente> getEliminados() {
			return Eliminados;
		}
		public void setEliminados(ArrayList<Ingrediente> eliminados) {
			Eliminados = eliminados;
		}
		
}