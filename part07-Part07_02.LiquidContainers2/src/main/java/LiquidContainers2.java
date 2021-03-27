
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second:" + second);

            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int value = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                if (value > 0) {
                    first.add(value);
                }
            }
            if (parts[0].equals("remove")) {
                second.remove(value);
            }
            if (parts[0].equals("move")) {
                if (first.contains() - value < 0) {
                    int newValue = first.contains();
                    first.remove(value);
                    second.add(newValue);
                    continue;
                }
                first.remove(value);
                second.add(value);
            }
        }
    }

}
