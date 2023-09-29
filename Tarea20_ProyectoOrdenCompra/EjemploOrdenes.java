/*
La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:

Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental,
descripción String, fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con
4 elementos: Producto[] productos.
En la clase OrdenCompra, crear constructor que inicialice solo la descripción.
En la clase OrdenCompra, crear métodos getter para todos los atributos.
En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.
Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método public void addProducto
(Producto producto), nada más, es decir no se pueden agregar en el constructor ni en métodos setter.
La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.

Crear la clase Producto con tres atributos fabricante tipo String y nombre String y precio int, inicializar todos sus
valores en el constructor e implementar sus respectivos métodos getter.

Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus valores en el constructor e implementar
sus respectivos métodos getter.

Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:
Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden con
distintos productos, que no se repitan.
Para cada una imprimir sus valores en consola usando método getter incluyendo los productos, donde con el método getter
obtenemos el arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante, nombre y precio.
Tener en cuenta en la salida el gran total de cada orden, los clientes, todo.
*/

package Tarea20_ProyectoOrdenCompra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        OrdenCompra orden1 = new OrdenCompra("Compras Estudio Tatuaje");
        orden1.setFecha(new Date());
        orden1.setCliente(new Cliente("Enrique", "Miranda"));
        orden1.addProducto(new Producto("Ink Color","Tinta black", 18))
              .addProducto(new Producto("Ink Color","Agujas", 8))
              .addProducto(new Producto("Ink Color","SOAP", 24))
              .addProducto(new Producto("Ink Color","Guantes", 6));

        OrdenCompra orden2 = new OrdenCompra("Compras Restaurante");
        orden2.setFecha(new Date());
        orden2.setCliente(new Cliente("Oscar", "Calleja"));
        orden2.addProducto(new Producto("De Miguel","Trufa Negra", 180))
              .addProducto(new Producto("De Miguel","Alga nori", 8))
              .addProducto(new Producto("Norteños","Chile Pasilla", 12))
              .addProducto(new Producto("Norteños","Tortillas maiz", 14));

        OrdenCompra orden3 = new OrdenCompra("Compras Tienda Ropa");
        orden3.setFecha(new Date());
        orden3.setCliente(new Cliente("Laura", "Bermudez"));
        orden3.addProducto(new Producto("JC Moda","Pantalon vaquero", 24))
              .addProducto(new Producto("JC Moda","Camisa rayas", 18))
              .addProducto(new Producto("Boutique Madrid","Chaqueton piel", 240))
              .addProducto(new Producto("Store Shoes","Zapatillas", 36));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};
        for(OrdenCompra orden : ordenes){
            System.out.println("Cliente: " + orden.getId() + ".- "+ orden.getCliente());
            System.out.println("Descripcion = " + orden.getDescripcion());
            System.out.println("Fecha de Orden: " + formatoFecha.format(orden.getFecha()));

            int i = 1;
            for (Producto pr : orden.getProductos()){
                System.out.println("Producto nº" + i + ": " + pr.getNombre() +
                                    "; Fabricante: " + pr.getFabricante() +
                                    "; Precio: " + pr.getPrecio() + " €.");
                i++;
            }

            System.out.println("Coste Total de la compra: " + orden.granTotal() + " €.");
            System.out.println();

        }
    }
}
