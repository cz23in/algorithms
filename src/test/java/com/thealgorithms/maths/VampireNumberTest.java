package com.thealgorithms.maths;
import static com.thealgorithms.maths.VampireNumber.printCoverage;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
public class VampireNumberTest {


    @BeforeEach
    void clearCoverage() {
        VampireNumber.resetCoverage();
    }


    @Test
    void testIsVampireNumber_False() {
        assertFalse(VampireNumber.isVampireNumber(15, 20, true));
        printCoverage();

    }

    @Test
    void testIsVampireNumber_NoPseudoVampireNumbers_True() {
        assertTrue(VampireNumber.isVampireNumber(21, 60, false));
        printCoverage();

    }

    @Test
    void testIsVampireNumber_NoPseudoVampireNumbers_False() {
        assertFalse(VampireNumber.isVampireNumber(15, 20, false));
        printCoverage();

    }

    @Test
    void testIsVampireNumber_HitInnerIf() {
        // Provide inputs that satisfy the condition a * 10 <= b || b * 10 <= a
        assertFalse(VampireNumber.isVampireNumber(12, 120, true));
        printCoverage();
    }

    @Test
    void testSplitIntoDigits() {
        assertEquals("001237", VampireNumber.splitIntoDigits(1023, 70));
        printCoverage();

    }

}
