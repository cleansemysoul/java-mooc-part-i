/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Fitbyte {

    private int resting;
    private int age;

    public Fitbyte(int age, int resting) {
        this.resting = resting;
        this.age = age;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maxHeartRate = 206.3 - (0.711 * age);
        return ((maxHeartRate - resting) * percentageOfMaximum + resting);
    }

}
