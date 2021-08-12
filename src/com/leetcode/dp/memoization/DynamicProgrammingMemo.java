package com.leetcode.dp.memoization;

import com.leetcode.dp.memoization.data.Coordinate;

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

    /**
     * Given a 2-D matrix with M rows and N columns,
     * find the number of ways to reach cell with coordinates (i,j) from starting cell (0,0)
     * under the condition that you can only travel one step right or one step down.
     *
     * @param x destination X coordinate
     * @param y destination Y coordinate
     *
     * @return number of ways
     */
    public long gridTraveler(int x, int y) {
        Map<Coordinate, Long> memo = new HashMap<>();

        return gridTraveler(x, y, memo);
    }

    private long gridTraveler(int x, int y, Map<Coordinate, Long> cache) {
        if (x == 1 && y == 1) {
            return 1;
        } else if (x == 0 || y == 0) {
            return 0;
        }

        Coordinate coordinate = new Coordinate(x, y);

        if (cache.containsKey(coordinate)) {
            return cache.get(coordinate);
        }

        long steps = gridTraveler(x - 1, y, cache) + gridTraveler(x, y - 1, cache);
        cache.put(coordinate, steps);

        return steps;
    }
}
