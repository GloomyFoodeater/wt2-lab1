package by.bsuir.task1;

import java.util.Scanner;

import static by.bsuir.util.Math.sqr;
import static java.lang.Math.abs;
import static java.lang.Math.sin;

public class Main {

    // Calculate expression of the 1st task
    private static double calculate(double x, double y) {
        double dividend = 1 + sqr(sin(x + y));
        double divisor = 2 + abs(x - 2 * x / (1 + sqr(x * y)));
        return dividend / divisor + x;
    }

    public static void main(String[] args) {

        // Input of x and y
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        // Calculation and output
        System.out.println("Result: " + calculate(x, y));

    }
}
