
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class UserInterface {

    private Scanner scanner;
    private Grade grade;

    public UserInterface(Scanner scanner, Grade grade) {
        this.scanner = scanner;
        this.grade = grade;
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops;");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            grade.addGrade(input);
        }
        System.out.println(grade.average());
        System.out.println(grade.averageOfPassing());
        System.out.println(grade.pass());
        grade.gradeDistribution();

    }
}
