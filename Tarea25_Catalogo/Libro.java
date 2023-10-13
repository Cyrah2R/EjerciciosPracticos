package Tarea25_Catalogo;

import Tarea25_Catalogo.Interface.ILibro;
import java.util.Date;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion = new Date();
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String autor, String titulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.21;
    }
}
