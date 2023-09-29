/*
Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental,
descripción String, fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con
4 elementos: Producto[] productos.
En la clase OrdenCompra, crear constructor que inicialice solo la descripción.
En la clase OrdenCompra, crear métodos getter para todos los atributos.
En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.
Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método public void addProducto
(Producto producto), nada más, es decir no se pueden agregar en el constructor ni en métodos setter.
La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.
 */

package Tarea20_ProyectoOrdenCompra;

import java.util.Date;
public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoId;
    private int i;

    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        this.id = ++ultimoId;
        this.productos = new Producto[4];
    }
    public int getId(){
        return id;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha){ this.fecha = fecha; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Producto[] getProductos() {
        return productos;
    }

    public OrdenCompra addProducto(Producto producto){
        if(i < this.productos.length){
            this.productos[i++] = producto;
        }
        return this;
    }
    public int granTotal(){
        int total = 0;
        for(Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }
}
