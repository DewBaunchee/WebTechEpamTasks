package by.varyvoda.matvey.strategy;

import by.varyvoda.matvey.utils.InputUtils;

import java.util.Scanner;

public class AscendingSubsequenceStrategy implements TaskStrategy {

    private final Scanner in;

    public AscendingSubsequenceStrategy(Scanner in) {
        this.in = in;
    }

    @Override
    public void algorithm() {
        int[] sequence = InputUtils.inputIntArray(in);
        System.out.println("Result: " + (sequence.length - getAscendingGroupSize(sequence, 0, Integer.MAX_VALUE)));
    }

    private int getAscendingGroupSize(int[] sequence, int start, int limit) {
        int currentAscendingGroupSize = 1;

        for (int i = start + 1; i < sequence.length; i++) {
            if (sequence[i] < limit) {
                if (sequence[i] > sequence[i - 1]) {
                    currentAscendingGroupSize++;
                } else {
                    int nextAscendingGroupSize = getAscendingGroupSize(sequence, i, sequence[i - 1]);
                    if (nextAscendingGroupSize > currentAscendingGroupSize)
                        currentAscendingGroupSize = nextAscendingGroupSize;
                }
            } else {
                return currentAscendingGroupSize;
            }
        }
        return currentAscendingGroupSize;
    }

    @Override
    public String description() {
        return "Find minimal amount of numbers, which should be removed to take an ascending subsequence from array.";
    }
}

/*
5
11
1
2
3
4
3
2
5
4
6
7
8

*/