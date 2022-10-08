package by.bsuir.task5;

import java.util.Scanner;

import static by.bsuir.util.Arrays.printArray;
import static by.bsuir.util.Arrays.randomizeArray;
import static by.bsuir.util.Math.getLisLength;

public class Main {
    public static void main(String[] args) {

        // Input N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        // Fill array
        int[] numbers = new int[n];
        randomizeArray(numbers, 2, 200);
        printArray(numbers, "Sequence: ");

        // Calculate & output
        int k = n - getLisLength(numbers);
        System.out.println("K: " + k);
    }
}
