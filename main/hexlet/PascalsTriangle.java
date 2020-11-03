package hexlet;

import java.util.Scanner;
import java.util.ArrayList;

public class PascalsTriangle {
    private static void buildPascalTriangleForFirstPositiveNumber(
            int rowNumbers) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>(rowNumbers);
        // allocate rows
        for (int i = 0; i < rowNumbers; i++) {
            int c = 1;
            ArrayList<Integer> row = new ArrayList<Integer>();
            // allocate elements
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    row.add(1);
                } else {
                    c = c * (i - j + 1) / j;
                    row.add(c);
                }
            }
            triangle.add(row);
        }
        for (int i = 0; i < rowNumbers; i++) {
            for (int j = 0; j <= i; ++j) {
                System.out.format("%4d", triangle.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n - number of rows in Pascal triangle: ");
        int n = in.nextInt();
        buildPascalTriangleForFirstPositiveNumber(n);
    }
}