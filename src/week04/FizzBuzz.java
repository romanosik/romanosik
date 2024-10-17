package week04;
/*
print “Fizz” if an integer is divisible by three,
“Buzz” if an integer is divisible by five,
and “FizzBuzz” if an integer is divisible by both three and five.
otherwise print number itself
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int num = 10;

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

    }
}
