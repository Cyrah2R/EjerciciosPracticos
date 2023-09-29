import java.util.Scanner;

/*
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
*/

public class Tarea9_Multiplica2Numeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        int sumaNum = 0;

        System.out.println("Introduce dos numeros enteros (positivo o negativo)");

        System.out.println("Introduce el primer numero:");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        num2 = sc.nextInt();

        for (int i = 0; i < Math.abs(num2) ; i++){
            sumaNum += num1;
        }

        if (num2 <= -1){
             sumaNum = -(sumaNum);
        }

        System.out.println(sumaNum);
    }
}

/*      RESULTADO DE SIGNOS:
    -9 + -1 = -  <-->  -9 * -1= +  <-->   -9 / -1 = +    <-->   -9 - -1 = -
     9 +  1 = +  <-->   9 *  1= +  <-->    9 /  1 = +    <-->    9 -  1 = +
    -9 +  1 = -  <-->  -9 *  1= -  <-->   -9 /  1 = -    <-->   -9 -  1 = -
     9 + -1 = +  <-->   9 * -1= -  <-->    9 / -1 = -    <-->    9 - -1 = +
*/