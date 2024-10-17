package week05;
/*
Prime number is only divisible by 1 and itself.
 */

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 20;
        boolean isPrime = true;

        for (int i = 2; i < num;i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num +" is Prime number");
        } else {
            System.out.println(num +" is Not Prime number");
        }
    }
}
