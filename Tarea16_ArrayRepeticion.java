/*
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima
el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

Como resultado debería imprimir lo siguiente:
-La mayor ocurrencias es: 3
-El elemento que mas se repite es: 5
En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
*/

import java.util.Scanner;

public class Tarea16_ArrayRepeticion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Rellenamos el Array
        int[] array = new int[10];
        System.out.println("Ingrese 10 numeros enteros: ");
        for (int i = 0; i < array.length; i++){
            System.out.print("Ingrese el numero en la posición " + (i +1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println();

        //Comprobamos que numeros se repiten y cuanto
        int repeticion, maxRepeticion = 0;
        int numMasRepetido = 0;

        for (int i = 0; i < array.length; i++) {
            repeticion = 0; //Reseteamos el contador

            //Comparamos los numeros para ver cuanto se repiten
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repeticion++;
                }
            }

            if (repeticion > maxRepeticion){
                maxRepeticion = repeticion;//Asignamos el maximo de repeticiones a la variable
                numMasRepetido = array[i];//Asignamos el numero mas repetido a la variable
            }
        }

        //Imprimimos resultados
        System.out.println("El numero que mas se repite es el: " + numMasRepetido);
        System.out.println("La cantidad de veces que se repite es: " + maxRepeticion + " veces");
    }
}
