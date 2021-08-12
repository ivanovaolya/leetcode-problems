package com.leetcode.dp.tabulation;

public class DynamicProgrammingTab {

    public int fibonacci(int n) {
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;

        for (int i = 2; i < table.length; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[table.length - 1];
    }

    public long gridTraveler(int x, int y) {
        long [][] matrix = new long[x + 1][y + 1];
        matrix[1][1] = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                long current = matrix[i][j];

                if (j + 1 < matrix[i].length) {
                    matrix[i][j + 1] += current;
                }
                if (i + 1 < matrix.length) {
                    matrix[i + 1][j] += current;
                }
            }
        }

        return matrix[x][y];
     }
}
