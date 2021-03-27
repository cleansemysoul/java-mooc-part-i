/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Bird {

    private String name;
    private String traduction;
    private int observation;

    public Bird(String name, String traduction) {
        this.name = name;
        this.traduction = traduction;
        this.observation = 0;
    }

    public Bird(String name, String traduction, int observation) {
        this.name = name;
        this.traduction = traduction;
        this.observation = observation;
    }

    public String getName() {
        return this.name;
    }

    public void addObservation() {
        this.observation++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.traduction + "): " + this.observation + "observations";
    }
}
