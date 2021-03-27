
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        while (true) {
            if (firstContainer > 100) {
                firstContainer = 100;
            } else if (firstContainer < 0) {
                firstContainer = 0;
            }
            if (secondContainer > 100) {
                secondContainer = 100;
            } else if (secondContainer < 0) {
                secondContainer = 0;
            }
            System.out.println("First:" + firstContainer + "/100");
            System.out.println("Second:" + secondContainer + "/100");

            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int value = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                if (value > 0) {
                    firstContainer += value;
                    if (firstContainer > 100) {
                        firstContainer = 100;
                    }
                }
            }
            if (parts[0].equals("remove")) {
                secondContainer -= value;
                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }
            if (parts[0].equals("move")) {
                if (firstContainer - value < 0) {
                    int newValue = firstContainer;
                    firstContainer = 0;
                    secondContainer += newValue;
                    continue;
                }
                firstContainer -= value;
                secondContainer += value;
            }
        }
    }

}
