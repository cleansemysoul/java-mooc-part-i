
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {8, 5, 24, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            for (int a = 0; a < number; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
