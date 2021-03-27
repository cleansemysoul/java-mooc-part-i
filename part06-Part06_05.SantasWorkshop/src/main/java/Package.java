
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
public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        if (gifts.isEmpty()) {
            return 0;
        }

        int sumOfWeight = 0;
        for (Gift gift : gifts) {
            sumOfWeight += gift.getWeight();
        }
        
        return sumOfWeight;
    }
}
