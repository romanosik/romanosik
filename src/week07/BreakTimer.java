package week07;

import java.util.Scanner;

public class BreakTimer {
    public static void main(String[] args) throws InterruptedException {
        //create scanner object/instance
        Scanner input = new Scanner(System.in);

        System.out.println("How long is the break?");
        int minutes = input.nextInt();
        input.close();

        for(int mins = minutes-1; mins >= 0; mins--) {
            for(int seconds = 59; seconds >= 0; seconds--) {
                //pause the code for one second
                Thread.sleep(1000);
                System.out.println("minutes = " + mins +" seconds = " + seconds);
            }
        }

        System.out.println("BREAK TIME IS OVER. PLEASE COME BACK TO CLASS");

    }
}
