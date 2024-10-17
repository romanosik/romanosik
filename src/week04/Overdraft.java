package week04;
/*
1) declare 2 double variables and assign values:
    - balance
    - price
 2) we decrease value of balance by price (-=)
 3) if balance is negative, reduce balance by $35 overdraft fee.
    print "Account overdraft fee applied
 4) print out balance
 */
public class Overdraft {
    public static void main(String[] args) {
        double balance = 100.0;
        double price = 15.0;

        // 2) we decrease value of balance by price (-=)
        balance -= price;

       // 3) if balance is negative, reduce balance by $35 overdraft fee.
        //        print "Account overdraft fee applied
        if (balance < 0) {
            balance -= 35;
            System.out.println("Account overdraft fee applied");
        }

        // 4) print out balance
        System.out.println("balance = $" + balance);
    }
}
