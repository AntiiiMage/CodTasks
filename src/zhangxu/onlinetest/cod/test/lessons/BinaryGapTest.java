package zhangxu.onlinetest.cod.test.lessons;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zhangxu.onlinetest.cod.lessons.iterations.BinaryGap;

public class BinaryGapTest {
	BinaryGap bg;

	@Before
	public void setUp() {
		bg = new BinaryGap();
	}

	@Test
	public void testExample() {
		int n = 0b10000010001011;
		int exp = 5;
		int act = bg.solution(n);
		assertEquals("Input normal value " + n, exp, act);
	}

	@Test
	public void testAllOneBinary() {
		int n = 0b1111;
		int exp = 0;
		int act = bg.solution(n);
		assertEquals("Input binary with all 1 ", exp, act);
	}
	
	@Test
	public void testMaxExtreme() {
		int n = Integer.MAX_VALUE;
		int exp = 0;
		int act = bg.solution(n);
		assertEquals("Input binary with all 1 ", exp, act);
	}
	
	@Test
	public void testMinExtreme() {
		int n = 1;
		int exp = 0;
		int act = bg.solution(n);
		assertEquals("Input binary with all 1 ", exp, act);
	}
	
	

}
