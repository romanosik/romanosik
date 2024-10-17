package week05;

/*
0 1 1 2 3 5 8 13 21..
 */
public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second +" ");

        for (int i = 1; i <= 10; i++) {
            int next = first + second;
            System.out.print(next +" ");
            first = second;
            second = next;
        }

    }
}
