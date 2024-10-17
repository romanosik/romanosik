package week05;

public class ForLoopExamples {
    public static void main(String[] args) {
        //Print "Hello!" 10 times
        for(int i = 1; i <= 10; i++) {
            System.out.println("Hello!");
        }

        //Print hi 5 times, and number together: hi - 1, hi - 2
        for(int i = 1; i <= 5; i++) {
            System.out.println("hi - " + i);
        }

        //print Bye from 6 to 1. print Bye - 6..Bye - 5..Bye - 1
        for(int j = 6; j >= 1; j--) {
            System.out.println("Bye - " + j);
        }

    }
}
