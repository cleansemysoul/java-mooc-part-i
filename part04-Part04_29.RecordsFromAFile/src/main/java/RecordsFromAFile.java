
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try ( Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String row = file.nextLine();
                String[] parts = row.split(",");
                System.out.println(parts[0] + ", age : " + parts[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
