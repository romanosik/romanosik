package week09;

public class DailySteps {
    public static void main(String[] args) {
        //array that stores number of steps for a week
        int[] dailySteps = new int[7];//0,0,0,0,0,0,0
        dailySteps[0] = 4321;
        dailySteps[1] = 2345;
        dailySteps[2] = 7643;
        dailySteps[3] = 333;
        dailySteps[4] = 5424;
        dailySteps[5] = 10212;
        dailySteps[6] = 9212;

        //array that stores weekday names
                       //  0         1           2              3         4         5            6
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //max, min, avg
        int maxSteps = dailySteps[0];
        int minSteps = dailySteps[0];

        int maxStepsIndex = 0;
        int minStepsIndex = 0;

        for (int i = 1; i < dailySteps.length; i++) {
            if (dailySteps[i] > maxSteps) {
                maxSteps = dailySteps[i];
                maxStepsIndex = i;
            }

            if (dailySteps[i] < minSteps) {
                minSteps = dailySteps[i];
                minStepsIndex = i;
            }

        }
        System.out.println("maxSteps = " + maxSteps);
        System.out.println("maxStepsIndex = " + maxStepsIndex);
        //also print weekday name along with number
        System.out.println("Max steps day = " + days[maxStepsIndex] + " steps = " + maxSteps);

        System.out.println("Min steps day = " + days[minStepsIndex] + " steps = " + minSteps);

        System.out.println("===========AVERAGE==============");

        int totalSteps = 0;

        for (int eachDay : dailySteps) {
            totalSteps += eachDay;
        }
                                                                            //totalSteps / 7
        System.out.println("Your average number of steps this week = " + (totalSteps / dailySteps.length));

    }
}
