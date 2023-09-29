import java.util.Scanner;

/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de
las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos
(contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
*/

public class Tarea8_NotasAlumnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[20];
        double promMayor = 0, contMayor = 0;
        double promMenor = 0, contMenor = 0;
        double promTotal = 0, contTotal = 0;
        int notas1 = 0;

        System.out.println("Introduzca las notas del curso (1 - 7):");

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Introduzca la nota del examen " + (i + 1) + ":");
            notas[i] = sc.nextDouble();

            if (notas[i] == 0) {
                System.out.println("Error: finalizando programa");
                break;
            }

            if (notas[i] < 1 || notas[i] > 7){
                System.out.println("Error al introducir nota, ingrese notas entre 1 y 7");
                i--;
            }

            if (notas[i] == 1) {
                notas1++;
            }
        }

        for (int j = 0; j < notas.length; j++) {

            if (notas[j] >= 5) {
                promMayor += notas[j];
                contMayor++;
            } else {
                promMenor += notas[j];
                contMenor++;
            }

            promTotal += notas[j];
            contTotal++;
        }

        System.out.println("-El promedio de las notas mayores a 5 es: " + promMayor / contMayor);
        System.out.println("-El promedio de las notas menores a 5 es: " + promMenor / contMenor);
        System.out.println("-El promedio total de las notas es: " + promTotal / contTotal);
        System.out.println("-Tienes un total de " + notas1 + ", clasificaciones con una nota de 1");
    }
}
