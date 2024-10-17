package week10;

import java.text.DecimalFormat;
import java.util.*;

public class ProfitCalculator {
    public static void main(String[] args) {

        ArrayList<Double> lastYear = new ArrayList<>(Arrays.asList(30.67, 16.34, 10.93, 5.01, 12.97, 11.73, 22.35, 33.9, 68.35));

        ArrayList<Double> currentYear = new ArrayList<>(Arrays.asList(32.24, 15.9, 11.57, 9.14, 10.42, 21.56, 14.16, 42.49, 54.5));


        ArrayList<Double> profits = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < lastYear.size(); i++) {
            double diff = currentYear.get(i) - lastYear.get(i);
            String formatted = df.format(diff);
            profits.add(Double.parseDouble(formatted));

        }
        System.out.println("profits = " + profits);

        System.out.println("max profit = " + Collections.max(profits));
        System.out.println("max loss = " + Collections.min(profits));

        //find dept number

        double minProfit = Collections.min(profits);
        int detIndex = profits.indexOf(minProfit);

        System.out.println(detIndex + " made the lowest profit");


        // Average profit:
        double sum = 0;
        for (double each : profits) {
            sum += each;
        }
        System.out.println("sum = " + sum);
        System.out.println("average " + df.format(sum / profits.size()));


    }
}
