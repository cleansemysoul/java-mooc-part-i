
import java.nio.file.Paths;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class UserInterface {

    private Scanner scanner;
    private RecipeBook recipes;

    public UserInterface(Scanner scanner, RecipeBook recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stop the program");
        System.out.println("find name - search by name");
        System.out.println("find cooking time - seach by cooking time");
        System.out.println("find ingredient - search by ingredient");
        while (true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("list")) {
                System.out.println("Recipes:");
                recipes.printRecipeBook();
            } else if (input.equals("find name")) {
                System.out.println("Search name:");
                String search = scanner.nextLine();
                recipes.printByName(search);
            } else if (input.equals("find cooking time")) {
                System.out.println("Search time:");
                String search = scanner.nextLine();
                recipes.printByTime(search);
            } else if (input.equals("find ingredient")) {
                System.out.println("Search ingredient:");
                String search = scanner.nextLine();
                recipes.printByIngredient(search);
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
