import javax.swing.*;

/*
Obtener el nombre mas largo de tres personas, según los siguientes requerimientos:
Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase
JOptionPane y método showInputDialog().
Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
(Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos
al nombre de la persona.
Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
*/

public class Tarea6_NombreMasLargo {

    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Introduzca el nombre completo de la primera persona");
        String nombre2 = JOptionPane.showInputDialog("Introduzca el nombre completo de la segunda persona");
        String nombre3 = JOptionPane.showInputDialog("Introduzca el nombre completo de la tercera persona");

        String nombreLargo = nombre1.length() > nombre2.length() ? nombre1 : nombre2;
        nombreLargo = nombre3.length() > nombreLargo.length() ? nombre3 : nombreLargo;

        JOptionPane.showMessageDialog(null, nombreLargo + " tiene el nombre mas largo");
    }
}
