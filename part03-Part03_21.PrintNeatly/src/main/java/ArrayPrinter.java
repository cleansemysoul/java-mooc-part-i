
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int i = 0;
        while (i < array.length) {
            int number = array[i];
            if (i == array.length - 1) {
                System.out.print(number);
                break;
            }
            System.out.print(number);
            System.out.print(", ");
            i++;
        }
        return;
    }
}
