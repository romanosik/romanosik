package week04;
/*
    hourlyRate = 45, hours = 45, calculate pay

    if hours is more than 40:
        print Overtime and
        40 hours is regular pay
        anything over 40 is overtime pay, which is 55 per hour
    else:
        multiple hours by hourlyRate and assign to pay

    calculate pay and print out
 */
public class Overtime {
    public static void main(String[] args) {
        int hourlyRate = 45;
        int hours = 48;

        int pay;

        if (hours > 40) {
            System.out.println("Overtime");
            int overtimeHours = hours - 40;
            System.out.println("overtimeHours = " + overtimeHours);
            pay = (40 * hourlyRate) + (overtimeHours * 55);
        } else {
            System.out.println("Not overtime");
            pay = hours * hourlyRate;
        }

        System.out.println("Your weekly pay = $" + pay);
        //optionally calculate tax as 25%
        double tax = pay * 0.25;
        System.out.println("tax = $" + tax);
        System.out.println("net pay = $" + (pay - tax));
    }
}
