/*
Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.

El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos,
es decir, debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.

Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
1: ***
2:
3: *
4: *****
5: *
6: **
Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
*/

import java.util.Random;

public class Tarea17_Histograma {

    public static void main(String[] args) {

        Random numeros = new Random();

        //Rellenamos el array con numeros aleatorios (1 - 6)
        int[] arrayInt = new int[12];
        for(int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = numeros.nextInt(1, 6);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();

        //Hacemos el recuento de numeros y los cambiamos por *
        String[] arrayHistograma = new String[6];
        for(int i = 0; i < arrayHistograma.length; i++) { //Recorremos el array histograma
            String frase = i + 1 + "- "; //creamos la frase que aparecera en cada iteracion de i (1- )
            for(int k = 0; k < arrayInt.length; k++) { //Recorremos el array de enteros
                int num = i + 1;  //Creamos una variable Int para comparar con los valores del arrayInt -> i = 0 + 1 = 1
                if (num == arrayInt[k]) { //Comparamos la variable con los numeros dentro del array
                    frase += "*"; //Si coinciden se le añade un * a la frase anterior (1- *...)
                }
            }
            arrayHistograma[i] = frase; // Imprimimos la frase por cada iteracion de i
        }

        //Imprimimos el arrayHistograma
        for(int i = 0; i < arrayHistograma.length; i++) {
            System.out.println(arrayHistograma[i]);
        }

        //----------------------------------------------------------//
        //OTRA MANERA DE RESOLVERLO
        /*

        Random numeros = new Random();

        int[] arrayInt = new int[12];
        for(int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = numeros.nextInt(1, 6);
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();

        for(int i = 1; i <= 6; i++) {
            String frase = i + "- ";
            for(int k = 0; k < 12; k++) {
                if (i == arrayInt[k]) {
                    frase += "*";
                }
            }
            System.out.println(frase);
        }

       */

    }
}
