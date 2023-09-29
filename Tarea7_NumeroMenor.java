import java.util.Scanner;

/*
Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase
Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado)
para pedir el numero entero, entonces se requiere:

Calcular el menor número e imprimir el valor.
Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual
o mayor que 10!".
*/

public class Tarea7_NumeroMenor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuantos números quieres comparar");
        int cantNum = sc.nextInt();
        int[] numeros = new int[cantNum];
        int count = numeros.length;

        if(cantNum >= 10){
            for (int i = 0; i < count; i++) {
                System.out.println("Ingrese numero " + (i + 1) + ":");
                numeros[i] = sc.nextInt();
            }
            int menor = numeros[0];

            for (int i = 0;i < count; i++) {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            System.out.println("-El numero menor es: " + menor);

            if(menor < 10){
                System.out.println("-El numero menor es " + menor + ", y es menor de 10");
            }else{
                System.out.println("-El numero menor es " + menor + ", y es igual o mayor que 10");
            }
        }else{
            System.out.println("Lo siento, tiene que ser un numero mayor de 10");
        }

        /*
        //FORMA DE HACERLO DEL MAESTRO:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar: ");
        int cantidad = scanner.nextInt();

        // preguntamos si es menor a 10, ya que el mínimo según la letra de la tarea es 10 (buscar el número menor de
        //minimo 10 valores enteros).
        if (cantidad < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }
        */

    }
}
