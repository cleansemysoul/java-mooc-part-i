
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < lastNumber; i++) {
            sum += i;
        }
        sum += lastNumber;
        System.out.println(sum);
    }
}
