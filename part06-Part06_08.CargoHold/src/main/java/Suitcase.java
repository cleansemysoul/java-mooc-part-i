
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int weight;

    public Suitcase(int weight) {
        this.weight = weight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item.getWeight() <= this.weight) {
            items.add(item);
            this.weight -= item.getWeight();
        }
    }

    public String toString() {
        int sumOfWeight = 0;
        for (Item item : items) {
            sumOfWeight += item.getWeight();
        }

        if (items.isEmpty()) {
            return "no items (0kg)";
        } else if (items.size() == 1) {
            return "1 item (" + sumOfWeight + " kg)";
        } else {
            return items.size() + " items (" + sumOfWeight + " kg)";
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        int heaviest = 0;
        if (!(items.size() == 0)) {
            Item heavy = items.get(0);
            for (Item item : items) {
                if (item.getWeight() > heaviest) {
                    heaviest = item.getWeight();
                    heavy = item;
                }
            }
            return heavy;
        }
        return null;
    }

    public int totalWeight() {
        int sumOfWeight = 0;
        for (Item item : items) {
            sumOfWeight += item.getWeight();
        }
        return sumOfWeight;
    }
}
