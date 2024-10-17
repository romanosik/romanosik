package week04;
/*
PizzaSize[multi branch if, char]
    declare char pizzaSize.
    can be 'S', 'M', 'L'
    print message for selection.
    If all false, invalid selection
 */
public class PizzaSize {
    public static void main(String[] args) {
        char pizzaSize = 'S';
        double price;

        if (pizzaSize == 'S') {
            System.out.println("Cheese Pizza Small 10\"");
            price = 12.09;
        } else if (pizzaSize == 'M') {
            System.out.println("Cheese Pizza Medium 12\"");
            price = 15.39;
        } else if (pizzaSize == 'L') {
            System.out.println("Cheese Pizza Large 14\"");
            price = 18.69;
        } else {
            System.out.println("Invalid size - " + pizzaSize);
            price = 0;
        }

        System.out.println("$"+price);

        System.out.println("===========Flexible for case difference====================");
        pizzaSize = 's';

        if (pizzaSize == 'S' || pizzaSize == 's') {
            System.out.println("Cheese Pizza Small 10\"");
            price = 12.09;
        } else if (pizzaSize == 'M' || pizzaSize == 'm') {
            System.out.println("Cheese Pizza Medium 12\"");
            price = 15.39;
        } else if (pizzaSize == 'L' || pizzaSize == 'l') {
            System.out.println("Cheese Pizza Large 14\"");
            price = 18.69;
        } else {
            System.out.println("Invalid size - " + pizzaSize);
            price = 0;
        }

        System.out.println("$"+price);

    }
}
