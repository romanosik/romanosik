package week05;
/*
Loop from 1 to 7
and Print WeekDay names instead of numbers
 */
public class WeekDays {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++) {
            switch (i) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }
    }
}
