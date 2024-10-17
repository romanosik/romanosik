package week03;
/*
ParkingLot[Arithmetic, Unary, shorthand operators]
    declare integer variable cars,
    practice unary and shorthand operators,
 */
public class ParkingLot {
    public static void main(String[] args) {
        System.out.println("--------Welcome to Walmart!--------");
        int cars = 0;

        System.out.println("1 car just parked");
        cars++;

        System.out.println("cars in parking lot = " + cars);

        System.out.println("2 more cars parked");
        //cars++; cars++;
        //cars = cars + 2;
        cars += 2;
        System.out.println("cars in parking lot = " + cars);

        //pre-increment
        System.out.println("Another car parked " + ++cars);

        //post-increment
        System.out.println("One more car parked " + cars++);//4

        System.out.println("current cars = " + cars);//5

        System.out.println("3 cars left parking");
        cars -= 3; //cars--; cars--; cars--;

        System.out.println("Cars in parking = " + cars);

        System.out.println("5 times more cars just parked");
        cars *= 5;
        cars = cars * 5;
        System.out.println("Cars in parking = " + cars);

    }
}
