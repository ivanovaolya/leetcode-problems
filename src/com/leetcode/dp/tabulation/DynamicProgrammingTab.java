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
}
