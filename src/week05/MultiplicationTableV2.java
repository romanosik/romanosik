package week05;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 9; j++) {
                //System.out.println("i = " + i +", j = " + j );
                System.out.println(i + " x " + j +" = "+(i * j));
            }

            System.out.println("==============");
        }

        for(int outer = 1; outer <= 4; outer++) {
            for(int inner = 1; inner <= 3; inner++) {
                System.out.println("outer = " + outer + " inner = " + inner);
            }
        }


    }
}
