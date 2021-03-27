
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String firstNameInput = scanner.nextLine();
        System.out.println("Enter password:");
        String nameInput = scanner.nextLine();
        if (firstNameInput.equals("alex") && nameInput.equals("sunshine")
                || firstNameInput.equals("emma") && nameInput.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
