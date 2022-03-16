
package guia11.ejercicio4;


public class Operations {
    
    private int numberOne;
    private int numberTwo;

    public Operations() {
    }

    public Operations(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }


    public void loadNumbers(int number1, int number2) {
        this.numberOne = number1;
        this.numberTwo = number2;
    }

    public int sum() {
        return numberOne + numberTwo;
    }

    public int subtraction() {
        return numberOne - numberTwo;
    }

    public int multiplication() {
        return numberOne * numberTwo;
    }

    public int division() {
        return numberOne / numberTwo;
    }
}


