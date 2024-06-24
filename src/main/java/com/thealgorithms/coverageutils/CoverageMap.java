package com.thealgorithms.coverageutils;

import java.util.HashMap;
import java.util.Map;

public class CoverageMap {
    public HashMap<String, Boolean> coverage;

    public CoverageMap() {
        coverage = new HashMap<String, Boolean>();
    }

    public void reset() {
        coverage.clear();
        addDefaultValues();
    }

    public void print() {
        System.out.println("\n*** COVERAGE REPORT ***");
        for (Map.Entry<String, Boolean> e : coverage.entrySet()) {
            System.out.println(
                    String.format("%-25s", e.getKey()) + e.getValue()
            );
        }
    }

    public void addDefaultValues() {}

    public void reached(String name) {
        coverage.put(name, true);
    }

    public void expectFunction(String name) {
        coverage.put(name, false);
    }
}
