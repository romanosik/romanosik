package week06.void_methods;

public class Examples {

    public static void main(String[] args) {
        System.out.println("---Starting my day---");

        makeCoffee();
        exercise(15);
        study("java loops", 2);
        study("git commit", 1);

        //System.out.println(study("agile", 3)); ERROR

        nap(9);
        nap(25);

        dailyRoutine("Sunday");

    }

    public static void dailyRoutine(String day) {
        System.out.println("======" + day +"========");
        switch (day) {
            case "Monday","Tuesday","Wednesday" -> {
                makeCoffee();
                study("java tasks", 1);
                exercise(20);
                study("java modules", 2);
                nap(23);
            }

            case "Thursday","Friday","Saturday" -> {
                makeCoffee();
                exercise(35);
                study("soft skills modules", 2);
                makeCoffee();
                nap(10);
            }

            case "Sunday" -> {
                makeCoffee();
                exercise(15);
                study("live review session", 4);
                makeCoffee();
                nap(32);
                study("live review session", 3);
            }

            default -> System.out.println("Invalid day");
        }
    }

    public static void makeCoffee() {
        System.out.println("Making strong coffee...");
    }
    /*
        exercise(5);
        exercise(25);
     */
    public static void exercise(int minutes) {
        System.out.println("Exercising for " + minutes + " minutes...");
    }

    /*
    study("java", 2);
    study("git", 1);
     */

    public static void study(String topic, int hours) {
        System.out.println("Studying "+topic +" for "+ hours +" hours...");
    }

    /*
      nap(30);
      nap(5);
      nap(55);
      minutes <= 10 -> short nap for 10 minutes
      minutes <= 30 -> moderate nap for .. minutes
      minutes <= 60 -> long nap for .. minutes
      > --> wake up and code java, its been ... minutes
     */
    public static void nap(int minutes) {
        if (minutes <= 10) {
            System.out.println("short nap for " + minutes +" minutes...");
        } else if (minutes <= 30) {
            System.out.println("moderate nap for " + minutes +" minutes...");
        } else if (minutes <= 60) {
            System.out.println("long nap for " + minutes +" minutes...");
        } else {
            System.out.println("wake up and code java, its been " + minutes +" minutes...");
        }
    }

}
