package week07;

import java.util.*;


public class GuessNumber1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100);  // random number 0-99
        int guessingNumber;
        int tries = 0;

        do {
            System.out.println("Guess the secret number: ");
            guessingNumber = input.nextInt();
            tries++;

            if (guessingNumber > secretNumber) {
                System.out.println("Too big");

            } else if (guessingNumber < secretNumber) {
                System.out.println("Too small");
            } else {
                System.out.println("Congratulations, you won!");
            }
            if (tries == 5 && guessingNumber != secretNumber) {
                System.out.println(" You lost! Secret number = " + secretNumber);
                break;
            }

        } while (guessingNumber != secretNumber);

        System.out.println("Game over");
    }
}
