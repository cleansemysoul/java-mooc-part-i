
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] individual = text.split(" ");
            for (int i = 0; i < individual.length; i++) {
                System.out.println(individual[i]);
            }
        }
    }
}
