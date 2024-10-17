package week11;

public class TestFoodObjects {
    public static void main(String[] args) {


        Food food1 = new Food();
        food1.name = "Tuna sandwich";
        food1.quantity = 3;
        food1.unitPrice = 7.99;
        food1.totalPrice = food1.quantity * food1.unitPrice;


        System.out.println(food1.name);
        System.out.println(food1.totalPrice);


        Food food2 = new Food("Pizza");

        // Taco, 4
        Food tacos = new Food("Taco", 4);

        //    Apples, 3, 0.99
        Food apples = new Food("Apples", 3, 0.99);

        System.out.println(food1);
        System.out.println(food2);
        System.out.println(tacos);
        System.out.println(apples);
        System.out.println("-----------------------------------------");

        Food bananas = new Food("Bananas", 5);
        bananas.unitPrice = 1.5;
        System.out.println(bananas.calculatePrice());
        System.out.println(bananas);

        Food eggs = new Food("Eggs", 10,0.25);
        Food eggs2 = new Food("Eggs", 20,0.80);
        buy(eggs);
        buy(eggs2);

    }

    /* method that accepts a food object
     Food food1 = new Food ("Eggs", 10, 0.25);
     buy (food1);
*/
    public static void buy(Food food) {
        System.out.println("Buying -> " + food);
    }


}
