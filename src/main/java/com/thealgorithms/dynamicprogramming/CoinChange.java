package com.thealgorithms.dynamicprogramming;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 */
public final class CoinChange {
    private CoinChange() {
    }

    // Driver Program
    public static void main(String[] args) {
        int amount = 12;
        int[] coins = {2, 4, 5};

        System.out.println("Number of combinations of getting change for " + amount + " is: " + change(coins, amount));
        System.out.println("Minimum number of coins required for amount :" + amount + " is: " + minimumCoins(coins, amount));
    }


    private static final Map<String, Boolean> coverageMap = new HashMap<>();

    private static void initializeCoverageMap() {
        coverageMap.put("for_loop.1", false);
        coverageMap.put("for_loop.2", false);
        coverageMap.put("for_loop.3", false);
        coverageMap.put("for_if.1", false);
        coverageMap.put("for_if.2", false);
    }

    public static Map<String, Boolean> getCoverageMap() {
        return new HashMap<>(coverageMap);
    }

    public static void resetCoverageMap() {
        initializeCoverageMap();
    }

    public static void printCoverage() {
        System.out.println("Coverage Results:");
        for (Map.Entry<String, Boolean> entry : coverageMap.entrySet()) {
            System.out.println("Branch: " + entry.getKey() + " Reached: " + entry.getValue());
        }
    }

    /**
     * This method finds the number of combinations of getting change for a
     * given amount and change coins
     *
     * @param coins The list of coins
     * @param amount The amount for which we need to find the change Finds the
     * number of combinations of change
     */
    public static int change(int[] coins, int amount) {
        initializeCoverageMap();
        int[] combinations = new int[amount + 1];
        combinations[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i < amount + 1; i++) {
                combinations[i] += combinations[i - coin];
            }
            // Uncomment the below line to see the state of combinations for each coin
            // printAmount(combinations);
        }

        return combinations[amount];
    }

    /**
     * This method finds the minimum number of coins needed for a given amount.
     *
     * @param coins The list of coins
     * @param amount The amount for which we need to find the minimum number of
     * coins. Finds the minimum number of coins that make a given value.
     */
    public static int minimumCoins(int[] coins, int amount) {
        // minimumCoins[i] will store the minimum coins needed for amount i
        initializeCoverageMap();
        int[] minimumCoins = new int[amount + 1];

        minimumCoins[0] = 0;

        for (int i = 1; i <= amount; i++) {
            coverageMap.put("for_loop.1", true);
            minimumCoins[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= amount; i++) {
            coverageMap.put("for_loop.2", true);
            for (int coin : coins) {
                coverageMap.put("for_loop.3", true);
                if (coin <= i) {
                    coverageMap.put("for_if.1", true);
                    int subRes = minimumCoins[i - coin];
                    if (subRes != Integer.MAX_VALUE && subRes + 1 < minimumCoins[i]) {
                        coverageMap.put("for_if.2", true);
                        minimumCoins[i] = subRes + 1;
                    }
                }
            }
        }
        printCoverage();
        // Uncomment the below line to see the state of combinations for each coin
        // printAmount(minimumCoins);
        return minimumCoins[amount];
    }

    // A basic print method which prints all the contents of the array
    public static void printAmount(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
