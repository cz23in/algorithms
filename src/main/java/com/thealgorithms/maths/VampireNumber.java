package com.thealgorithms.maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * n number theory, a vampire number (or true vampire number) is a composite
 * natural number with an even number of digits, that can be factored into two
 * natural numbers each with half as many digits as the original number and not
 * both with trailing zeroes, where the two factors contain precisely all the
 * digits of the original number, in any order, counting multiplicity. The first
 * vampire number is 1260 = 21 × 60. *
 *
 * <p>
 * link: https://en.wikipedia.org/wiki/Vampire_number *
 *
 * <p>
 */
public final class VampireNumber {
    private VampireNumber() {
    }

    private static final HashMap<String, Boolean> coverageMap = new HashMap<>();


    static {
        // Initialize coverage tracking map for all branches
        coverageMap.put("isVampireNumber.if_1", false);
        coverageMap.put("isVampireNumber.if_2", false);
        coverageMap.put("isVampireNumber.else_2", false);
        coverageMap.put("isVampireNumber.else_1", false);
        coverageMap.put("splitIntoDigits.while_1", false);
        coverageMap.put("splitIntoDigits.while_2", false);


    }


    public static void main(String[] args) {
        test(10, 1000);
    }

    static void test(int startValue, int stopValue) {
        int countofRes = 1;
        StringBuilder res = new StringBuilder();

        for (int i = startValue; i <= stopValue; i++) {
            for (int j = i; j <= stopValue; j++) {
                // System.out.println(i+ " "+ j);
                if (isVampireNumber(i, j, true)) {
                    countofRes++;
                    res.append("" + countofRes + ": = ( " + i + "," + j + " = " + i * j + ")"
                        + "\n");
                }
            }
        }
        System.out.println(res);
    }

    static boolean isVampireNumber(int a, int b, boolean noPseudoVamireNumbers) {
        // this is for pseudoVampireNumbers  pseudovampire number need not be of length n/2 digits
        // for example 126 = 6 x 21

        if (noPseudoVamireNumbers) { // coverage id = 1
            coverageMap.put("isVampireNumber.if_1", true);

            if (a * 10 <= b || b * 10 <= a) { // coverage id = 2
                coverageMap.put("isVampireNumber.if_2", true);
                return false;
            } else {
                coverageMap.put("isVampireNumber.else_2", true);
            }

        } else {
            coverageMap.put("isVampireNumber.else_1", true);
        }

        String mulDigits = splitIntoDigits(a * b, 0);
        String faktorDigits = splitIntoDigits(a, b);

        return mulDigits.equals(faktorDigits);
    }

    // methode to Split the numbers to Digits
    static String splitIntoDigits(int num, int num2) {
        StringBuilder res = new StringBuilder();

        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
            coverageMap.put("splitIntoDigits.while_1", true);
        }
        while (num2 > 0) {
            digits.add(num2 % 10);
            num2 /= 10;
            coverageMap.put("splitIntoDigits.while_2", true);
        }
        Collections.sort(digits);
        for (int i : digits) {
            res.append(i);
        }

        return res.toString();
    }

    public static void printCoverage() {
        System.out.println("Coverage results: ");
        for (String branch : coverageMap.keySet()) {
            System.out.println(branch + " reached: " + (coverageMap.get(branch) ? "true" : "false"));
        }
    }

    public static void resetCoverage() {
        coverageMap.put("isVampireNumber.if_1", false);
        coverageMap.put("isVampireNumber.if_2", false);
        coverageMap.put("isVampireNumber.else_2", false);
        coverageMap.put("isVampireNumber.else_1", false);
        coverageMap.put("splitIntoDigits.while_1", false);
        coverageMap.put("splitIntoDigits.while_2", false);
    }
}
