package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeithNumberTest {

    @Test
    public void testKeithNumbers() {
        assertTrue(KeithNumber.isKeith(197), "197 should be a Keith number");
        assertTrue(KeithNumber.isKeith(14), "14 should be a Keith number");
        assertTrue(KeithNumber.isKeith(28), "28 should be a Keith number");
    }

    @Test
    public void testNonKeithNumbers() {
        assertTrue(!KeithNumber.isKeith(198), "198 should not be a Keith number");
        assertTrue(!KeithNumber.isKeith(15), "15 should not be a Keith number");
        assertTrue(!KeithNumber.isKeith(123), "123 should not be a Keith number");
    }

    @Test
    public void testSignedCases() {
        KeithNumber.isKeith(-10);
        assertTrue(!KeithNumber.isKeith(-10), "-10 should not be a Keith number");
    }

    @Test
    public void testLargeKeithNumber() {
        KeithNumber.isKeith(31331);
        assertTrue(KeithNumber.isKeith(31331), "31331 should be a Keith number");
    }

    @Test
    public void testRandomNumber() {
        KeithNumber.isKeith(1137);
        assertTrue(KeithNumber.isKeith(742), "742 should be a Keith number");
    }
}
