package week02;

/*
    This is multi line comment:
    Escape sequences:
        \n -> adds new line
        \t -> adds tab
        \" -> adds double quote
        \' -> adds single quote
        \\ -> adds one backslash
 */

public class EscapeSequencePractice {
    public static void main(String[] args) {
        //Java
        //SDET
        System.out.println("Java\nSDET");

        //Java  SDET
        System.out.println("Java\tSDET");

        //Hello Cydeo "Batch37" friends!
        System.out.println("Hello Cydeo \"Batch37\" Friends!");

        //Let's code "java" everyday!
        System.out.println("Let\'s code \"java\" everyday!");

        // To print \ I have to use \\ in java
        // \_/
        System.out.println("\\_/");
        System.out.println("To print \\ I have to use \\\\");
    }
}
