package week09;

import java.util.Arrays;

public class QuizArray {
    public static void main(String[] args) {

        boolean[] quizResult = {true, true, true, false, true, false, true, true, true, false};

        //check if PASS or FAIL. PASS- >= 7 correct answers, otherwise fail
        int counter = 0; //track correct answers
        for(boolean questionResult : quizResult ) {
            if (questionResult == true) {
                counter++;
            }
        }

        System.out.println(Arrays.toString(quizResult));

        if (counter >= 7) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }
}
