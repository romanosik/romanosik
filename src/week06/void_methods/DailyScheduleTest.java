package week06.void_methods;

/*
When calling method from another class, we need to type ClassName.methodName()
 */
public class DailyScheduleTest {
    public static void main(String[] args) {
        Examples.makeCoffee();
        Examples.dailyRoutine("Monday");
    }
}
