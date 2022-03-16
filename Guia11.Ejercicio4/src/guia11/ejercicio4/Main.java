package guia11.ejercicio4;

/*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado
puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones*/

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Operations operation = new Operations();
        int option = 0;
        String numberOne, numberTwo;

        do {
            try {

                System.out.println("----MENU----");
                System.out.println("1-Sumar");
                System.out.println("2-Restar");
                System.out.println("3-Multiplicar");
                System.out.println("4-Dividir");
                System.out.println("5-Salir");
                option = entry.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Ingrese primero numero");
                        numberOne = entry.next();
                        System.out.println("Ingrese segundo numero");
                        numberTwo = entry.next();
                        operation.loadNumbers(Integer.parseInt(numberOne), Integer.parseInt(numberTwo));
                        System.out.println("La suma es: " + operation.sum());
                        break;
                    case 2:
                        System.out.println("Ingrese primero numero");
                       numberOne = entry.next();
                        System.out.println("Ingrese segundo numero");
                        numberTwo = entry.next();
                        operation.loadNumbers(Integer.parseInt(numberOne), Integer.parseInt(numberTwo));
                        System.out.println("La resta es: " + operation.subtraction());
                        break;
                    case 3:
                        System.out.println("Ingrese primero numero");
                        numberOne = entry.next();
                        System.out.println("Ingrese segundo numero");
                        numberTwo = entry.next();
                        operation.loadNumbers(Integer.parseInt(numberOne), Integer.parseInt(numberTwo));
                        System.out.println("La multiplicacion es: " + operation.multiplication());
                        break;
                    case 4:
                        System.out.println("Ingrese primero numero");
                        numberOne = entry.next();
                        System.out.println("Ingrese segundo numero");
                        numberTwo = entry.next();
                        operation.loadNumbers(Integer.parseInt(numberOne), Integer.parseInt(numberTwo));
                        System.out.println("La division es: " + operation.division());
                        break;
                    case 5:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("opcion incorrecta!");
                        break;
                }
            } catch (InputMismatchException e) {
                entry.next();
                System.out.println("La opcion debe ser un entero");

            } catch (NumberFormatException e) {
               
                System.out.println("Deben ser enteros los numeros");

            } catch (ArithmeticException e) {
               
                System.out.println("ERROR division por cero");

            } finally {
                System.out.println();
            }
        } while (option != 5);

    }

}
