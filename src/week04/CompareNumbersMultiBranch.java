package week04;
/*
a and b
if a is greater b: "a is greater"
if b is greater than a : "b is greater"
otherwise : they are equal

a,b,c
compare and find biggest number among three

 */
public class CompareNumbersMultiBranch {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        if (a > b) {
            System.out.println("a is greater");
        } else if (b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("they are equal");
        }

        System.out.println("====================");

        a = 10;
        b = 10;
        int c = 3;

        if (a >= b && a >= c) {
            System.out.println(a +" is biggest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is biggest");
        } else {
            System.out.println(c + " is biggest");
        }

    }
}
