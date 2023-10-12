/*
Para la tarea se pide desarrollar un diseño orientado a objetos para un almacén y verdulería, como requerimiento vamos a
tener 4 clases de productos Fruta, Limpieza, Lacteo y NoPerecible, todas tiene en común dos atributos el nombre (string)
y precio (double) que deben heredar de la clase padre Producto, pero ademas cada una van a tener dos atributos propios
adicionales, sus métodos getter y constructor para inicializar los 4 atributos (los 2 del padre y los 2 propios). Los
atributos adicionales de cada clase se detalla en el siguiente diagrame de clase:


Para el ejemplo de la clase main se pide crear dos objetos por cada tipo de producto que deben ser almacenados en un
arreglo del tipo Producto, se debe mostrar iterando el arreglo, por cada uno el detalle completo, el precio, nombre y
los atributos adicionales.
*/

package Tarea22_AlmacenVerduleria;

public class Main {

    public static void main(String[] args) {

        Producto[] productos = new Producto[8];

        productos[0] = new Lacteo("Leche vaca", 7.5, 6, 12);
        productos[1] = new Lacteo("Leche arroz", 8.35, 6, 125 );
        productos[2] = new Fruta("Platano canarias", 3.75, 845, "amarillo");
        productos[3] = new Fruta("Naranja washintona", 6.25, 1008, "naranja");
        productos[4] = new Limpieza("Desengrasante", 2.95, "Amoniaco", 0.250);
        productos[5] = new Limpieza("Suavizante", 0.95, "Jabon Marsella", 0.450);
        productos[6] = new NoPerecedero("Mejillon escabeche", 6.95, 24,64 );
        productos[7] = new NoPerecedero("Miel abeja", 12.45, 1,670 );

        System.out.println("Lista de productos: ");
        for (Producto p: productos) {
            System.out.println("Producto " + p.getClass().getSimpleName() + ": " +p.getNombre() + ", PVP: " + p.getPrecio());

            if(p instanceof Lacteo){
                System.out.println("Cantidad: " + ((Lacteo)p).getCantidad() + ", Proteinas: " + ((Lacteo)p).getProteinas());
            }else if(p instanceof Fruta){
                System.out.println("Peso (gramos): " + ((Fruta)p).getPeso() + ", Color: " + ((Fruta)p).getColor());
            }else if(p instanceof Limpieza){
                System.out.println("Componentes: " + (((Limpieza) p).getComponentes()) + ", Litros: " + ((Limpieza) p).getLitros());
            }else if(p instanceof NoPerecedero){
                System.out.println("Calorias: " + ((NoPerecedero)p).getCalorias() + ", Contenido: " + ((NoPerecedero)p).getContenido());
            }
        }
    }
}
