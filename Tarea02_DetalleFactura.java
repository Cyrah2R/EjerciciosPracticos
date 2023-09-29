import java.util.Scanner;

/*
La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa
que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto
total neto incluyendo impuesto.

Por ejemplo, el resultado podría ser algo así:
La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
*/

public class Tarea2_DetalleFactura {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la descripción de la factura");
        String descFactura = sc.nextLine();

        System.out.println("Inserte el precio del primer producto");
        double prodUno = sc.nextDouble();

        System.out.println("Inserte el precio del segundo producto");
        double prodDos = sc.nextDouble();

        double sumaDos = prodUno + prodDos;
        double impuesto = sumaDos * 0.19;
        double precioFinal = sumaDos + impuesto;

        System.out.println("La factura " + descFactura + " tiene un total bruto de " + sumaDos +
                ", con un impuesto de " + impuesto + ", y el monto después de impuesto es de " + precioFinal);
    }
}
