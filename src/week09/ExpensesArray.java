package week09;

public class ExpensesArray {
    public static void main(String[] args) {
        double accountBalance = 255.43;

        double[] expenses = {5.0, 12.33, 55.0, 121.90, 76.34};

        //read some values from array
        System.out.println(expenses[0]);
        System.out.println(expenses[1]);
        
        //total number of transactions:
        System.out.println(expenses.length);
        int count = expenses.length;
        System.out.println("count = " + count);

        //print each expense using a loop
        for(double each : expenses) {
            System.out.print(each +" ");
        }

        System.out.println();

        for(int i = 0; i < expenses.length; i++) {
            System.out.println(i + " -> " + expenses[i]);
        }

        /*
            transaction $5.0 - $250.43
            transaction $12.33 - $238.10
            ...
            Remaining balance: $122
         */
        System.out.println("--- TRANSACTION HISTORY ---");

        for(double eachExpense : expenses) {
            accountBalance -= eachExpense;
            System.out.println("transaction $" + eachExpense +" - $" + accountBalance);
        }

        System.out.println("Remaining balance: $" + accountBalance);

    }
}
