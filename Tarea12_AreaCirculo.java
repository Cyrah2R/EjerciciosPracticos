import java.util.Scanner;

/*
Pedir el radio de un círculo y calcular su área. utilizar la formula:

area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
*/

public class Tarea12_AreaCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double pi = Math.PI;
        double radio;
        double area;

        System.out.println("Ingrese el radio del circulo:");
        radio = sc.nextDouble();

        area = (Math.pow(radio, 2)) * pi;
        System.out.println("El circulo tiene un area de :" + area);

    }
}
