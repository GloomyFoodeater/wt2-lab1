package by.bsuir.util;

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
}

