package Tarea26_CarroSupermercado;

public class NoPerecedero extends Producto{
	
	private int contenido;
	private int calorias;
	
	public NoPerecedero(int contenido, int calorias, String nombre, double precio) {
		super(nombre, precio);
		this.contenido = contenido;
		this.calorias = calorias;
	}
	
	public int getContenido() {
		return contenido;
	}
	
	public int getCalorias() {
		return calorias;
	}
}
