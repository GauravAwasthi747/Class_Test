package methods.accessModifiers;

import testPackage.Dog;

public
class LearnStatic {
    public static void main(String[] args) {

        Dog fido = new Dog();
        Dog airBud = new Dog();

        System.out.println(fido.typeOfAnimal);
        System.out.println(airBud.typeOfAnimal);

        fido.breed = "Pug"; //it will point to different place in memory
        airBud.breed = "maltese";//it will point to different place in memory
        Dog.typeOfAnimal = "best friend"; // right way to call a static member of a class is by using class name i.e. Dog here.

        //Dog.breed //incorrect way of calling non-static member because we need objects to all the non-static members e.g. line 9 and 15.

        System.out.println(airBud.typeOfAnimal);
        System.out.println(fido.typeOfAnimal);
    }
}
