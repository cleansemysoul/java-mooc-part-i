
import java.util.ArrayList;
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
    private BirdCollection birds;

    public UserInterface(Scanner scanner, BirdCollection birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String input = scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            } else if (input.equals("Add")) {
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String traduction = scanner.nextLine();
                birds.addBird(new Bird(name, traduction));
            } else if (input.equals("Observation")) {
                System.out.println("Bird?");
                String toObserve = scanner.nextLine();
                birds.addObservationFromCollection(toObserve);
            } else if (input.equals("One")) {
                System.out.println("Bird?");
                String search = scanner.nextLine();
                birds.printBird(search);
            } else if (input.equals("All")) {
                birds.printAll();
            }
        }
    }
}
