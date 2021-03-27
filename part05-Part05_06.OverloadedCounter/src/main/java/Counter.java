/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int number) {
        if (number > 0) {
            this.value += number;
        }
    }

    public void decrease() {
        this.value--;
    }

    public void decrease(int number) {
        if (number > 0) {
            this.value -= number;
        }
    }

}
