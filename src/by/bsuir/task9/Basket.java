package by.bsuir.task9;

import java.util.ArrayList;

public class Basket extends ArrayList<Ball> {
    public double calculateWeight() {
        double sum = 0;
        for (Ball ball : this) {
            sum += ball.getWeight();
        }
        return sum;
    }

    public int countBlue() {
        int counter = 0;
        for (Ball ball : this) {
            if (ball.getColor() == Color.BLUE) {
                counter++;
            }
        }
        return counter;
    }
}