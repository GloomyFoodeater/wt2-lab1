package by.bsuir.task8;

import java.util.Scanner;

import static by.bsuir.util.Arrays.*;

public class Main {
    private static int[] getIndexes(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0;      // Index of a
        int j = 0;      // Index of b
        int[] indexes = new int[m];

        for (int k = 0; k < n + m; k++) {
            if (j == m || i < n && a[i] <= b[j]) {
                i++;
            } else {
                indexes[j] = k;
                j++;
            }
        }
        return indexes;
    }

    public static void main(String[] args) {

        // Input n and m
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();


        // Fill arrays
        int[] a = new int[n];
        randomizeArray(a, 0, 100);
        shellSort(a);
        printArray(a, "an: ");
        int[] b = new int[m];
        randomizeArray(b, 0, 100);
        shellSort(b);
        printArray(b, "bn: ");

        // Calculate
        printArray(getIndexes(a, b), "Indexes: ");

    }
}
