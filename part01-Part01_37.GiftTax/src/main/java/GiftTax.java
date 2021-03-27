
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int number = Integer.valueOf(scan.nextLine());
        if (number < 5000) {
            System.out.println("No tax!");
        } else if (number < 25000) {
            System.out.println("Tax: " + (double) (100 + ((number - 5000)* 0.08)));
        } else if (number < 55000) {
            System.out.println("Tax: " + (double) (1700 + ((number - 25000) * 0.10)));
        } else if (number < 200000) {
            System.out.println("Tax: " + (double) (4700 + ((number - 55000) * 0.12)));
        } else if (number < 1000000) {
            System.out.println("Tax: " + (double) (22100 + ((number - 200000) * 0.15)));
        } else {
            System.out.println("Tax: " + (double) (142100 + ((number - 1000000) * 0.17)));
        }
    }
}
