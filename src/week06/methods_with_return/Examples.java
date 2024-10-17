package week06.methods_with_return;

public class Examples {

    public static void main(String[] args) {
                                //2024
        System.out.println(getCurrentYear());
        //store return value into a variable:
        int year = getCurrentYear();
        System.out.println("year = " + year);
                       // 2024
        int nextYear = getCurrentYear() + 1;
        System.out.println("nextYear = " + nextYear);

        System.out.println("=================");

        System.out.println(getAge(2000));
        int age = getAge(1992);
        System.out.println("You are " + age +" years old");

        System.out.println("age = " + getAge(1999, 2012));

        System.out.println(Converter.convertDollars("EUR", 100));
    }

    /*
        getAge(2000) => 24
     */
    public static int getAge(int birthYear) {
        //return 2024 - birthYear;
        return getCurrentYear() - birthYear;
    }

    /*
    getAge(2000, 2005) => 5
     */
    public static int getAge(int birthYear, int anotherYear) {
        return anotherYear - birthYear;
    }


    /*
    getCurrentYear() -> returns 2024
     */
    public static int getCurrentYear() {
        //System.out.println("Returning current year: 2024");
        return 2024;
    }
}
