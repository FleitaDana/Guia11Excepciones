
package Guia11.Ejercicio1;

import java.util.Locale;
import java.util.Scanner;


public class Person{
    private String name;
    private int age;
    private String sex;
    private double weight;
    private double height;

    public Person() {
    }

    public Person(String name, int age, String sex, double weight, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void createPerson(int num) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String sex;
        System.out.printf("\nIngrese nombre de la persona %d\n", num);
        this.name = entry.next();
        System.out.printf("Ingrese edad de la persona %d\n", num);
        this.age = entry.nextInt();
        System.out.printf("Ingrese sexo de la persona %d\n", num);
        sex = entry.next().toUpperCase();
        while (!(sex.equals("M") || sex.equals("F") || sex.equals("O"))) {
            System.out.println("ERROR! sexo mal ingresado, vuelva a hacerlo M,F,O");
            sex = entry.next().toUpperCase();
        }
        this.sex = sex;
        System.out.printf("Ingrese peso de la persona %d\n", num);
        this.weight = entry.nextDouble();
        System.out.printf("Ingrese altura de la persona %d\n", num);
        this.height = entry.nextDouble();
    }

    public int calculateImc() {
        if (this.weight / Math.pow(this.height, 2) < 20) {
            return -1;
        } else if (this.weight / Math.pow(this.height, 2) >= 20 && this.weight / Math.pow(this.height, 2) <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean adult() {
        return this.age >= 18;
    }
}