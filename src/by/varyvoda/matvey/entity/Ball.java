package by.varyvoda.matvey.entity;

public class Ball {

    private final int weight;
    private final Color color;

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public String toString() {
        return "Ball(weight: " + weight + ", color: " + color + ")";
    }
}
