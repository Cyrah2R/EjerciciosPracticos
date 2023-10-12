package Tarea24_ProyectoMamiferos;

public class Perro extends Caninos{

    private int mordidaPSI;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double colmillos, int mordidaPSI) {
        super(habitat, altura, largo, peso, nombreCientifico, color, colmillos);
        this.mordidaPSI = mordidaPSI;
    }

    public int getMordidaPSI() {
        return mordidaPSI;
    }

    @Override
    public String comer() {
        return "-El perro rompe los huesos gracias a su mordida de " + mordidaPSI + " psi";
    }

    @Override
    public String dormir() {
        return "-El perro esta durmiendo siempre, proque su peso es de " + peso + "kg.";
    }

    @Override
    public String correr() {
        return "-El perro ganador de la carrera es el de color " + color;
    }

    @Override
    public String comunicarse() {
        return "-El perro " + nombreCientifico + " ladra muy fuerte para comunicarse";
    }
}
