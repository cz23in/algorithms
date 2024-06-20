package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
public class FastInverseSqrtTests {

    /* clear the coverage before each test */
    @BeforeEach
    void clearCoverage() {
        FastInverseSqrt.resetCoverage();
    }

    @Test
    void testForOneElement() {
        assertFalse(FastInverseSqrt.inverseSqrt(1332));
        FastInverseSqrt.printCoverage("testForOneElement");
    }

    @Test
    void testForSecond() {
        assertFalse(FastInverseSqrt.inverseSqrt(1332f));
        FastInverseSqrt.printCoverage("testForSecond");
    }

    @Test
    void testForThird() {
        assertFalse(FastInverseSqrt.inverseSqrt(1));
        FastInverseSqrt.printCoverage("testForThird");
    }

    @Test
    void testForFourth() {
        assertFalse(FastInverseSqrt.inverseSqrt(1f));
        FastInverseSqrt.printCoverage("testForFourth");
    }

    @Test
    void testForFifth() {
        assertFalse(FastInverseSqrt.inverseSqrt(4522));
        FastInverseSqrt.printCoverage("testForFifth");
    }

    @Test
    void testForSixth() {
        assertFalse(FastInverseSqrt.inverseSqrt(4522f));
        FastInverseSqrt.printCoverage("testForSixth");
    }

    @Test
    void testForSeventh() {
        assertFalse(FastInverseSqrt.inverseSqrt(21));
        FastInverseSqrt.printCoverage("testForSeventh");
    }

    @Test
    void testForEighth() {
        assertFalse(FastInverseSqrt.inverseSqrt(21f));
        FastInverseSqrt.printCoverage("testForEighth");
    }


}
