package by.bsuir.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, h;

        // Input of [a, b] and h
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        System.out.print("Enter h: ");
        h = scanner.nextDouble();

        TangentTable table = new TangentTable(a, b, h);
        table.print();
    }
}
