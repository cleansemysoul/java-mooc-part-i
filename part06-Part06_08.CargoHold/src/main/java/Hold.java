
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
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> holding;

    public Hold(int weight) {
        this.maximumWeight = weight;
        this.holding = new ArrayList<Suitcase>();
    }

    public int weightOfSuitcasses() {
        int i = 0;
        for (Suitcase suitcase : holding) {
            i += suitcase.totalWeight();
        }
        return i;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (weightOfSuitcasses() + suitcase.totalWeight() <= this.maximumWeight) {
            holding.add(suitcase);
        }
    }

    public String toString() {
        if (holding.isEmpty()) {
            return "no items (0kg)";
        } else if (holding.size() == 1) {
            return "1 suitcase (" + weightOfSuitcasses() + " kg)";
        } else {
            return holding.size() + " suitcases (" + weightOfSuitcasses() + " kg)";
        }
    }

    public void printItems() {
        for (Suitcase suitcase : holding) {
            suitcase.printItems();
        }
    }
}
