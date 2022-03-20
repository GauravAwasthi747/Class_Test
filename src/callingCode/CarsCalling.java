package callingCode;
import learnConstructor.Cars;

public class CarsCalling {
    public static void main(String[] args) {
        Cars toyota = new Cars("Toyota", "GT86", 2022);
        Cars bmw = new Cars("bmw", 2021, "x3");

        System.out.println(toyota.model);
        System.out.println(bmw.model);


    }
}