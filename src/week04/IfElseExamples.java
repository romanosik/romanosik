package week04;

public class IfElseExamples {
    public static void main(String[] args) {
        //if boolean isHungry is true -> Lets get some snack. Keep Coding java.
        //if false -> Not hungry, lets keep coding java
        boolean isHungry = true;

        if (isHungry) { //isHungry == true
            System.out.println("Lets get some snack");
            System.out.println("Keep coding java");
        } else {
            System.out.println("Not hungry, lets keep coding java");
        }
        System.out.println("======================");

        //boolean lockdown is true when int year is 2020 or 2021
        //if lockdown: print some messages
        //else: print some other message

        int year = 2020;
        boolean lockdown = year == 2020 || year == 2021;

        if (lockdown) {
            System.out.println("Stay home");
            System.out.println("Wear mask");
            System.out.println("Keep coding java");
        } else {
            System.out.println("Meet friends and family");
            System.out.println("Go out, and keep coding java");
        }

    }
}
