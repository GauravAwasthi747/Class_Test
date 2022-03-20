package Polymorphism;

public class CompileTimePolymorphism {
    public static int sum;

    public static void main(String[] args) {
        int a = 3, b = 2;    // Declaring Arguments
        short c = 5;

        addition(a, c);
        addition(c, a);
        addition(a, c, b); // showing option to pick because of polymorphism
    }

    static int addition(int num1, short num2) { //addition method with two parameters
        sum = num1 + num2;
        System.out.println("addition: " + sum);
        return sum;
    }

    static int addition(short num1, int num2) { //addition method with two parameters but with
        sum = num1 + num2;                      // changed data type. This is RIGHT-WAY
        System.out.println("addition: " + sum);
        return sum;
    }

    static int addition(int num1, short num2, int num3) { //addition method with three parameters
        sum = num1 + num2 + num3;
        System.out.println("addition: " + sum);
        return sum;
    }
}
