package by.varyvoda.matvey.strategy;

import by.varyvoda.matvey.utils.InputUtils;

import java.util.Scanner;

public class CoordinatesValidatingStrategy implements TaskStrategy{

    private final Scanner in;

    public CoordinatesValidatingStrategy(Scanner in) {
        this.in = in;
    }

    @Override
    public void algorithm() {
        double x = InputUtils.enterDouble(in, "x");
        double y = InputUtils.enterDouble(in, "y");

        boolean result = y > 0 ?
                y < 5 && Math.abs(x) < 4
                : y > -3 && Math.abs(x) < 6;
        System.out.println("Result: " + result);
    }

    @Override
    public String description() {
        return "Check that point lies in predefined area.";
    }
}
