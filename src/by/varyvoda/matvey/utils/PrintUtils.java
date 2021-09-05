package by.varyvoda.matvey.utils;

import java.util.Arrays;

public class PrintUtils {

    public static void printIntMatrix(int[][] matrix) {
        if(matrix.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for(int i = 0; i < matrix.length - 1; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println(Arrays.toString(matrix[matrix.length - 1]) + "]");
    }
}
