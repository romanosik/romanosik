package week06.void_methods;

public class MethodsWithLoops {
    public static void main(String[] args) {
        printInRange(1, 25);
        printInRange(100, 500);
        printInRange(123, 134);

        printInRange('A','Z');

        MethodsWithLoops.printInRange('D', 'P');

        printInRange(' ','?');

        multiplicationTable(5);
        multiplicationTable(7);

        for (int num = 1; num <= 10; num++) {
            multiplicationTable(num);
        }
        
    }

    /*
    multiplicationTable(5)
     */
    public static void multiplicationTable(int number) {
        System.out.println("---------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number +" x "+ i +" = "+ (number * i));
        }
        System.out.println("---------");
    }

    /*
    printInRange:
    printInRange(1, 5); 1 2 3 4 5
    printInRange(5, 7); 5 6 7

    printInRange('A', 'D'); A B C D
     */
    public static void printInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i +" ");
        }
        System.out.println();
    }

    //Overloading: same method name and different parameters
    public static void printInRange(char start , char end) {
        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch+" ");
        }
        System.out.println();
    }

}
