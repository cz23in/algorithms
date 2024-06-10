package com.thealgorithms.maths;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * use quick sort algorithm to get kth largest or kth smallest element in given array
 */
public final class FindKthNumber {
    private FindKthNumber() {
    }

    private static final Random RANDOM = new Random();
    private static final Map<String, Boolean> coverageMap = new HashMap<>();

    public static void main(String[] args) {
        initializeCoverageMap();
        /* generate an array with random size and random elements */
        int[] nums = generateArray(100);

        /* get 3th largest element */
        int kth = 3;
        int kthMaxIndex = nums.length - kth;
        int targetMax = findKthMax(nums, kthMaxIndex);

        /* get 3th smallest element */
        int kthMinIndex = kth - 1;
        int targetMin = findKthMax(nums, kthMinIndex);

        Arrays.sort(nums);
        assert nums[kthMaxIndex] == targetMax;
        assert nums[kthMinIndex] == targetMin;

        printCoverageResults();
    }

    private static void initializeCoverageMap() {
        coverageMap.put("while_loop.1", false);
        coverageMap.put("while.if.1", false);
        coverageMap.put("while.if.2", false);
        coverageMap.put("while.if.3", false);
        coverageMap.put("for_loop.1", false);
        coverageMap.put("for_loop.if.1", false);
    }

    private static int[] generateArray(int capacity) {
        int size = RANDOM.nextInt(capacity) + 1;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt() % 100;
        }
        return array;
    }

    private static int findKthMax(int[] nums, int k) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            coverageMap.put("while_loop.1", true);
            int pivot = partition(nums, start, end);
            if (k == pivot) {
                coverageMap.put("while.if.1", true);
                return nums[pivot];
            } else if (k > pivot) {
                coverageMap.put("while.if.2", true);
                start = pivot + 1;
            } else {
                coverageMap.put("while.if.3", true);
                end = pivot;
            }
        }
        return -1;
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int j = start;
        for (int i = start + 1; i < end; i++) {
            coverageMap.put("for_loop.1", true);
            if (nums[i] < pivot) {
                coverageMap.put("for_loop.if.1", true);
                j++;
                swap(nums, i, j);
            }
        }
        swap(nums, start, j);
        return j;
    }

    private static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    private static void printCoverageResults() {
        System.out.println("Coverage Results:");
        for (Map.Entry<String, Boolean> entry : coverageMap.entrySet()) {
            System.out.println("Branhc: " + entry.getKey() + " Reached: " + entry.getValue());
        }
    }
}
