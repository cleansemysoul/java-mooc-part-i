
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {

        int i = array[0];
        for (int e : array) {
            if (e < i) {
                i = e;
            }
        }
        return i;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallestIndex = 0;
        int smallest = array[0];
        for (int e : array) {
            if (e < smallest) {
                smallest = e;
                smallestIndex = index;
            }
            index++;
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int number) {
        int min = array[number];
        int index = 0;
        for (int i = number; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
