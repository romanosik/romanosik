package week09;
/*
    - Find and print all the first and last characters

    - Find the largest and smaller countries based on the length of their names

    - Show all the countries that start with a 'C'

    - Show all the countries that end with an 's'
 */

public class Countries {
    public static void main(String[] args) {
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        //- Find and print all the first and last characters
        for(String country : countries) {
            System.out.println(country.charAt(0) + "" + country.charAt(country.length()-1));
        }

        //- Find the largest and smaller countries based on the length of their names
        String largest = countries[0];
        String smallest = countries[0];

        for (String country : countries) {
            if (country.length() > largest.length()) {
                largest = country;
            }

            if (country.length() < smallest.length()) {
                smallest = country;
            }
        }
        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);

        //- Show all the countries that start with a 'C'
        for (String each : countries) {
            if (each.startsWith("C")) {     //if (each.charAt(0) == 'C'
                System.out.println(each);
            }
        }

        //- Show all the countries that end with an 's'
        for (String each : countries) {
            if (each.endsWith("s")) {
                System.out.println(each);
            }
        }
    }
}
