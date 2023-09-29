import java.util.Scanner;

/*
La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de
línea de comandos.
Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en
mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
N.es_A.ia_E.pe
*/

public class Tarea3_NombresDeFamiliares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedimos ingresar los nombres
        System.out.println("Ingrese el nombre de 3 familiares");
        System.out.println("Ingrese un nombre del primer familiar:");
        String nombreA = scanner.nextLine();
        System.out.println("Ingrese un nombre del segundo familiar:");
        String nombreB = scanner.nextLine();
        System.out.println("Ingrese un nombre del tercer familiar:");
        String nombreC = scanner.nextLine();

        //Se modifica según exigencias del ejercicio
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        //Se imprime todo según ejercicio
        System.out.println(nombreA2 + "_" + nombreB2 + "_" + nombreC2);
    }
}
