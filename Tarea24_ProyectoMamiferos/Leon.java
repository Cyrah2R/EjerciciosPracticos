package Tarea24_ProyectoMamiferos;

public class Leon extends Felinos{

    private int manada;
    private double rugidoDecibelios;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico,
                double tamanioGarras, int velocidad, int manada, double rugidoDecibelios) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.manada = manada;
        this.rugidoDecibelios = rugidoDecibelios;
    }

    public int getManada() {
        return manada;
    }

    public double getRugidoDecibelios() {
        return rugidoDecibelios;
    }

    @Override
    public String comer() {
        return "-El Leon caza junto a su grupo de " + manada + " leonas, en  la sabana africana";
    }

    @Override
    public String dormir() {
        return "-El " + nombreCientifico + " se hecha a dormir una vez ha comido y esta saciado";
    }

    @Override
    public String correr() {
        return "-El leon corre a " + velocidad + "km/h cuando esta cazando";
    }

    @Override
    public String comunicarse() {
        return "-El leno emite un rugido de " + rugidoDecibelios + " decibelios, cuando quiere comunicarse con su manada";
    }
}
