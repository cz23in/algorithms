package com.thealgorithms.searches;

import java.util.HashMap;
import java.util.Scanner;

/*
    Problem Statement:
    Given an array, find out how many times it has to been rotated
    from its initial sorted position.
    Input-Output:
    Eg. [11,12,15,18,2,5,6,8]
    It has been rotated: 4 times
    (One rotation means putting the first element to the end)
    Note: The array cannot contain duplicates

    Logic:
    The position of the minimum element will give the number of times the array has been rotated
    from its initial sorted position.
    Eg. For [2,5,6,8,11,12,15,18], 1 rotation gives [5,6,8,11,12,15,18,2], 2 rotations
   [6,8,11,12,15,18,2,5] and so on. Finding the minimum element will take O(N) time but, we can  use
   Binary Search to find the mimimum element, we can reduce the complexity to O(log N). If we look
   at the rotated array, to identify the minimum element (say a[i]), we observe that
   a[i-1]>a[i]<a[i+1].

    Some other test cases:
    1. [1,2,3,4] Number of rotations: 0 or 4(Both valid)
    2. [15,17,2,3,5] Number of rotations: 3
 */
final class HowManyTimesRotated {
    private HowManyTimesRotated() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The array has been rotated " + rotated(a) + " times");
        sc.close();
    }

    public static int rotated(int[] a) {
        HashMap<String, Boolean> coverage_map = new HashMap<String, Boolean>();
        coverage_map.put("main", false);
        coverage_map.put("main.while1", false);
        coverage_map.put("main.while1.if1", false);
        coverage_map.put("main.while1.if2", false);
        coverage_map.put("main.while1.if3", false);
        int result = rotated_wrapper(a, coverage_map);
        for (HashMap.Entry<String, Boolean> entry : coverage_map.entrySet()) {
            String key = entry.getKey();
            boolean value = entry.getValue();
            System.out.println("Branch: " + key + ", Reached: " + value);
        }
        return result;
    }

    public static int rotated_wrapper(int[] a, HashMap<String, Boolean> coverage_map) {
        coverage_map.put("main", true);

        int low = 0;
        int high = a.length - 1;
        int mid = 0; // low + (high-low)/2 = (low + high)/2

        while (low <= high) {
            coverage_map.put("main.while1", true);
            mid = low + (high - low) / 2;

            if (a[mid] < a[mid - 1] && a[mid] < a[mid + 1]) {
                coverage_map.put("main.while1.if1", true);
                break;
            } else if (a[mid] > a[mid - 1] && a[mid] < a[mid + 1]) {
                coverage_map.put("main.while1.if2", true);
                high = mid + 1;
            } else if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
                coverage_map.put("main.while1.if3", true);
                low = mid - 1;
            }
        }

        return mid;
    }
}
