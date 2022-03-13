package callingCode;
import calculatorCode.CalculatorCodes;

public class CalculatorCall {

    public static void main(String[] args) {

        CalculatorCodes code = new CalculatorCodes();   //Creating a new object call code of CalculatorCodes class.

        System.out.println(CalculatorCodes.math); //right way to call a static variable is by the ClassName in which that Static
                                                  //variable is declared or created as ClassName.staticVariableName and not by
                                                  //the object of that class. e.g. here by Class called CalculatorCodes not by
                                                  // object called code.

        CalculatorCodes.math = "This is a simple and quick tak to perform"; //Changing a Static variable value by using ClassName
                                                                            // not by an object.
        System.out.println(CalculatorCodes.math);

        System.out.println(code.quote); //right way to call a non-static variable is thru an object created for that class in
                                        // which non-static variables are created or declared as objectName.non-staticVariableName
        code.quote = "Java is best language to learn";  //Changing a non-Static variable value by using an object not a classname
        System.out.println(code.quote);

        CalculatorCodes.getAddition(3,2);   //Here, our method getAddition is also static in nature, therefore we have to
                                            //use ClassName.staticMethodName();
        CalculatorCodes.getSubtraction(3,2);
        CalculatorCodes.getMultiplication(3,2);
        CalculatorCodes.getDivision(10,2);
    }

}