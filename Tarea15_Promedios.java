/*
Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
el promedio de los negativos y contar el número de ceros.
*/

import java.util.Scanner;

public class Tarea15_Promedios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[7];
        int contNeutro = 0, contPositivos = 0, contNegativos = 0;

        //Rellenamos el Array, y calculamos cuantos numeros hay positivos, negativos y ceros:
        System.out.println("Ingrese 7 numeros enteros(positivos o negativos):");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();

            if(numeros[i] == 0){
                contNeutro++;
            } else if (numeros[i] < 0){
                contNegativos++;
            }else{
                contPositivos++;
            }
        }

        //Llenamos los Array positivos y negativos con la cantidad de numeros que hay de cada uno:
        int j = 0, k = 0;
        int[] positivos = new int[contPositivos];
        int[] negativos = new int[contNegativos];

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > 0){
                positivos[j++] = numeros[i];
            }else if(numeros[i] < 0){
                negativos[k++] = numeros[i];
            }
        }

        //Calculamos los promedios de cada Array
        double sumaPos = 0, sumaNeg = 0;

        for (int i = 0; i < positivos.length; i++){
            sumaPos += positivos[i];
        }
        for (int i = 0; i < negativos.length; i++){
            sumaNeg += negativos[i];
        }

        double promPositivos = sumaPos / contPositivos;
        double promNegativos = sumaNeg / contNegativos;

        //Imprimimos los resultados:
        System.out.println("La cantidad de ceros son: " + contNeutro);
        System.out.println("El promedio de los numeros positivos son: " + promPositivos);
        System.out.println("El promedio de los numeros negativos son: " + promNegativos);
    }
}
