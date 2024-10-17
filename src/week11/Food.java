package week11;

public class Food {

    public String name;
    public int quantity;
    public double unitPrice;
    public double totalPrice;

    public Food() {
        System.out.println("Food no-args ");
    }

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        // this.name = name;
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.quantity = quantity;
        calculatePrice();
    }

    public double calculatePrice() {
        totalPrice = quantity * unitPrice;
        return totalPrice;
    }

    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
