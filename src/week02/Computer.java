package week02;
/*
Computer [variables, datatypes, printing]

    create a class Computer
    create a main method

    declare these variables with a datatype that matches it:
        brand, processor, ram, storage, price, number of usb slots, has bluetooth, has wifi card

    assign some value to all the variables

    print all the variables
 */
public class Computer {
    public static void main(String[] args) {
        String brand = "Apple macbook";
        String processor = "m3";
        byte ram = 8;
        String storage = "512GB";
        double price = 1599.0;
        byte numberOfUsbSlots = 4;
        boolean hasBlueTooth = true;
        boolean hasWifiCard = true;

        System.out.println("My computer is " + brand);
        System.out.println("Processor is " + processor);
        //it has 8GB of RAM memory
        System.out.println("it has " + ram +"GB of RAM memory");
        System.out.println(storage + " SSD Storage");
        System.out.println("$" + price);

        //It has 4 USB slots and bluetooth is true and wifi is true
        System.out.println("it has " + numberOfUsbSlots + " USB slots and bluetooth is " + hasBlueTooth +" and wifi is " + hasWifiCard);
    }
}
