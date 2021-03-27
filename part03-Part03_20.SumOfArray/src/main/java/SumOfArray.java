
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {8, 125, 985, 1023};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int i = 0;
        int sum = 0;
        while (i < array.length) {
            int number = array[i];
            sum += number;
            i++;
        }
        return sum;
    }
}
