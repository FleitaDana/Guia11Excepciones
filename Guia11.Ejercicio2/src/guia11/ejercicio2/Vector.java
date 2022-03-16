
package guia11.ejercicio2;

import java.util.Locale;
import java.util.Scanner;


public class Vector {

    private int[] vector = new int[5];

    public Vector() {
    }

    public Vector(int[] V) {
        this.vector = V;
    }

    public int[] getV() {
        return vector;
    }

    public void setV(int[] V) {
        this.vector = V;
    }

    public void createVector() {
        
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i;
        }
    }

   
    public int show(int num){
    
        return vector[num];
    }
    
}
