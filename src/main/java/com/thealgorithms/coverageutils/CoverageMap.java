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
            System.out.println(e.getKey() + " was reached? " + e.getValue());
        }
    }

    public void addDefaultValues() {}

    public void set(String name) {}
}
