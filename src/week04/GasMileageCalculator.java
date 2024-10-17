package week04;
/*
    current, previous, gallons,
    calculate and assign to gasMileage
    if gasMileage more than= 25 -> good gas mileage
    otherwise poor gas mileage
 */
public class GasMileageCalculator {
    public static void main(String[] args) {
        double current = 12000.0;
        double previous = 11500.0;
        double gallons = 35.5;

        double gasMileage = (current - previous) / gallons;
        System.out.println("gasMileage = " + gasMileage);

        if (gasMileage >= 25.0) {
            System.out.println("Good gas mileage");
        } else {
            System.out.println("Poor gas mileage");
        }

    }
}
