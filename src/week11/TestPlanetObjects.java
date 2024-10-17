package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPlanetObjects {
    public static void main(String[] args) {

        Planet earth = new Planet("Earth", 149_600_000L);
        System.out.println(earth);

        Planet mercury = new Planet("Mercury", 57_900_000L);
        System.out.println("mercury = " + mercury);

        Planet[] planetsArr = {earth, mercury, new Planet(" Venus", 108_200_00L)};
        System.out.println(Arrays.toString(planetsArr));
        System.out.println(planetsArr.length);
        System.out.println(planetsArr[0]);  // earth
        System.out.println(planetsArr[1]); // Mercury

        // ArrayList of Planet objects:

        ArrayList<Planet> planetsList = new ArrayList<>();

        planetsList.add(new Planet("Mercury", 57_900_000L));
        planetsList.add(new Planet("Venus", 108_200_000L));
        planetsList.add(new Planet("Earth", 149_600_000L));
        planetsList.add(new Planet("Mars", 227_900_000L));
        planetsList.add(new Planet("Jupiter", 778_500_000L));
        planetsList.add(new Planet("Saturn", 1_430_000_000L));
        planetsList.add(new Planet("Uranus", 2_870_000_000L));
        planetsList.add(new Planet("Neptune", 4_500_000_000L));

        //  print total number of planets
        System.out.println(" Total number of planets = " + planetsList.size());

        // print first and last planet names
        System.out.println(" First = " + planetsList.get(0).name);
        System.out.println(" Last = " + planetsList.get(planetsList.size() - 1).name);

        // print  each planet name in same line:
        planetsList.forEach(each -> System.out.println(each.name + "  "));

        // first the planet closest to sun:
        Collections.shuffle(planetsList);
        String closestPlanet = "";
        long min = planetsList.get(0).distanceFromSun;
        for (Planet eachPlanet : planetsList) {
            if (eachPlanet.distanceFromSun < min) {
                min = eachPlanet.distanceFromSun;
                closestPlanet = eachPlanet.name;

            }
        }

        System.out.println("\nclosestPlanet = " + closestPlanet);


    }
}
