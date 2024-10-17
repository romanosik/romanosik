package week04;
/*if temperature is more than equals 70:
            It is a nice day
            Go out and code java
          else {
            It is cold
            Stay home and code java
        */
public class Temperature {
    public static void main(String[] args) {
        int temperature = 44;
        //boolean niceDay = temperature >= 70;

        if (temperature >= 70) {
            System.out.println("It is a nice day");
            System.out.println("Go out and code java");
        } else {
            System.out.println("It is cold");
            System.out.println("Stay home and code java");
        }

    }
}
