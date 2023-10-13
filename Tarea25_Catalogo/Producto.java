package Tarea25_Catalogo;

import Tarea25_Catalogo.Interface.IProducto;

abstract public class Producto implements IProducto {

    private int precio;

    public Producto(int precio){
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
