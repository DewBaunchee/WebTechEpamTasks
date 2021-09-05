package by.varyvoda.matvey.strategy;

import by.varyvoda.matvey.utils.InputUtils;
import by.varyvoda.matvey.utils.PrintUtils;

import java.util.Scanner;

public class ArrayToMatrixStrategy implements TaskStrategy {

    private final Scanner in;

    public ArrayToMatrixStrategy(Scanner in) {
        this.in = in;
    }

    @Override
    public void algorithm() {
        int[] numbers = InputUtils.inputIntArray(in);
        int[][] matrix = new int[numbers.length][numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            for(int j =  0; j < numbers.length; j++) {
                matrix[i][j] = numbers[(i + j) % matrix.length];
            }
        }
        System.out.println("Result: ");
        PrintUtils.printIntMatrix(matrix);
    }

    @Override
    public String description() {
        return "Convert array into square matrix.";
    }
}
/*
6
10
1
2
3
4
5
6
7
8
9
10

*/