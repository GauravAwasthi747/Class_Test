package calculatorCode;

import java.util.Scanner;

public class CalculatorCodeNew {
    public int result;       //why and why not to use public in front of static, will it be protected automatically
    private int result1 = -1;

    //Creating constructor
    public CalculatorCodeNew(int number1, int number2, String request) {

        if ((request.toUpperCase()).equals("ADDITION")) {
            //Addition
            getSum(number1, number2);

        } else if ((request.toUpperCase()).equals("SUBTRACTION")) {
            //Subtraction
            getDifference(number1, number2);

        } else if ((request.toUpperCase()).equals("MULTIPLICATION")) {
            //Multiplication
            getMultiplication(number1, number2);

        } else if ((request.toUpperCase()).equals("DIVISION")) {
            //Division
            getDivision(number1, number2);

        } else {
            System.out.println("Request type is not valid: " + this.result1);   //getter: to get the private value.
            this.result1 = -2; //setter: to set the private value.
            System.out.println("Request type is not valid & it change to: " + this.result1);
        }
    }

    //Creating methods
    //Addition
    public int getSum(int value1, int value2) { //value1 & 2 --> are parameters
        result = value1 + value2;
        System.out.println("Addition: " + result);
        return result;
    }

    //Subtraction
    public  int getDifference(int value1, int value2) {
        if (value1 >= value2) {
            result = value1 - value2;
        } else {
            result = value2 - value1;
        }
        System.out.println("Difference: " + result);
        return result;
    }

    //Multiplication
    public int getMultiplication(int value1, int value2) {
        result = value1 * value2;
        System.out.println("Multiplication: " + result);
        return result;
    }

    //Division
    public int getDivision(int value1, int value2) {
        if (value2 == 0){   // ask sami why can't write value2 = 0
            result = -1;
        } else {
            result = value1/value2;
        }
        System.out.println("Division: " + result);
        return result;
    }

}
