package learningCasting;

import org.w3c.dom.ls.LSOutput;

public class Casting {
    public static void main(String[] args) {
        //Widening
        short age1 = 25;
        int myAge1 = (int) age1;

        System.out.println(myAge1);

        //Narrowing
        int age2 = 3312434;
        short myAge2 = (short) age2;
        System.out.println(myAge2);

        //Primitive to non Primitive Data-Type
        int age3 = 55;
        String myAge3 = String.valueOf(age3);
        System.out.println(myAge3);

        //Non-Primitive Data-Type to Primitive Data-Type
        String age4 = "66";
        int myAge4 = Integer.valueOf(age4);
        short myAge5 = Short.valueOf(age4);

        System.out.println(myAge4);
        System.out.println(myAge5);

    }

}
