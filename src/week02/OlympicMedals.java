package week02;

public class OlympicMedals {
    public static void main(String[] args) {
        int rank = 1;
        String flag = "\uD83C\uDDFA\uD83C\uDDF8";
        String country = "United States";
        int gold = 40;
        int silver = 44;
        int bronze = 42;
        int totalMedals = 126;

        System.out.println("Team\t\t\t\t\t\t\t\t1 \t2 \t3 \ttotal");
        System.out.println(rank + " " +flag +" "+country+"\t\t\t\t\t"+gold +"\t"+silver+"\t"+bronze+"\t"+totalMedals);

        //TODO: change values for China
        rank = 2;
        flag = "\uD83C\uDDE8\uD83C\uDDF3";
        country = "China";
        gold = 40;
        silver = 27;
        bronze = 24;
        totalMedals = 91;

        System.out.println(rank + " " +flag +" "+country+"\t\t\t\t\t\t\t"+gold +"\t"+silver+"\t"+bronze+"\t"+totalMedals);

        //Japan
        rank = 3;
        flag = "\uD83C\uDDEF\uD83C\uDDF5";
        country = "Japan";
        gold = 20;
        silver = 12;
        bronze = 13;
        totalMedals = 45;

        System.out.println(rank + " " +flag +" "+country+"\t\t\t\t\t\t\t"+gold +"\t"+silver+"\t"+bronze+"\t"+totalMedals);
    }
}
