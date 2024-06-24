package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeithNumberTest {

    private void checkCoverage(String testName) {
        System.out.println("Coverage results for test: " + testName);
        KeithNumber.printCoverageResults();
    }

    @Test
    public void testKeithNumbers() {
        KeithNumber.resetCoverageMap();
        assertTrue(KeithNumber.isKeith(197), "197 should be a Keith number");
        checkCoverage("testKeithNumbers - 197");

        KeithNumber.resetCoverageMap();
        assertTrue(KeithNumber.isKeith(14), "14 should be a Keith number");
        checkCoverage("testKeithNumbers - 14");
    }

    @Test
    public void testNonKeithNumbers() {
        KeithNumber.resetCoverageMap();
        assertTrue(!KeithNumber.isKeith(198), "198 should not be a Keith number");
        checkCoverage("testNonKeithNumbers - 198");

        KeithNumber.resetCoverageMap();
        assertTrue(!KeithNumber.isKeith(123), "123 should not be a Keith number");
        checkCoverage("testNonKeithNumbers - 123");
    }

    @Test
    public void testSignedCases() {

        KeithNumber.resetCoverageMap();
        assertTrue(!KeithNumber.isKeith(-10), "-10 should not be a Keith number");
        checkCoverage("testEdgeCases - -10");
    }

    @Test
    public void testLargeNumber() {
        KeithNumber.resetCoverageMap();
        assertTrue(KeithNumber.isKeith(31331), "31331 should be a Keith number");
        checkCoverage("testLargeKeithNumber - 31331");
    }

    @Test
    public void testAnotherKeithNumber() {
        KeithNumber.resetCoverageMap();
        assertTrue(KeithNumber.isKeith(742), "742 should be a Keith number");
        checkCoverage("testAnotherKeithNumber - 742");
    }
}
