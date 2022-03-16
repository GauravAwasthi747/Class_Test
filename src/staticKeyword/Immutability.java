package staticKeyword;

public class Immutability {

    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Dog";
        String s3 = "Cat";
        String s4 = new String("Cat");

        System.out.println("s1 == s2: "+(s1.equals(s2)));
        System.out.println("s1 == s3: "+(s1.equals(s3)));
        System.out.println("s1 == s4: "+(s1.equals(s4)));

    }
}
