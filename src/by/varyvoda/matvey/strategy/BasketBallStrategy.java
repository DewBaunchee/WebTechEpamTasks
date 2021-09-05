package by.varyvoda.matvey.strategy;

import by.varyvoda.matvey.entity.Basket;
import by.varyvoda.matvey.entity.Color;
import by.varyvoda.matvey.utils.InputUtils;

import java.util.Scanner;

public class BasketBallStrategy implements TaskStrategy {

    private final Scanner in;

    public BasketBallStrategy(Scanner in) {
        this.in = in;
    }

    @Override
    public void algorithm() {
        Basket basket = new Basket();
        while(InputUtils
                .enterString(in, "'y' if you want to add ball")
                .toLowerCase()
                .charAt(0) == 'y')  {

            basket.addBall(InputUtils.enterBall(in));
            System.out.println(basket + "\n");
        }

        System.out.println("Weight of balls: " + basket.getBallsWeight());
        System.out.println("Blue balls: " + basket.getByColor(Color.BLUE));
    }

    @Override
    public String description() {
        return "Fill basket with balls.";
    }
}
