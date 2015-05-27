package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by cannon on 5/25/15.
 */
public interface Monster {

    void takeDamage(int amount);
    String name();
    int currentHitpoints();
}
