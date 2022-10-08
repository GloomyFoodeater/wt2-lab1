package by.bsuir.task7;

import java.util.Scanner;

import static by.bsuir.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        // Input N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        // Fill array
        int[] array = new int[n];
        randomizeArray(array, 2, 200);
        printArray(array, "Shuffled: ");

        // Sort array
        shellSort(array);
        printArray(array, "Sorted: ");
    }
}

