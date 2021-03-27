/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Timer {

    private ClockHand hundredOfSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hundredOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredOfSeconds.advance();
        if (this.hundredOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return seconds + ":" + hundredOfSeconds;
    }
}
