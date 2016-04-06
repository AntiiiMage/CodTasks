package zhangxu.practice.algrithm.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import zhangxu.practice.algrithm.InsertionSort;
import zhangxu.utils.ArrayUtils;
import zhangxu.utils.MessageUtils;
import zhangxu.utils.PrintUtils;

public class InsertionSortTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWithSample() {
		int[] A = {2, 1, 3, 4};
		int[] B = ArrayUtils.copyToNewIntArr(A);
		PrintUtils.printIntArrAsLine(A);
		InsertionSort.sort(A);
		PrintUtils.printIntArrAsLine(A);
		ArrayUtils.sortArrByAPI(B);
		boolean exp = true;
		boolean act = ArrayUtils.isArrEqual(A, B);
		assertEquals("Test with {2, 1, 3, 4}", exp, act);
		
	}
	
	@Test
	public void testWithSingleElement() {
		int[] A = {0};
		int[] B = ArrayUtils.copyToNewIntArr(A);
		InsertionSort.sort(A);
		ArrayUtils.sortArrByAPI(B);
		boolean exp = true;
		boolean act = ArrayUtils.isArrEqual(A, B);
		assertEquals("Test with {0,0}", exp, act);
		
	}
	
	@Test
	public void testWithSameElements() {
		int[] A = {0,0,0,0,0};
		int[] B = ArrayUtils.copyToNewIntArr(A);
		InsertionSort.sort(A);
		ArrayUtils.sortArrByAPI(B);
		boolean exp = true;
		boolean act = ArrayUtils.isArrEqual(A, B);
		assertEquals("Test with {0,0}", exp, act);
		
	}
	
	@Test
	public void testWithDuplicatedElements() {
		int[] A = {0,0,0,0,0,9,12,12,5,12,8};
		int[] B = ArrayUtils.copyToNewIntArr(A);
		InsertionSort.sort(A);
		ArrayUtils.sortArrByAPI(B);
		boolean exp = true;
		boolean act = ArrayUtils.isArrEqual(A, B);
		assertEquals("Test with {0,0}", exp, act);
		
	}

}
