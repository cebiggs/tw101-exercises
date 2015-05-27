package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by cannon on 5/25/15.
 */
public class Orc implements Monster {

    private int hitpoints;

    public Orc() {
        hitpoints = 20;
    }

    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    @Override
    public String name() {
        return "Orc";
    }

    @Override
    public int currentHitpoints() {
        return hitpoints;
    }
}
