package by.bsuir.util;

import java.util.Arrays;

public class Math {

    // Square of real value
    public static double sqr(double x) {
        return x * x;
    }

    // Check if integer is prime
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= java.lang.Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Calculates length of the longest increasing subsequence
     */
    public static int getLisLength(int[] numbers) {

        if (numbers.length == 1) {
            return 1;
        }

        // Lengths of the longest subsequence before the element, if it is in the sequence
        int[] lengths = new int[numbers.length];
        java.util.Arrays.fill(lengths, 1);

        for (int j = 1; j < numbers.length; j++) {
            for (int k = 0; k < j; k++) {
                if (numbers[j] > numbers[k]) {
                    if (lengths[j] <= lengths[k]) {
                        lengths[j] = lengths[k] + 1;
                    }
                }
            }
        }

        //noinspection OptionalGetWithoutIsPresent
        return Arrays.stream(lengths).max().getAsInt();
    }
}

