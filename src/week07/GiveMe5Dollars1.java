
package week07;

import java.util.Scanner;

/*
Keep asking to enter 5
Thank you for 5 dollars
 */
public class GiveMe5Dollars1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollars;

        do {
            System.out.println("Give me 5$");
            dollars = input.nextInt();
        } while (dollars != 5);
        System.out.println("Thank you for $5");

input.close();
    }
}
