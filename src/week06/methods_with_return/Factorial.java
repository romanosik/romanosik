package week06.methods_with_return;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5)); //1 * 2 * 3 * 4 * 5
        System.out.println("factorial of 10 = " + factorial(10));
    }

    public static int factorial(int num) {
        int result = 1;
        for(int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
