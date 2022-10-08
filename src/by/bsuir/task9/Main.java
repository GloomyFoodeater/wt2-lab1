package by.bsuir.task9;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Ball(10.05, Color.RED));
        basket.add(new Ball(21.1, Color.BLUE));
        basket.add(new Ball(22.2, Color.BLUE));
        basket.add(new Ball(1.043, Color.RED));
        basket.add(new Ball(30.4, Color.GREEN));
        basket.add(new Ball(2.1, Color.BLUE));
        basket.add(new Ball(3.7, Color.GREEN));
        basket.add(new Ball(6.4, Color.RED));

        System.out.printf("Weight of the basket: %.3f%n", basket.calculateWeight());
        System.out.println("Number of blue balls: " + basket.countBlue());

    }
}
