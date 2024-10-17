package week10;

public class ReverseSentence {
    public static void main(String[] args) {


        String sentence = "Sunday October 6th 2024";

        // 1) you have a sentence, find out how many word in it
        String[] allWords = sentence.split(" ");
        System.out.println("Count of words = " + allWords.length);

        // removing spaces then comparing the length
        int length = sentence.length() - sentence.replace(" ", "").length();
        System.out.println("Count of words = " + length + 1);

        System.out.println("-----------------------------------");
        // 2) you have a sentence,reverse each word in it
        // "Sunday October 6th 2024" => " 2024 6th October Sunday"
        //  java is fun -> fun is java

        String reversed = "";

        for (int i = allWords.length - 1; i >= 0; i--) {
            reversed += allWords[i] + " ";
        }
        System.out.println("reversed = " + reversed.trim());


    }
}
