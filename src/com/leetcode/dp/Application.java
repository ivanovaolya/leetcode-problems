package com.leetcode.dp;

import com.leetcode.dp.memoization.DynamicProgrammingMemo;
import com.leetcode.dp.tabulation.DynamicProgrammingTab;

public class Application {

    public static void main(String[] args) {
        DynamicProgrammingMemo dpm = new DynamicProgrammingMemo();
        DynamicProgrammingTab dpt = new DynamicProgrammingTab();

        System.out.println(dpm.fibonacci(30));
        System.out.println(dpt.fibonacci(30));
    }
}
