package week08;

public class ExtractValues {
    public static void main(String[] args) {
        String str = "Address=3322 Main st East";

        int idx = str.indexOf("=") + 1;
        System.out.println(str.substring(idx));

        String etsy = "988 results,with Ads";
        String count = etsy.substring(0, etsy.indexOf(" "));
        System.out.println("count = " + count);
    }
}
