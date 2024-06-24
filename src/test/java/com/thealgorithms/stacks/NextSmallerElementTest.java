package com.thealgorithms.stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextSmallerElementTest {

    @Test
    public void nextSmallerElementTest() {
        NextSmallerElement.coverage.reset();
        int[] input1 = {2, 7, 3, 5, 4, 6, 8};
        int[] result1 = NextSmallerElement.findNextSmallerElements(input1);
        int[] expected1 = {-1, 2, 2, 3, 3, 4, 6};
        Assertions.assertArrayEquals(expected1, result1);
        NextSmallerElement.coverage.print();
    }

}
