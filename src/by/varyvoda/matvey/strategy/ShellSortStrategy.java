package by.varyvoda.matvey.strategy;

import by.varyvoda.matvey.utils.InputUtils;
import by.varyvoda.matvey.utils.SortUtils;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSortStrategy implements TaskStrategy {

    private final Scanner in;

    public ShellSortStrategy(Scanner in) {
        this.in = in;
    }

    @Override
    public void algorithm() {
        int[] numbers = InputUtils.inputIntArray(in);
        System.out.println("Result: " + Arrays.toString(SortUtils.shellSort(numbers)));
    }

    @Override
    public String description() {
        return "Shell sort.";
    }
}

/*
7
10
10
9
8
7
6
5
4
3
2
1

* */