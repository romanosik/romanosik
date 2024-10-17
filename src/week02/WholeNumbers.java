package week02;

public class WholeNumbers {
    public static void main(String[] args) {
        //declare students variable:
        int students;

        //assign/initialize 72 to students:
        students = 72;

        //declare and initialize teachers variable with value 2
        int teachers = 2;

        System.out.println(students);
        System.out.println("students");

        //2 teachers
        System.out.print(teachers);
        System.out.println(" teachers");

        //byte, short, int, long
        byte n1 = 100;
        short n2 = 32100;
        int n3 = 23_654_788;
        long n4 = 64654564654564L;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        byte screenSize = 16;
        System.out.println(screenSize);//16
        //change value to 24
        screenSize = 24;
        System.out.println(screenSize);//24

        int apples = 20;
        apples = 25;
        System.out.println(apples); //25

        apples = 35;
        System.out.println(apples); //35

        int count = 55;
        int bananas = count; //copy count value to bananas variable

        System.out.println(count);
        System.out.println(bananas);

    }
}
