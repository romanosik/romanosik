package week03;
/*
SecondsToMinutes [variables, remainder operator, concatenation]
    Declare and assign the following variables
        totalSeconds

    Declare minutes , calculate minutes in totalSeconds
    Declare seconds , calculate remaining seconds
    Display in this format:
    In 550 seconds - there are 9 minutes and 10 seconds
 */
public class SecondsToMinutes {
    public static void main(String[] args) {
        int totalSeconds = 550;

        //divide by 60 to calculate minutes
        int minutes = totalSeconds / 60;

        System.out.println("Minutes = " + minutes);

        //remainder operator to calculate remaining seconds
        int remainingSeconds = totalSeconds % 60; //(60+60+30)
        System.out.println("Remaining seconds = " + remainingSeconds);

        System.out.println("In " + totalSeconds +" seconds - there are " + minutes + " minutes and " + remainingSeconds +" seconds");
    }
}
