package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    public static int numOfCalls = 0;

    public void increment() {
        numOfCalls++;
    }

    public void total() {
        System.out.print(numOfCalls);
    }
}
