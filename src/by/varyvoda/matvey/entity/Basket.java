package by.varyvoda.matvey.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {

    private final List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public void addBalls(List<Ball> balls) {
        this.balls.addAll(balls);
    }

    public List<Ball> getByColor(Color color) {
        return balls.stream()
                .filter(ball -> ball.getColor() == color)
                .collect(Collectors.toList());
    }

    public int getBallsWeight(){
        return balls.stream()
                .mapToInt(Ball::getWeight)
                .sum();
    }

    public String toString() {
        return "Basket(" + balls + ")";
    }
}
