package by.varyvoda.matvey.strategy;

import by.varyvoda.matvey.utils.InputUtils;

import java.util.Scanner;

public class SequencesMergeStrategy implements TaskStrategy {

    private final Scanner in;

    public SequencesMergeStrategy(Scanner in) {
        this.in = in;
    }

    @Override
    public void algorithm() {
        int[] firstSequence = InputUtils.inputIntArray(in);
        int[] secondSequence = InputUtils.inputIntArray(in);

        int[] insertIndexes = new int[firstSequence.length];
        int firstSequenceIndex = 0;
        int secondSequenceIndex = 0;
        while (secondSequenceIndex < secondSequence.length && firstSequenceIndex < firstSequence.length) {
            if (secondSequence[secondSequenceIndex] > firstSequence[firstSequenceIndex]) {
                insertIndexes[firstSequenceIndex++] = secondSequenceIndex;
            } else {
                secondSequenceIndex++;
            }
        }
        while (firstSequenceIndex < firstSequence.length) {
            insertIndexes[firstSequenceIndex++] = secondSequence.length;
        }

        System.out.println("Result (insert before): ");
        for(int i = 0; i < insertIndexes.length; i++) {
            System.out.printf("[%d]: %d -> [%d]\n", i, firstSequence[i], insertIndexes[i]);
        }
    }

    @Override
    public String description() {
        return "Merge two ascending sequence into one.";
    }
}

/*
8
4
0
1
4
8
5
2
3
5
6
7

 */