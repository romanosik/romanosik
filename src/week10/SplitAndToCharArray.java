package week10;

import java.util.Arrays;

public class SplitAndToCharArray {
    public static void main(String[] args) {

        String word = "Sunday";

        // char [] arrayword.toCharArray();
        word.toCharArray();

        char[] allLetter = word.toCharArray();

        System.out.println("count = " + allLetter.length);
        System.out.println(Arrays.toString(allLetter));

        for (char each : allLetter) {
            System.out.println(each);


            // reverse

            for (int i = allLetter.length - 1; i >= 0; i--) {
                System.out.println(allLetter);
            }

            //Split

            String reports = "CF32;CF11;CF33;CF99";

            String[] allReports = reports.split(";");
            System.out.println("count = " + allReports.length);
            System.out.println(Arrays.toString(allReports));

            for (String report : allReports) {
                System.out.println("Testong - " + report);
                switch (report) {
                    case "CF32" -> {
                        //a
                    }
                }
            }

        }
    }
}
