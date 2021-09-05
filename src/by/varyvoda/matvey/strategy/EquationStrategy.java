package by.varyvoda.matvey.strategy;

import by.varyvoda.matvey.utils.InputUtils;

import java.util.Scanner;

public class EquationStrategy implements TaskStrategy {

    private final Scanner in;

    public EquationStrategy(Scanner in) {
        this.in = in;
    }

    @Override
    public void algorithm() {
        double x = InputUtils.enterDouble(in, "x");
        double y = InputUtils.enterDouble(in, "y");

        double result = x + (1 + Math.pow(Math.sin(x + y), 2)
        ) / (2 + Math.abs(x -
                (
                        2 * x
                ) / (
                        1 + Math.pow(x * y, 2))
        )
        );
        System.out.println("Result: " + result);
    }

    @Override
    public String description() {
        return "Evaluate an expression: x + (1 + sin^2(x + y))/(2 + |x - (2x)/(1 + x^2y^2)|)";
    }
}
