package week04;
/*
Prime [nested if]
    declare boolean and assign isPrimeMember variable
    double totalPrice
    double shipping

    if isPrimeMember, then shipping is free also if total price is more than $35 then free same day shipping
    if not isPrimeMember, then shipping is free only when total is more than $35, otherwise 5.99

 */
public class Prime {
    public static void main(String[] args) {
        boolean isPrimeMember = false;
        double totalPrice = 15.0;
        double shipping = 0.0;

        if (isPrimeMember) {
            if (totalPrice >= 35.0) {
                System.out.println("PrimeMember - free same-day shipping");
            } else {
                System.out.println("PrimeMember - free prime shipping");
            }
        } else {
            if (totalPrice >= 35.0) {
                System.out.println("Not PrimeMember - free regular shipping");
            } else{
                System.out.println("Not PrimeMember - $5.99 shipping fee");
                shipping = 5.99;
            }
        }

        System.out.println("Total $" + totalPrice +" shipping $"+shipping);

    }
}
