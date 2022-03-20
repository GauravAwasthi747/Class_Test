package learnConstructor;

public class Cars {
    //Creating a constructor for Class Car
    //Constructor job is to create the objects for this class Car.

     public Cars(String make, String model, int year) { //here we are telling our constructor to ask for these parameters for
                                                //every object created for this class.
        this.make = make;       // we have to use Java Keyword this. inorder to use Instance variables in a constructor.
        this.model = model;
        this.year = year;
    }

     public Cars(String make, int year, String model) {
         this.make = make;
         this.year = year;
         this.model = model;
    }

    public String make, model, color;  //->These are the Instance variables that belongs to each instance or object of Class Car.
    int year;                   //->Also, Static is missing in front of them that makes them to belong to the Class Car not its objects.
                                //-> make, model and year on line 7 and line 12 are not same because on line 7 they are parameters, whereas on line 12
                                // they are instance objects of Class Car.
                                //-> Lastly, these Instance variables are protected in nature by default, because no access modifiers are used. So to use
                                // them in a different Class CarsCalling on line 8, we have to provide public as an access modifier.


    //Declaring Methods
    void acceleration() {

    }


}
