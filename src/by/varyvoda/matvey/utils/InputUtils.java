package by.varyvoda.matvey.utils;

import by.varyvoda.matvey.entity.Ball;
import by.varyvoda.matvey.entity.Color;

import java.util.Arrays;
import java.util.Scanner;

public class InputUtils {

    public static Ball enterBall(Scanner in) {
        int weight = enterInt(in, "weight");
        Color color = Color.valueOf(
                enterString(in, "color " + Arrays.toString(Color.values())).trim().toUpperCase()
        );
        return new Ball(weight, color);
    }

    public static String enterString(Scanner in, String name ) {
        System.out.println("Enter " + name + ":");
        return in.nextLine();
    }

    public static int enterInt(Scanner in, String name) {
        System.out.println("Enter " + name + ": ");
        return Integer.parseInt(in.nextLine());
    }

    public static double enterDouble(Scanner in, String name) {
        System.out.println("Enter " + name + ": ");
        return Double.parseDouble(in.nextLine());
    }

    public static int[] inputIntArray(Scanner in) {
        int n = enterInt(in, "n");

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++)
            numbers[i] = enterInt(in, String.format("%d/%d", i + 1, n));
        return numbers;
    }
}
