package week06;

public class ZombieAttackTask {
    public static void main(String[] args) {
        int inhabitants = 21000000;
        int day = 0;

        while (inhabitants > 0) {
            System.out.println("Day "+ day +" ["+ inhabitants +"]");
            inhabitants /= 2;
            day++;
        }

        System.out.println("----EXTINCT----");

    }
}
