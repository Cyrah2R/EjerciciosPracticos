package Tarea24_ProyectoMamiferos;

public class Guepardo extends Felinos{

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        return "-El guepardo come en tranquilamente en la " + habitat;
    }

    @Override
    public String dormir() {
        return "-Debido a su altura de " + altura + "cm, el guepardo duerme en la rama de un arbol";
    }

    @Override
    public String correr() {
        return "-El guepardo es el mas veloz, con una velocidad de " + velocidad + "km/h";
    }

    @Override
    public String comunicarse() {
        return "-El guepardo" + nombreCientifico + "se comunica a traves de cortos rugidos";
    }
}
