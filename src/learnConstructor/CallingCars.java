package learnConstructor;

public class CallingCars {
    public static void main(String[] args) {
        Cars bmw = new Cars("bmw", "X3", 2022);
        Cars toyota = new Cars("toyota", 2023, "GT86");

        System.out.println(toyota.model);


    }
}
