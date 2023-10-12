package Tarea22_AlmacenVerduleria;

public class Limpieza extends Producto{

    private String componentes;
    private double litros;

    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() { return componentes; }
    public double getLitros() { return litros; }
}
