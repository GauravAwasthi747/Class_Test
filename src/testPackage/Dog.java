package testPackage;

public class Dog {
    public static String typeOfAnimal = "Dog";  //it will point to same place in memory, but its value can change or over-written.
    public String breed;
    public String name;
    public String age;

    void bark() {

    }

    void sleep() {

    }

    void eat() {

    }

    void getAnimalType() {             //calling static type from the same class it was declare in
        System.out.println(Dog.typeOfAnimal);
    }
}
