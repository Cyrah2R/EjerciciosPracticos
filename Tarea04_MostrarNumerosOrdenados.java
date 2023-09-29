import java.util.Scanner;

/*
El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
Podría ser utilizando operador ternario.
*/

public class Tarea4_MostrarNumerosOrdenados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //pedimos dos números
        System.out.println("Ingrese dos números:");
        System.out.println("Primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Segundo numero");
        double num2 = sc.nextDouble();

        //comparamos los números
        double mayor = (num1 > num2) ? num1 : num2;
        double menor = (num1 < num2) ? num1 : num2;

        //imprimimos los números
        System.out.println("mayor = " + mayor + ", menor = " + menor);
    }
}
