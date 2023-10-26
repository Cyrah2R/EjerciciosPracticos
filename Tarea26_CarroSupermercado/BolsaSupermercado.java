package Tarea26_CarroSupermercado;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
	
	private List<T> productos;
	private int maxProductos = 5;
	
	public BolsaSupermercado() {
		this.productos = new ArrayList<T>();
	}
	
	public List<T> getProductos(){
		return productos;
	}
	
	public void addProducto(T p) {
		if(this.productos.size() <= maxProductos) {
			this.productos.add(p);
		}else {
			System.out.println("No se puede añadir mas productos");
		}
	}
}
