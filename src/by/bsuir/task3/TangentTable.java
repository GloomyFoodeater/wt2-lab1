package by.bsuir.task3;

import static java.lang.Math.*;

public class TangentTable {
    private final double[][] content;

    /*
     * Calculate 2D table
     * 1st row - arguments from [a, b] with step h
     * 2nd row - their tangents
     */
    public TangentTable(double a, double b, double h) {
        int count = (int) ((b - a) / h) + 1;    // Since interval is includes b, therefore "+1"
        content = new double[2][count];
        for (int i = 0; i < count; i++) {
            double x = a + h * i;
            content[0][i] = x;
            content[1][i] = tan(x);
        }
    }

    public void print() {
        for (int i = 0; i < content[0].length; i++) {
            System.out.printf("|%7.3f | %+11.8f |%n", content[0][i], content[1][i]);
        }
    }
}