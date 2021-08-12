package com.leetcode.dp;

import com.leetcode.dp.memoization.DynamicProgrammingMemo;
import com.leetcode.dp.tabulation.DynamicProgrammingTab;

public class Application {

    public static void main(String[] args) {
        DynamicProgrammingMemo dpm = new DynamicProgrammingMemo();
        DynamicProgrammingTab dpt = new DynamicProgrammingTab();

        System.out.println(dpm.fibonacci(30));
        System.out.println(dpt.fibonacci(30));

        int [][] grid = {
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18}
        };

        System.out.println(dpm.gridTraveler(grid.length, grid[0].length));
        System.out.println(dpt.gridTraveler(grid.length, grid[0].length));
    }
}
