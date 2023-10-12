/*
Se requiere escribir un programa para la administración de animales de un zoológico, inicialmente para los mamíferos,
para leones, lobos, tigres, guepardos y perros salvaje africano.

Se necesita diseñar una jerarquías de clases en común a todos ellos, por ejemplo para los felinos (Leon, Tigre y Guepardo)
vamos a necesitar la clase abstracta Felino, para los caninos (Lobo y Perro) vamos a necesitar la clase abstracta Canino
y una clase que sea en comun para todos ellos, la clase abstracta Mamifero.

Para todos los mamíferos mencionados se requieren de los siguientes atributos en común (que deberan de implementar en la
clase abstracta Mamifero): el habitat (string), altura (decimal), largo (decimal), peso (decimal), nombre científico
(string) con sus respectivos métodos getters, usar constructor para inicializar los datos. También se necesitan 4 métodos
abstractos que deberán implementar los tipos concretos: comer(), dormir(), correr(), comunicarse(), todos devuelven string.

Todos los caninos deberán tener ademas de lo anterior los atributos color (string), tamaño colmillos (decimal) e inicializar
los datos mediante constructor con sus métodos getters.

Todos los felinos deberán tener los atributos tamaño garras (decimal) y velocidad (int), inicializar los datos mediante
constructor y sus métodos getters.

Respecto a los tipos concretos:

- El Leon ademas tiene numero manada (int) y potencia rugido en decibel (decimal)
- El Tigre tiene el atributo especie tigre (string)
- El Guepardo sin atributos adicionales
- El Lobo tiene numero de camada (int) y especieLobo (string)
- El Perro tiene fuerza de mordida en psi (int)

Los métodos abstractos comer(), dormir(), correr() y comunicarse() tienen que ser implementados por las clases concretas
devolviendo un string con alguna frase u oración que sea de acuerdo a cada tipo y que interactúe con sus atributos. No
hay una regla para implementar estos métodos, pueden aplicar la creatividad, por ejemplo en la clase Leon el método comer()
podría ser implementado devolviendo la cadena "El León caza junto a su grupo de " + numManada + " individuos en las llanuras
africanas", o para el Lobo el método dormir() devolver "El Lobo " + color + " duerme en las cavernas de " + habitat.

Al final crear la clase con el método main llamada EjemploMamiferos y crear algunas instancias de ejemplo de cada clase
concreta, entre 5 a 7 objetos, asociado al tipo mas genérico posible y mostrar los datos en consola. Por ejemplo:

Mamifero[] mamiferos = new Mamifero[6];

Mamifero leon = new Leon(120d, 5, 7.5f, 58, "Sur Africa", 120, 220, 190);
Mamifero guepardo = new Guepardo(4.9f, 130, "Africa", 94, 140, 72);
...
mamiferos[0] = leon;
mamiferos[1] = guepardo;
...

for (Mamifero animal : mamiferos) {
    ....
}
...
A continuación dejo el diagrama UML de clases como una guía, los métodos getters y constructores se omitieron para
simplificar, pero deben ir en el código.
*/

package Tarea24_ProyectoMamiferos;

public class Main {

    public static void main(String[] args) {

        Mamiferos[] mamiferos = new Mamiferos[5];

        mamiferos[0] = new Leon("Sabana Africana", 1.12, 2.75, 240, "Panthera leo",
                22, 67, 12, 120);

        mamiferos[1] = new Tigre("Selva Indu", 1.22, 2.25, 195, "Panthera tigris",
                18.6, 65, "continental");

        mamiferos[2] = new Guepardo("Africa Central", 0.98,1.86,120,"Acinonyx jubatus",
                16.9,118);

        mamiferos[3] = new Lobo("Noruega", 88, 1.20, 85,"Canis lupus",
                "gris ceniza", 12, 14, "latrans");

        mamiferos[4] = new Perro("Domestico universal", 110, 1.18,60, "Canis lupus familiaris",
                "Mixto", 8,  730);

        System.out.println("=================================");
        for ( Mamiferos mm: mamiferos){

            System.out.println("\t\t\t" + mm.getClass().getSimpleName());
            System.out.println("=================================");
            System.out.println("Caracteristicas del ejemplar analizado:");
            System.out.println("Habitat: " + mm.getHabitat() + "\nAltura: " + mm.getAltura() +
                    "cm, Largo: " + mm.getLargo() + "cm, Peso: " + mm.getPeso() + "Kg.");

            if (mm instanceof Felinos){
                System.out.println("El tamaño de sus garras es " + ((Felinos) mm).getTamanioGarras() +
                        "cm, y corre a una velocidad de " + ((Felinos) mm).getVelocidad() + " km/h.");
                if(mm instanceof Leon){
                    System.out.println("Tamaño de manada: " + ((Leon) mm).getManada() +
                            " , Potencia de rugido: " + ((Leon) mm).getRugidoDecibelios() + " decibelios.");
                } else if (mm instanceof Tigre) {
                    System.out.println("Especie analizada: " + ((Tigre) mm).getEspecieTigre());
                }else if (mm instanceof Guepardo){
                    System.out.println("Ninguna caracteristica especial encontrada");
                }
            }else if(mm instanceof Caninos){
                System.out.println("Color: " + ((Caninos) mm).getColor() +
                        ", Tamaño de colmillos: " + ((Caninos) mm).getColmillos());
                if(mm instanceof Lobo){
                    System.out.println("Tamaño de camada: " + ((Lobo) mm).getCamada() +
                            ", Especie: " + ((Lobo) mm).getEspecieLobo());
                }else if(mm instanceof Perro){
                    System.out.println("Fuerza de mordida: " + ((Perro) mm).getMordidaPSI() + " PSI");
                }
            }

            System.out.println(mm.comer());
            System.out.println(mm.dormir());
            System.out.println(mm.correr());
            System.out.println(mm.comunicarse());
            System.out.println("=================================");
        }
    }
}
