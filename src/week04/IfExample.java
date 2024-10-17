package week04;

public class IfExample {
    public static void main(String[] args) {
        //boolean sunny is true
        boolean sunny = true;
        System.out.println("Lets check if it is sunny");

        if(sunny) {
            System.out.println("I will take sunglasses");
        }

        System.out.println("Lets go out");

        System.out.println("=============================");

        //if double balance is 0 or negative, print broke
        double balance = 10;

        if (balance <= 0) {
            System.out.println("Broke");
        }

        System.out.println("After balance check");


    }
}
