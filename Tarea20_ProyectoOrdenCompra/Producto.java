/*
Crear la clase Producto con tres atributos: fabricante, tipo String y nombre String y precio int, inicializar todos sus
valores en el constructor e implementar sus respectivos métodos getter.
*/

package Tarea20_ProyectoOrdenCompra;
public class Producto {
    private String fabricante;
    private String nombre;
    private int precio = 0;

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getFabricante(){
        return fabricante;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
}
