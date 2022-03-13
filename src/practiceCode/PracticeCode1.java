package practiceCode;

public class PracticeCode1 {

    static void doSomething() {
        System.out.println("This method doesn't return anything");
    }

    static int doSomethingElse() {
        int x = 3;
        int y = 2;

        return x + y;
    }

    //writing main method
    public static void main(String[] args) {
        doSomething();
        int z = doSomethingElse();
        System.out.println(5 + doSomethingElse());

    }


}