package week06.methods_with_return;

public class ShoesSize {

    public static void main(String[] args) {
        System.out.println(getShoesSize(30.0));
        System.out.println(getShoesSize(26.1));
        System.out.println(getShoesSize(32.1));
        System.out.println(getShoesSize(33.5));
        System.out.println(getShoesSize(33.0));
    }

    public static int getShoesSize(double length) {
        if (length < 28.9 || length > 33.0) {
            System.out.println("Shoes size not available for " + length);
            return 0; //exits method here
        }

        if (length >= 28.9 && length < 29.7) {
            return 8;
        } else if (length < 30.5) {
            return 9;
        } else if (length < 31.4) {
            return 10;
        } else if (length < 32.2) {
            return 11;
        } else if (length < 33.0) {
            return 12;
        } else {
            return 13;
        }
    }
}
