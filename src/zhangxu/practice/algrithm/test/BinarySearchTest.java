package zhangxu.practice.algrithm.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import zhangxu.utils.MessageUtils;
import zhangxu.practice.algrithm.BinarySearch;

public class BinarySearchTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWithSingleElement() {
		int[] A = {1};
		int exp = 0;
		int act = BinarySearch.indexOf(A, 1);
		assertEquals("Test with {1}", exp, act);
	}
	
	@Test
	public void testWithSample() {
		int[] A = {1, 2, 3, 4, 5, 10, 200, 204, 209, 923, 1000};
		int exp = 6;
		int act = BinarySearch.indexOf(A, 200);
		assertEquals("Test with {1, 2, 3, 4, 5, 10, 200, 204, 209, 923, 1000}", exp, act);
	}

}
