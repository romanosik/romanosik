package week07.custom_classes;

/*
Instance variables:
    name, double version, isFree

Instance methods:
    run()
        name is running
    update()
        name is updating
        version add 1.1 to it
    toString()
        generate
 */

public class App {
    public String name;
    public double version;
    public boolean isFree;

    public void run() {
        System.out.println(name +" is running");
    }

    public void update() {
        System.out.println(name + " is updating");
        version += 1.1;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", isFree=" + isFree +
                '}';
    }
}
