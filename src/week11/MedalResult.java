package week11;

public class MedalResult {

    public static  String event = " Olympic Games Paris 2024";
    public  static  int totalMedalsOfOlympics;

     public  String county;
     public  int gold;
     public  int silver;
     public  int bronze;
     public  int total;
    public String country;

    @Override
    public String toString() {
        return "MedalResult{" +
                "county='" + county + '\'' +
                ", gold=" + gold +
                ", silver=" + silver +
                ", bronze=" + bronze +
                ", total=" + total +
                '}';
    }

    public MedalResult(String county, int gold, int silver, int bronze) {
        this.county = county;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        // total of medals for a country
        this.total = gold+silver+bronze;
        // add to total medals in olympics for all countries
        totalMedalsOfOlympics +=total;


    }
}
