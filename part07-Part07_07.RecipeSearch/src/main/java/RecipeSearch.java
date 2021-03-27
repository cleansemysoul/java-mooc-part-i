
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeList = new RecipeBook();
        System.out.println("File to read:");
        String fileName = scanner.nextLine();
        try ( Scanner fileScan = new Scanner(Paths.get(fileName))) {
            ArrayList<String> fileLines = new ArrayList<>();

            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                if (line.trim().isEmpty() || !fileScan.hasNextLine()) {
                    String name = fileLines.get(0);
                    int time = Integer.valueOf(fileLines.get(1));
                    ArrayList<String> ingredientList = new ArrayList<>();
                    for (int i = 2; i < fileLines.size(); i++) {
                        ingredientList.add(fileLines.get(i));
                    }
                    recipeList.addRecipe(new Recipe(name, time, ingredientList));
                    fileLines.removeAll(fileLines);
                } else {
                    fileLines.add(line);
                }

            }
            fileScan.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        UserInterface userInterface = new UserInterface(scanner, recipeList);
        userInterface.start();

    }

}
