package by.bsuir.task6;

import java.util.Scanner;

import static by.bsuir.util.Arrays.*;

public class Main {
    private static int[][] getShiftedMatrix(int[] array) {
        int n = array.length;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = array[(j + i) % n];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        // Input N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        // Fill array
        int[] array = new int[n];
        randomizeArray(array, 2, 200);
        printArray(array, "Array: ");

        // Calculation & output
        printMatrix(getShiftedMatrix(array));
    }
}
