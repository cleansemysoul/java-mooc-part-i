
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

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        boolean loop = true;
        while (loop) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            command(input);
        }
    }

    public void command(String command) {
        if (command.equals("add")) {
            add();
        }
        if (command.equals("list")) {
            list();
        }
        if (command.equals("remove")) {
            remove();
        }
    }

    public void add() {
        System.out.println("To add:");
        String task = scanner.nextLine();
        list.add(task);
    }

    public void list() {
        list.print();
    }

    public void remove() {
        System.out.println("Wich one is removed?");
        int number = Integer.valueOf(scanner.nextLine());
        list.remove(number);
    }
}
