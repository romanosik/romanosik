package week08;

public class StringIntro {
    public static void main(String[] args) {
        //creating string objects
        String str = "java string review"; //String pool
        String str2 = new String("java string review"); //outside the string pool

        //== will check references for objects. If both variables point to same object
        System.out.println(str == str2);
        //equals() will check if both strings contain same characters
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println("java".equalsIgnoreCase("JAVA"));
        System.out.println("java".equals("JAVA"));

        //length of characters
        System.out.println(str.length());
        System.out.println("java".length());

        int len = str.length();
        System.out.println("len = " + len);

        System.out.println("=======================");
        String str3 = "hi";
        System.out.println(str3.charAt(0));
        System.out.println("second char = " + str3.charAt(1));
        char secondLetter = str3.charAt(1);
        System.out.println("secondLetter = " + secondLetter);
        System.out.println("hello".charAt(3)); //l
        System.out.println("hello".charAt(4));

        //get last character of any string: length + charAt
        String word = "string manipulation";
        System.out.println(word.length());//19

        System.out.println(word.charAt( word.length() - 1 ));

        System.out.println("java".toUpperCase());
        System.out.println("JavA".toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("word = " + word);
        
        word = word.toUpperCase();
        System.out.println("word = " + word);
    }
}
