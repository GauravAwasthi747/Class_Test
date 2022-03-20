package callingCode;
import calculatorCode.CalculatorCodeNew;
import java.util.Scanner;

public class CalculatorCodeNewCall {

    public static void main(String[] args) {
        //Creating scanner object to input from user.
        Scanner objScanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = objScanner.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = objScanner.nextInt();

        System.out.println("Enter the type of action you want to do: Addition, Subtraction, Multiplication, Division");
        objScanner.next();  //ask why can't enter string after integer
        String action = objScanner.nextLine();

        System.out.println(" ");
        System.out.println("Result: ");

        CalculatorCodeNew objNewCalculator1 = new CalculatorCodeNew(num1, num2, action);

        CalculatorCodeNew objNewCalculator2 = new CalculatorCodeNew(num1, num2, action);

       // System.out.println(CalculatorCodeNew.result);

//        System.out.println(result);
//        System.out.println(this.result1);
    }
}