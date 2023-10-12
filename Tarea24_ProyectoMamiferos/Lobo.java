package Tarea24_ProyectoMamiferos;

public class Lobo extends Caninos{

    private int camada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double colmillos, int camada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, colmillos);
        this.camada = camada;
        this.especieLobo = especieLobo;
    }

    public int getCamada() {
        return camada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "-El lobo usa sus colmillos de " + colmillos + "mm. para comer";
    }

    @Override
    public String dormir() {
        return "-El lobo " + especieLobo + " siempre duerme con los de su especie";
    }

    @Override
    public String correr() {
        return "-El lobo corre en manada. En este caso con un total de " + camada;
    }

    @Override
    public String comunicarse() {
        return "-El lobo " + especieLobo + " que tiene un color " + color + "particular, no se comunica con rugidos";
    }
}
