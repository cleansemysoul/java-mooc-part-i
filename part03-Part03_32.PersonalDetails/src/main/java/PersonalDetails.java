
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int nameLength = 0;
        int longest = 0;
        int age = 0;
        int sum = 0;
        int i = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            nameLength = parts[0].length();
            age = Integer.valueOf(parts[1]);
            if(nameLength > longest){
                name = parts[0];
                longest = nameLength;
            }
            sum += age;
            i++;
        }
        double result = (double) sum / i;
        System.out.println("Longest of the oldest: " + name);
        System.out.println("Average of the birth years: " + result);

    }
}
