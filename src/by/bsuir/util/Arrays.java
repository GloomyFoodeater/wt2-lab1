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

}
