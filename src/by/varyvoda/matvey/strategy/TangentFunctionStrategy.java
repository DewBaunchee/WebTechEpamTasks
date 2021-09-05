package by.varyvoda.matvey.strategy;

import by.varyvoda.matvey.utils.InputUtils;

import java.util.Scanner;

public class TangentFunctionStrategy implements TaskStrategy{

    private final Scanner in;

    public TangentFunctionStrategy(Scanner in) {
        this.in = in;
    }

    @Override
    public void algorithm() {
        double a = InputUtils.enterDouble(in, "a");
        double b = InputUtils.enterDouble(in, "b");
        double h = InputUtils.enterDouble(in, "h");

        for(double x = a; x <= b; x += h) {
            System.out.printf("F(%f): %f\n", x, F(x));
        }
    }

    private double F(double x) {
        return Math.tan(x);
    }

    @Override
    public String description() {
        return "Evaluate F(x) = tg(x) on the segment [a, b] with step h.";
    }
}
