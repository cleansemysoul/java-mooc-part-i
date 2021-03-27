
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void printByName(String name) {
        if (this.recipes.isEmpty()) {
            System.out.println("Not found");
        }
        for (Recipe e : this.recipes) {
            if (e.getName().contains(name)) {
                System.out.println(e);
            }
        }
    }

    public void printByTime(String time) {
        if (this.recipes.isEmpty()) {
            System.out.println("Not found");
        }
        for (Recipe e : this.recipes) {
            if (e.getTime() <= Integer.valueOf(time)) {
                System.out.println(e);
            }
        }
    }

    public void printByIngredient(String ingredient) {
        if (this.recipes.isEmpty()) {
            System.out.println("Not found");
        }

        for (Recipe e : this.recipes) {
            if (e.getIngredients().contains(ingredient)) {
                System.out.println(e);
            }
        }
    }

    public void printRecipeBook() {
        for (Recipe e : recipes) {
            System.out.println(e);
        }
    }
}
