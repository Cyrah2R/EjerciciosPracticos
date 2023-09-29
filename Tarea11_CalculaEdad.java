import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date
y calcular la edad de la persona de acuerdo a la fecha actual.

Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante, también se pueden apoyar
de google que hay varios ejemplos.

*/

public class Tarea11_CalculaEdad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-yyyy");

        Date fechaNac = new Date();
        Date fechaActual = new Date();
        int edad;

        System.out.println("Ingrese su dia de nacimiento 'dd-mm-yyyy'");
        try {
            fechaNac = formatoF.parse(sc.next());
            System.out.println("La fecha de nacimiento es: " + formatoF.format(fechaNac));
            System.out.println("La fecha actual es " + formatoF.format(fechaActual));

            formatoF = new SimpleDateFormat("yyyy");
            int anioNac = Integer.parseInt(formatoF.format(fechaNac));
            int anioAct = Integer.parseInt(formatoF.format(fechaActual));
            edad = anioAct - anioNac;

            formatoF = new SimpleDateFormat("MM");
            int mesNac = Integer.parseInt(formatoF.format(fechaNac));
            int mesAct = Integer.parseInt(formatoF.format(fechaActual));

            formatoF = new SimpleDateFormat("dd");
            int diaNac = Integer.parseInt(formatoF.format(fechaNac));
            int diaAct = Integer.parseInt(formatoF.format(fechaActual));

            if (mesNac > mesAct){
                edad = edad - 1;
            }else if(mesNac == mesAct){
                if (diaNac > diaAct){
                    edad = edad -1;
                }else{
                    edad = edad;
                }
            }else{
                edad = edad;
            }

            System.out.println("Su edad es de " + edad + " años");

        } catch (ParseException e) {
            System.err.println("El formato introducido no es correcto"); //.err --> hace que la frase se imprima en rojo "formato error"
            main(args); // Vuelve a repetir desde el principio
        }
    }
}
