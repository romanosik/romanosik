package week09;

import java.util.Arrays;

public class Channels2DArray {
    public static void main(String[] args) {
        String[][] messages = {{"hi", "what is an array"},
                               {"code solution", "arrays task code"},
                               {"group study", "when is next live class?"}};

        System.out.println(Arrays.deepToString(messages));

    }
}
