package week04;

public class IPhonePrices {
    public static void main(String[] args) {
        String iphoneModel = "14";
        System.out.println("iPhone " + iphoneModel);

        switch (iphoneModel) {
            case "15 Pro":
                System.out.println("From $999 or $41.62/mo.per month for 24 months");
                break;
            case "15 Pro Max":
                System.out.println("From $1199 or $49.95/mo. per month for 24 months");
                break;
        }

        System.out.println("Buy");

        System.out.println("==========ENHANCED SWITCH==========");

        switch (iphoneModel) {
            case "15 Pro" -> System.out.println("From $999 or $41.62/mo.per month for 24 months");
            case "15 Pro Max" -> System.out.println("From $1199 or $49.95/mo. per month for 24 months");
            case "15" -> System.out.println("From $799 or $33.29/mo.per month for 24 months");
            case "15 Plus" -> System.out.println("From $899 or $37.45/mo.per month for 24 months");
            case "14" -> System.out.println("From $699or $29.12/mo.per month for 24 months");
            case "14 Plus" -> System.out.println("From $799or $33.29/mo.per month for 24 months");
            default -> System.out.println("Invalid iphone Model - " + iphoneModel);
        }

    }
}
