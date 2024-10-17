package week10;

public class GoogleSearch {
    public static void main(String[] args) {


        String searchResults = "About 3,940,000,000 results (0.39 seconds)";

        String[] resultParts = searchResults.split(" ");

        String numberOfResults = resultParts[1];
        System.out.println("numberOfResults = " + numberOfResults);

        // remove commas:
        numberOfResults = numberOfResults.replace(",", "");

        // convert numberOfResults to integer/long
        Long count = Long.parseLong(numberOfResults);
        System.out.println("count = " + count);

        if (count < 100_000_000L) {
            System.out.println("Good Search");
        } else {
            System.out.println("Narrow your search, too many results");
        }

        //  in under 0.85 seconds or less. Seconds

        String numberOfSeconds = resultParts[3].replace("(", "");
        System.out.println("numberOfSeconds = " + numberOfSeconds);


        if (Double.parseDouble(numberOfSeconds) < 0.85) {
            System.out.println("Results speed check passed");
        } else {
            System.out.println("Results speed check failed");
        }

    }
}