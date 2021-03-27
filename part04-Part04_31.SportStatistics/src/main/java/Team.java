/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Team {

    private String name;
    private int win;
    private int loss;

    public Team(String name) {
        this.name = name;
        win = 0;
        loss = 0;
    }

    public String getName() {
        return name;
    }

    public int getGames() {
        return (win + loss);
    }

    public int getWins() {
        return win;
    }

    public int getLosses() {
        return loss;
    }

    public void addWin() {
        win++;
    }

    public void addLoss() {
        loss++;
    }
}
