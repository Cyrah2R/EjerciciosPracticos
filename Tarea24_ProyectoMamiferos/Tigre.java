package Tarea24_ProyectoMamiferos;

public class Tigre extends Felinos{

    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "-El tigre usa sus garras de " + tamanioGarras + "cms. para despedazar a su presa cuando come";
    }

    @Override
    public String dormir() {
        return "-El tigre duerme tranquilamente en la " + habitat ;
    }

    @Override
    public String correr() {
        return "-El tigre corre veloz con a su zancada, gracias a su embergadura de " + largo + "mts de largo";
    }

    @Override
    public String comunicarse() {
        return "-El tigre " + especieTigre + " tiene un rugido característico de su especie";
    }
}
