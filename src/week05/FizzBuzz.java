package week05;
/*
   loop from 1 to 100

   print Fizz to number is divisible by 3
   print Buzz to numbers divisible by 5
   print FizzBuzz for numbers divisible by 3 and 5
   Otherwise print the number itself
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
