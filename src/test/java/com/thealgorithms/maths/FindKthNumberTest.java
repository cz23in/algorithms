package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindKthNumberTest {

    @Test
    public void testFindKthMax_ValidK_ReturnsCorrectElement() {
        int[] nums = {-86, 34, -83, -35, -85, -22, 42, 39, -5, -67};
        assertEquals(34, FindKthNumber.findKthMax(nums, 7));
        assertEquals(-83, FindKthNumber.findKthMax(nums, 2));
    }

    @Test
    public void testFindKthMax_KOutOfBoundsNegative_ReturnsNegativeOne() {
        int[] nums = {-86, 34, -83, -35, -85, -22, 42, 39, -5, -67};
        assertEquals(-1, FindKthNumber.findKthMax(nums, -1));
    }

    @Test
    public void testFindKthMax_KOutOfBoundsGreaterThanLength_ReturnsNegativeOne() {
        int[] nums = {-86, 34, -83, -35, -85, -22, 42, 39, -5, -67};
        assertEquals(-1, FindKthNumber.findKthMax(nums, nums.length));
    }

    @Test
    public void testFindKthMax_EmptyArray_ReturnsNegativeOne() {
        int[] emptyArray = {};
        assertEquals(-1, FindKthNumber.findKthMax(emptyArray, 0));
    }

    @Test
    public void testFindKthMax_KEqualPivot_ReturnResult() {
        int[] nums = {-86, 34, -83, -35, -85, -22, 42, 39, -5, -67};
        assertEquals(-35, FindKthNumber.findKthMax(nums, 4));
    }

    @Test
    public void testFindKthMax_KGreaterThanPivot_UpdatesStart() {
        int[] nums = {-86, 34, -83, -35, -85, -22, 42, 39, -5, -67};
        assertEquals(42, FindKthNumber.findKthMax(nums, 9));
    }

    @Test
    public void testFindKthMax_KLessThanPivot_UpdatesEnd() {
        int[] nums = {-86, 34, -83, -35, -85, -22, 42, 39, -5, -67};
        assertEquals(-86, FindKthNumber.findKthMax(nums, 0));
    }

    @Test
    public void testFindKthMax_SingleElementArray_ReturnsElement() {
        int[] singleElement = {42};
        assertEquals(42, FindKthNumber.findKthMax(singleElement, 0));
    }

    @Test
    public void testFindKthMax_Duplicates_ReturnsCorrectElement() {
        int[] numsWithDuplicates = {-86, 34, -83, -35, -85, -22, 42, 39, -5, -67, 34, -35};
        assertEquals(34, FindKthNumber.findKthMax(numsWithDuplicates, 8));
        assertEquals(-35, FindKthNumber.findKthMax(numsWithDuplicates, 4));
    }

    @Test
    public void testPartition_ValidArray_CorrectPartitioning() {
        int[] nums = {-86, 34, -83, -5, -85, -22, 42, 39, -35, -67};
        int pivotIndex = FindKthNumber.partition(nums, 0, nums.length);

        for (int i = 0; i < pivotIndex; i++) {
            assertTrue(nums[i] < nums[pivotIndex]);
        }
        for (int i = pivotIndex + 1; i < nums.length; i++) {
            assertTrue(nums[i] >= nums[pivotIndex]);
        }
    }
}
