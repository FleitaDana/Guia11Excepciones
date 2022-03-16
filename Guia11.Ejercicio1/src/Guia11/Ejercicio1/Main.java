
package Guia11.Ejercicio1;

/*Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de
invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.*/

public class Main {

    
    public static void main(String[] args) {
        Person person=new Person();
        person=null;
        
        try{
            System.out.println( person.adult());
        }catch(NullPointerException e){
            System.err.println("Error objeto vacio");
        }
                             
    }
    
}
