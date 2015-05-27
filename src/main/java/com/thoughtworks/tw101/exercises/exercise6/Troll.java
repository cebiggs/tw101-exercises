package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by cannon on 5/25/15.
 */
public class Troll implements Monster {

    private int hitpoints;

    public Troll() {
        hitpoints = 40;
    }

    @Override
    public void takeDamage(int amount) {
        hitpoints -= (amount/2);
    }

    @Override
    public String name() {
        return "Troll";
    }

    @Override
    public int currentHitpoints() {
        return hitpoints;
    }
}
