package com.thealgorithms.dynamicprogramming;

import static com.thealgorithms.dynamicprogramming.CoinChange.printCoverage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CoinChangeTest {

    @BeforeEach
    void clearCoverage() {
        CoinChange.resetCoverageMap();
    }

    @Test
    void testMinimumCoins_Basic() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = CoinChange.minimumCoins(coins, amount);
        assertEquals(3, result); // 11 = 5 + 5 + 1
        printCoverage();
    }

    @Test
    void testMinimumCoins_NoSolution() {
        int[] coins = {2};
        int amount = 3;
        int result = CoinChange.minimumCoins(coins, amount);
        assertEquals(Integer.MAX_VALUE, result);
        printCoverage();
    }

    @Test
    void testMinimumCoins_OneCoin() {
        int[] coins = {1};
        int amount = 0;
        int result = CoinChange.minimumCoins(coins, amount);
        assertEquals(0, result);
        printCoverage();
    }

    @Test
    void testMinimumCoins_Match() {
        int[] coins = {1, 3, 4};
        int amount = 6;
        int result = CoinChange.minimumCoins(coins, amount);
        assertEquals(2, result); // 6 = 3 + 3
        printCoverage();
    }

    @Test
    void testMinimumCoins_HitInnerIf() {
        int[] coins = {1, 2, 5};
        int amount = 3;
        int result = CoinChange.minimumCoins(coins, amount);
        assertEquals(2, result); // 3 = 2 + 1
        printCoverage();
    }
}
