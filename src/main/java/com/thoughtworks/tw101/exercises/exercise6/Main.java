package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// String name(), and int currentHitpoints() methods. Store instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the name and current hit points of all monsters.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Orc orc = new Orc();
        Troll troll = new Troll();
        ArrayList<Monster> monsterList = new ArrayList<Monster>();

        monsterList.add(orc);
        monsterList.add(troll);

        for ( Monster monster : monsterList ) {
            monster.takeDamage(10);
        }

        for ( Monster monster : monsterList ) {
            System.out.print(monster.name() + " ");
            System.out.println(monster.currentHitpoints());
        }
    }
}
