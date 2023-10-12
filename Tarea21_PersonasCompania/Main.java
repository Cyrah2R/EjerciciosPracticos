/*
Una compañía maneja empleados y clientes, entre los empleados hay gerentes que manejan presupuesto para su área (modificable)
y a todos los empleados se les puede aumentar el sueldo, se pide una jerarquía de clase de los tipos de persona mencionados,
tomando como base la figura del diagrama UML de clases.

Para todas las clases de la jerarquía tenga en cuenta los métodos getter, un constructor y el toString() con sobre-escritura,
para Gerente además el método setter de presupuesto.

También incluir una clase main con algún ejemplo de un Gerente e imprimir todos sus datos (y heredados) vía toString().
*/

package Tarea21_PersonasCompania;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Pablo", "Colina", "12035954H", "Calle Manantial 20",
                1800, 1005);

        gerente.aumentarRemuneracion(8);
        gerente.setPresupuesto(30000);
        System.out.println(gerente);
    }
}
