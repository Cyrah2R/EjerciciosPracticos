package Tarea25_Catalogo;

import Tarea25_Catalogo.Interface.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {

    private String fabricante;

    public Electronico(int precio, String fabricante){
        super (precio);
        this.fabricante = fabricante;
    }

    public String getFabricante(){
        return fabricante;
    }
}
