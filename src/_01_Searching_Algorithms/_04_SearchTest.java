package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] sorted = { "a", "b", "bob", "chad", "kevin", "shrek" };
		assertEquals(4, _00_LinearSearch.linearSearch(sorted, "kevin"));
		assertEquals(2, _00_LinearSearch.linearSearch(sorted, "bob"));
		assertEquals(5, _00_LinearSearch.linearSearch(sorted, "shrek"));
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] binary = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(1, _01_BinarySearch.binarySearch(binary, 0, 10, 1));
		assertEquals(8, _01_BinarySearch.binarySearch(binary, 0, 10, 8));
		assertEquals(5, _01_BinarySearch.binarySearch(binary, 0, 10, 5));
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] inter = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40 };
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(inter, 4));
		assertEquals(6, _02_InterpolationSearch.interpolationSearch(inter, 14));
		assertEquals(13, _02_InterpolationSearch.interpolationSearch(inter, 28));
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] exp = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(exp, 3) );
		assertEquals(9, _03_ExponentialSearch.exponentialSearch(exp, 9) );
		assertEquals(19, _03_ExponentialSearch.exponentialSearch(exp, 19) );
	}
}
