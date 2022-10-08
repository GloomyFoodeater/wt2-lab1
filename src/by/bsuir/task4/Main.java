package by.bsuir.task4;

import java.util.Scanner;

import static by.bsuir.util.Arrays.printArray;
import static by.bsuir.util.Arrays.randomizeArray;
import static by.bsuir.util.Math.isPrime;

public class Main {
    public static void main(String[] args) {

        // Input N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        // Fill array
        int[] numbers = new int[n];
        randomizeArray(numbers, 2, 200);
        printArray(numbers, "Numbers: ");

        // Calculations
        System.out.print("Prime numbers indexes: ");
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(i + " ");
            }
        }
    }
}
