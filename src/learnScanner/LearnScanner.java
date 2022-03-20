package learnScanner;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");

        String name = scanner.nextLine();   //scanner --> is to get input from the consol or from the user
                                            //nextLine() --> is use to input a String value.

        System.out.println(name);

    }

}
