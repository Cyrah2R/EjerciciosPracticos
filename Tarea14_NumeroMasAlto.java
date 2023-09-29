/*
Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99), por ejemplo
{14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
*/

import java.util.Arrays;
import java.util.Random;

public class Tarea14_NumeroMasAlto {

    public static void main(String[] args) {

        Random numAleatorio = new Random();
        int[] numeros = new int[7];
        int total = numeros.length;

        //Rellenamos Array con numeros desde (11 al 99) e imprimimos los valores generados aleatoriamente y
        //sin repetir numero:
        System.out.println("El Array contiene los siguientes numeros:");
        numeros[0] = numAleatorio.nextInt(11, 99);
        System.out.print(numeros[0] + " ");

        for (int i = 1; i < total; i++) {
            do{
                numeros[i] = numAleatorio.nextInt(11, 99);
            }while(numeros[i] == numeros[i-1]);

            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        //Ordenamos el Array de menor a mayor e imprimimos el último valor, que es el mayor.
        Arrays.sort(numeros);
        System.out.println("El numero mas alto es: " + numeros[total - 1]);

    }

}
