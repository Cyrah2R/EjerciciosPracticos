import java.util.Scanner;

/*
Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el
siguiente orden: el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
*/

public class Tarea13_OrdenarArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int j = numeros.length - 1; j >= 0;){
            for (int i = 0; i < numeros.length; i++, j--){
                System.out.println("El numero " + (j+1) + " es " + numeros[j]);
                System.out.println("El numero " + (i+1) + " es " + numeros[i]);
            }
        }
    }
}
