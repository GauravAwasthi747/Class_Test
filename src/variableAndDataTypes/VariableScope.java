package variableAndDataTypes;

public class VariableScope {

    //Global variable
    int x;

    public static void main(String[] args) {    //static method
        //doSomething();  //Can't call a non-static method inside a static method
    }

    void doSomething() {        //non-static method
        //Local Variable
        int y;
        doSomethingElse();  // CAN call a static method inside a non-static method
    }

    static void doSomethingElse() { //static method
        //x = 5;
       // System.out.println(x);
    }

}
//    static void doAnotherThing() {
//        x =55;
//        System.out.println(x);
//    }
//}
