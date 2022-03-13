package calculatorCode;

public class CalculatorCodes {
    public static int c;

    public static String math = "This is a simple task to perform.";
    public String quote = "Java is kool language to learn";

    //addition
    public static int getAddition(int num1, int num2) { //int num1 and int num2 are the parameters
        c = num1 + num2;
        System.out.println("sum: " + c);
        return c;
    }

    //Subtraction
    public static int getSubtraction(int num1, int num2) {
        c = num1 - num2;
        System.out.println("subtraction: " + c);
        return c;
    }

    //multiplication
    public static int getMultiplication(int num1, int num2) {
        c = num1 * num2;
        System.out.println("multiplication:" + c);
        return c;
    }

    //division
    public static int getDivision(int num1, int num2) {
        c = num1/num2;
        System.out.println("division: " + c);
        return c;
    }

}
