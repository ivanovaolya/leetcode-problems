package com.leetcode.dp.memoization;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgrammingMemo {

    public long fibonacci(int n) {
        Map<Integer, Long> memo = new HashMap<>();
        memo.put(0, 0L);
        memo.put(1, 1L);

        return fibonacci(n, memo);
    }

    private long fibonacci(int n, Map<Integer, Long> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long res = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        memo.put(n, res);

        return res;
    }
}
