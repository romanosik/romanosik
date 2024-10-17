package week10;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {


        // arraylist with raw type. Not Recommended

        ArrayList rawList = new ArrayList();
        rawList.add(100);
        rawList.add("Java");
        rawList.add(5.4);
        rawList.add(true);

        System.out.println("rawList = " + rawList);


        //ArrayList with integers only

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(65);

        System.out.println("nums = " + nums);

        // add 88 to 0 index :
        nums.add(0, 88);
        nums.add(100);
        System.out.println("nums = " + nums);


        // read value at  specific index:
        System.out.println(nums.get(0));
        System.out.println(nums.get(2));


        //change value at certain index
        nums.set(0, 188);
        System.out.println("nums = " + nums);


        // double the value of index 1:

        nums.set(1, nums.get(1) * 2);
        System.out.println("nums = " + nums);

        // length of arraylist:
        System.out.println(nums.size());


        // Create ArrayList of String colors and add multiple colors in same statement


        ArrayList<String> colors = new ArrayList<>(Arrays.asList("blue", "grey", "brown, black", "white"));
        System.out.println("colors = " + colors);

        for (String color : colors){
            System.out.println(color);
        }


        colors.remove("grey");
        System.out.println("colors = " + colors);


    }

}
