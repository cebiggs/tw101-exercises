package com.thoughtworks.tw101.exercises.exercise2;

import java.io.PrintStream;

public class Accumulator {

    public static int numOfCalls = 0;
    private PrintStream printStream;

    public Accumulator(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void increment() {
        numOfCalls++;
    }

    public void total() {
        printStream.print(numOfCalls);
    }
}
