package by.bsuir.util;

import java.util.Random;

public class Arrays {
    public static void printArray(int[] array, String text) {
        int n = array.length;
        System.out.print(text + "[");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        if (n > 0) {
            System.out.print(array[n - 1]);
        }
        System.out.println("]");
    }

    public static void randomizeArray(int[] numbers, int start, int bound) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(bound) + start;
        }
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        System.out.println("Matrix:");
        for (int[] ints : matrix) {
            System.out.print("|");
            for (int j = 0; j < n - 1; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.print(ints[n - 1]);
            System.out.println("|");
        }
    }

    public static void shellSort(int[] array) {
        int n = array.length;

        // Iteration over steps (N/2, N/4, N/8, ..., 1)
        for (int step = n / 2; step > 0; step /= 2) {

            // Insertion sort
            for (int i = step; i < n; i++) {
                int key = array[i];
                int j = i;
                while (j >= step && array[j - step] > key) {
                    array[j] = array[j - step];
                    j -= step;
                }
                array[j] = key;
            }
        }
    }
}
