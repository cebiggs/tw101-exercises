package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        OddNum oddNum = new OddNum(1, 100, System.out);
        oddNum.printOddNumListAndSum();
    }
}
