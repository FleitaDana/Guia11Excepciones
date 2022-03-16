
package guia11.ejercicio2;

/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).*/

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Vector vector = new Vector();
        vector.createVector();
        
        try {
            System.out.println("Ingrese posicion a ver dentro del vector");
            System.out.println("La posicion dentro del vector es: " + vector.show(entry.nextInt()));
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.err.println("Error! Fuera de rango");
        } catch (InputMismatchException t){
            System.err.println("Posicion ingresada como caracter");
        }finally{
            System.out.println("finaliza");
        }

    }

}
