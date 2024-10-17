package week10;
/*
getSum(["123", "34", "513"]) -> [6, 7, 9]
        getSum(["4913", "1248"]) -> [17, 15]
        getSum(["00110101", "12452", "3111"]) -> [4, 14, 6]
 */

import  java.util.ArrayList;
public class GetSum {
   //"123, "34", "513"

    public static  ArrayList<Integer> getSum(ArrayList<String> list){
        ArrayList<Integer> sums = new ArrayList<>();

        for (String eachNumber: list){
            int sum = 0;
            for (char eachDigit : eachNumber.toCharArray()){
                sum += Character. getNumericValue(eachDigit);
            }
            sums.add(sum);
        }

    return sums;

    }
}
