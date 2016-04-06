package zhangxu.practice.algrithm.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zhangxu.practice.algrithm.QuickSort;
import zhangxu.utils.ArrayUtils;

public class QuickSortTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSortWithSample() {
		Integer[] a = new Integer[]{1,1,20,32,12,34,11,8,3};
		QuickSort.sort(a);
		boolean exp = true;
		boolean act = ArrayUtils.isSortedAsec(a);
		assertEquals("Test with {1,1,20,32,12,34,11,8,3}", exp,act);
	}

}
