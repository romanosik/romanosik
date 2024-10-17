package week07.custom_classes;

public class Recipe {
    //instance variables/fields/attributes
    public String name;
    public String ingredients;
    public int servingSize;
    public double cost;

    //Instance Methods. Behaviour
    public double costPerPerson() {
        return cost / servingSize;
    }

    /*
    Recipe for $name will require these ingredients:
            $ingredients
    This dish will serve $servingSize and cost a total of $ $cost to make
     */

    public String toString() {
        return "Recipe for " + name +" will require these ingredients:\n"+
                "\t\t\t\t" + ingredients +"\n"+
                "This dish will serve "+servingSize+" people and cost a total of $" + cost +" to make";
    }
}
