package guia11.ejercicio5;
 /*Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que
intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora
debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que
ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en
pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario
introduce algo que no es un número, se debe controlar esa excepción e indicarlo por
pantalla. En este último caso también se debe contar el carácter fallido como un intento.*/

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int number = (int) (Math.random() * 500) + 1;
        int accountant = 0;
        int enteredNumber;
        boolean flag = false;
        
        System.out.println("--ADIVINA EL NUMERO--");
        do {
            try {

                System.out.println("Ingrese Numero: ");
                accountant++;
                enteredNumber = entry.nextInt();
                if (enteredNumber < number) {
                    System.out.println("El numero a adivinar es mas grande!");
                } else if (enteredNumber > number) {
                    System.out.println("El numero a adivinar es mas chico!");
                } else {
                    System.out.println("EXITO! numero acertado");
                    flag = true;
                }
            } catch (InputMismatchException e) {
                entry.next();
                System.out.println("ERROR! tipo incorrecto de dato");

            }
        } while (!flag);
        System.out.printf("El numero era %d y fue encontrado al %d intento \n", number, accountant - 1);
    }

}
