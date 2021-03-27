
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int spaces = size - 1;
        int stars = 1;

        while (spaces >= 0) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int spaces = height - 1;
        int stars = 1;

        while (spaces >= 0) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars += 2;
        }
        spaces = height - 2;
        stars = 3;
        printSpaces(spaces);
        printStars(stars);
        printSpaces(spaces);
        printStars(stars);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(15);
    }
}
