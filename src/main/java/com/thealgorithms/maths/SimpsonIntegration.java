package com.thealgorithms.maths;

import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class SimpsonIntegration {

    private static final Map<String, Boolean> coverageMap = new HashMap<>();

    private static void initializeCoverageMap() {
        coverageMap.put("forloop.1", false);
        coverageMap.put("forloop.2", false);
        coverageMap.put("if.1", false);
        coverageMap.put("elif.1", false);
        coverageMap.put("else.1", false);
    }

    public static Map<String, Boolean> getCoverageMap() {
        return new HashMap<>(coverageMap);
    }

    public static void resetCoverageMap() {
        initializeCoverageMap();
    }

    /*
     * @param N: Number of intervals (must be even number N=2*k)
     * @param h: Step h = (b-a)/N
     * @param a: Starting point of the interval
     * @param b: Ending point of the interval
     *
     * The interpolation points xi = x0 + i*h are stored the treeMap data
     *
     * @return result of the integral evaluation
     */
    public double simpsonsMethod(int n, double h, double a) {
        TreeMap<Integer, Double> data = new TreeMap<>(); // Key: i, Value: f(xi)
        double temp;
        double xi = a; // Initialize the variable xi = x0 + 0*h

        // Create the table of xi and yi points
        for (int i = 0; i <= n; i++) {
            coverageMap.put("forloop.1", true);
            temp = f(xi); // Get the value of the function at that point
            data.put(i, temp);
            xi += h; // Increase the xi to the next point
        }

        // Apply the formula
        double integralEvaluation = 0;
        for (int i = 0; i < data.size(); i++) {
            coverageMap.put("forloop.2", true);
            if (i == 0 || i == data.size() - 1) {
                coverageMap.put("if.1", true);
                integralEvaluation += data.get(i);
                System.out.println("Multiply f(x" + i + ") by 1");
            } else if (i % 2 == 1) {
                coverageMap.put("elif.1", true);
                integralEvaluation += (double) 4 * data.get(i);
                System.out.println("Multiply f(x" + i + ") by 4");
            } else {
                coverageMap.put("else.1", true);
                integralEvaluation += (double) 2 * data.get(i);
                System.out.println("Multiply f(x" + i + ") by 2");
            }
        }
        // Multiply by h/3
        integralEvaluation = h / 3 * integralEvaluation;

        // Return the result
        return integralEvaluation;
    }

    // Sample function f
    // Function f(x) = e^(-x) * (4 - x^2)
    public double f(double x) {
        return Math.exp(-x) * (4 - Math.pow(x, 2));
        //        return Math.sqrt(x);
    }
}
