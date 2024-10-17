package week07.custom_classes;

public class RecipeTest {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.name = "Pizza";
        recipe.ingredients = "dough, cheese, tomato sauce";
        recipe.servingSize = 4;
        recipe.cost = 20;

        System.out.println(recipe.costPerPerson());
        System.out.println(recipe);

    }
}
