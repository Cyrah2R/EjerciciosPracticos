package Tarea24_ProyectoMamiferos;

abstract public class Felinos extends Mamiferos {

    protected double tamanioGarras;
    protected int velocidad;

    public Felinos(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    public double getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
