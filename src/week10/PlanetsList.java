package week10;


import java.util.*;

public class PlanetsList {
    public static void main(String[] args) {

        //Create an arraylist and add planet names in solar system:


        ArrayList<String> planets = new ArrayList<>();
        planets.addAll(Arrays.asList("Mercury", "Venus", "Mars", "Earth", "Jupiter", "Saturn", "Neptune",
                "Pluto", "Uranus"));

        // print first and last planet names:

        System.out.println("First = " + planets.get(0));
        System.out.println("Last = " + planets.get(planets.size() - 1));


        // Print each planet in uppercase:

        System.out.println("planets = " + planets);
        System.out.println("planets = " + planets.toString().toUpperCase());


        // Print each planet in uppercase in separate lines:

        for (String planet : planets) {
            System.out.println("planet = " + planet.toUpperCase());

        }
        // Print each planet in reverse order using a loop:
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }


        System.out.println("----------------------------------------");

        for (int i = planets.size() - 1; i >= 0; i--) {
            System.out.println(planets.get(i));
        }

        System.out.println("----------------------------------------");


        planets.forEach(planet -> System.out.println(planets));

        // Print 2 planets  at a time
        for (int i = 0; i < planets.size(); i += 2) {
            // check if we are at the last planet
            if (i == planets.size() - 1) {
                System.out.println(planets.get(i));
            } else {
                System.out.println(planets.get(i) + " - " + planets.get(i + 1));
            }
        }
    }
}
