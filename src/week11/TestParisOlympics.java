package week11;

import static week11.ParisOlympics.*;
import static java.lang.Math.*;
import static java.lang.Character.*;

public class TestParisOlympics {
    public static void main(String[] args) {
        System.out.println(ParisOlympics.allMedals.size());
        ParisOlympics.addAllMedals();
        System.out.println(ParisOlympics.allMedals.size());

        ParisOlympics.searchByCountry("France");
        ParisOlympics.searchByCountry("Brazil");

        ParisOlympics.searchByTotalMedals(20);

        searchByCountry("Tunisia");
        searchByCountry("Egypt");
        searchByTotalMedals(30);

        allMedals.get(0);

        System.out.println(max(5, 9));
        System.out.println(isLetter('A'));
    }
}
