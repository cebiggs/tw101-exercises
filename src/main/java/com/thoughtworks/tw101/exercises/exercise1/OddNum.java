package com.thoughtworks.tw101.exercises.exercise1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cannon on 6/8/15.
 */
public class OddNum {

    private List<Integer> oddNumList;
    private PrintStream printStream;

    public OddNum(int startValue, int endValue, PrintStream printStream) {
        this.printStream = printStream;
        oddNumList = new ArrayList<Integer>();
        createOddNumList(startValue, endValue);
    }

    private void createOddNumList(int startValue, int endValue) {
        for (int i = startValue; i <= endValue; i++) {
            if (i % 2 == 1) {
                oddNumList.add(i);
            }
        }
    }

    public void printOddNumListAndSum() {
        String oddNumString = "";
        int sum = 0;

        for (int i = 0; i < oddNumList.size(); i++) {

            oddNumString = oddNumString.concat(Integer.toString(oddNumList.get(i)));
            sum += oddNumList.get(i);

            if (!(i == oddNumList.size() - 1)) {
                oddNumString = oddNumString.concat(" ");
            }
        }
        printStream.println(oddNumString);
        printStream.println(sum);
    }
}

