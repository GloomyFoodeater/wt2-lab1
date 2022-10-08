package by.bsuir.task2;

import java.util.Scanner;

public class Main {

    private static boolean isInArea(double x, double y) {
        double maxY = (-4 <= x && x <= 4) ? 5 : 0;
        return (-6 <= x && x <= 6)
                && (-3 <= y && y <= maxY);
    }

    public static void main(String[] args) {

        // Input of x and y
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        // Calculation and output
        System.out.println(isInArea(x, y));

    }
}
