package controlFlow;

import java.util.Scanner;

public class FullIfCondition {
    static int result;

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = objScanner.nextInt();

        System.out.print("Enter Second number: ");
        int y = objScanner.nextInt();

        System.out.println();

        getSum(x, y);
    }

    static int getSum(int num1, int num2) {
        if (num1 >= num2) {
            result = num1 - num2;
            }
        else if(num2 > num1) {
            result = num2 - num1;
            }
        else {
            result = -1;
            }

        System.out.println("result: " + result);
        return result;
    }

}
