package Tarea26_CarroSupermercado;

/*
Para la tarea se pide implementar una clase llamada BolsaSupermercado que maneje tipos genéricos para guardar productos en una lista de máximo 5 elementos. 
El tipo List<T> debe ser genérico, por ejemplo podríamos tener una bolsa que guarde productos de limpieza, otra bolsa para los lácteos otra para guardar 
frutas y otra para productos no perecibles.

La clase BolsaSupermercado debe tener solo dos métodos, uno para agregar los productos addProducto cuyo argumento sea del tipo del parámetro generic y el 
método getProductos que devuelve la lista de productos del tipo generic.

Entonces como requerimiento vamos a tener 4 clases de productos Fruta, Limpieza, Lacteo y NoPerecible, todas tiene en común dos atributos el nombre (string) 
y precio (double) que deben heredar de la clase padre Producto, pero ademas cada una van a tener dos atributos propios adicionales, sus métodos getter y 
constructor para inicializar los 4 atributos (los 2 del padre y los 2 propios). Los atributos adicionales de cada clase se detalla en el siguiente diagrame 
de clase:

Para el ejemplo de la clase main se  pide crear un objeto bolsa para cada tipo de producto con 5 elementos, se debe mostrar por cada bolsa el detalle completo 
de sus elementos, el precio, nombre y los atributos adicionales sin realizar cast de ningún tipo, ni toString().
*/

public class Main {

	public static void main(String[] args) {

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        bolsaLacteos.addProducto(new Lacteo(24, 32, "Yogurt Sabor Fresa", 1.50));
        bolsaLacteos.addProducto(new Lacteo(200, 6, "Leche Entera Vaca", 0.85));
        bolsaLacteos.addProducto(new Lacteo(100, 3, "Leche Semidesnatada Vaca", 0.90));
        bolsaLacteos.addProducto(new Lacteo(5, 37, "Queso Curado Oveja", 32.90));
        bolsaLacteos.addProducto(new Lacteo(25, 15, "Mantequilla Con Sal", 4.25));
        
		BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
		bolsaFrutas.addProducto(new Fruta(550, "verde", "manzana golden", 3.85));
        bolsaFrutas.addProducto(new Fruta(2500, "amarillo", "limones", 1.95));
        bolsaFrutas.addProducto(new Fruta(3000, "naranja", "naranjas", 2.99));
        bolsaFrutas.addProducto(new Fruta(340, "rojizo", "fresas", 5.85));
        bolsaFrutas.addProducto(new Fruta(1150, "anaranjado", "melocotones", 4.45));
        
        BolsaSupermercado<Limpieza> bolsaLimpiezas = new BolsaSupermercado<>();
        bolsaLimpiezas.addProducto(new Limpieza("antibacteriano", 0.75, "Dettol", 1.69));
        bolsaLimpiezas.addProducto(new Limpieza("lavaloza", 1.2, "Orion", 2.29));
        bolsaLimpiezas.addProducto(new Limpieza("cloro", 0.95, "Clorox", 13.9));
        bolsaLimpiezas.addProducto(new Limpieza("gel con Lavandinca", 0.45, "Vim", 13.80));
        bolsaLimpiezas.addProducto(new Limpieza("desinfectante Lavanda", 0.9, "Disiclin", 13.30));
        
        BolsaSupermercado<NoPerecedero> bolsaNoPerecederos = new BolsaSupermercado<>();
        bolsaNoPerecederos.addProducto(new NoPerecedero(170, 95, "Atún Lomitos en Agua Angelmo", 9.65));
        bolsaNoPerecederos.addProducto(new NoPerecedero(425, 560, "Jurel Natural Lata", 11.50));
        bolsaNoPerecederos.addProducto(new NoPerecedero(380, 234, "Porotos Negros Listos Para Servir Caja", 10.20));
        bolsaNoPerecederos.addProducto(new NoPerecedero(1000, 3340, "Arroz Grano Largo Ancho Grado 1", 8.25));
        bolsaNoPerecederos.addProducto(new NoPerecedero(1000, 3536, "Porotos Hallado Bolsa", 6.79));

        System.out.println("============ Lacteos ============");
        for (Lacteo prod : bolsaLacteos.getProductos()) {
            System.out.println("--------- " +  prod.getNombre() + ": ---------");
            System.out.println("Precio: " + prod.getPrecio() + " €/ud");
            System.out.println("Cantidad: " + prod.getCantidad() + " unidades");
            System.out.println("Proteinas: " + prod.getProteinas() + " gramos");
        }
        System.out.println();
        
        System.out.println("============ Frutas ============");
        for (Fruta fruta : bolsaFrutas.getProductos()) {
            System.out.println("--------- " +  fruta.getNombre() + ": ---------");
            System.out.println("Precio: " + fruta.getPrecio() + " €/Kg");
            System.out.println("Peso: " + fruta.getPeso() + " gramos");
            System.out.println("Color: " + fruta.getColor());
        }
        System.out.println();

        System.out.println("============ Limpieza ============");
        for (Limpieza prod : bolsaLimpiezas.getProductos()) {
            System.out.println("--------- " +  prod.getNombre() + ": ---------");
            System.out.println("Precio: " + prod.getPrecio() + " €/ud");
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros());
        }
        System.out.println();

        System.out.println("============ NoPerecederos ============");
        for (NoPerecedero prod : bolsaNoPerecederos.getProductos()) {
            System.out.println("--------- " +  prod.getNombre() + ": ---------");
            System.out.println("Precio: " + prod.getPrecio() + " €");
            System.out.println("Calorias: " + prod.getCalorias() + " kCal");
            System.out.println("Contenido neto: " + prod.getContenido() + " gramos");
        }
	}
}
