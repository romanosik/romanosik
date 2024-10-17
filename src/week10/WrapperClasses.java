package week10;

public class WrapperClasses {
    public static void main(String[] args) {

        //max,min
        System.out.println("Max int = " + Integer.MAX_VALUE);
        System.out.println("Min int = " + Integer.MIN_VALUE);

        // Convert String to primitive
        String price = "13.55";
        double dbPrice = Double.parseDouble(price);

        if (dbPrice > 0) {
            System.out.println("Price verification passed");
        } else {
            System.out.println("Price verification failed");
        }


        String temperature = "73";
        // value returns Wrapper object
        Integer temp = Integer.valueOf(temperature);
        System.out.println("temp = " + temp);


        // Autoboxing: convert primitive to Wrapper Class object
        Integer myInt = 55;
        double d = 2.5;
        Double d2 = d;

        // Unboxing : convert Wrapper class object to primitive

        Integer int1 = Integer.valueOf(123);
        int int2 = int1;

        // character class:

        char ch = 'a';
        System.out.println("isLetter = " + Character.isLetter(ch));
        System.out.println("isUppercase = " +Character. isUpperCase(ch));
        System.out.println("to Uppercase = " + Character.toUpperCase(ch));

        String str = "abc12 de32_12abc_java";


    }
}
