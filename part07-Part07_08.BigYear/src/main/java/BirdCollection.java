
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
public class BirdCollection {

    private ArrayList<Bird> birds;

    public BirdCollection() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void addObservation(String bird) {
        this.addObservation(bird);
    }

    public void printAll() {
        for (Bird e : birds) {
            System.out.println(e);
        }
    }

    public void printBird(String name) {
        for (Bird e : birds) {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println(e);
            }
        }
    }

    public void addObservationFromCollection(String name) {
        for (Bird e : birds) {
            if (e.getName().equalsIgnoreCase(name)) {
                e.addObservation();
            }
        }
    }

}
