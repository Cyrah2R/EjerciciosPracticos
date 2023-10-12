package Tarea24_ProyectoMamiferos;

abstract public class Caninos extends Mamiferos {

    protected String color;
    protected double colmillos;

    public Caninos(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double colmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.colmillos = colmillos;
    }

    public String getColor() {
        return color;
    }

    public double getColmillos() {
        return colmillos;
    }
}
