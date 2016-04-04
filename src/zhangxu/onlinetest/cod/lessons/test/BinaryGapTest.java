package zhangxu.onlinetest.cod.lessons.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zhangxu.onlinetest.cod.lessons.BinaryGap;

public class BinaryGapTest {
	BinaryGap bg;
	
	@Before
	public void setUp(){
		bg = new BinaryGap();
	}
	
	

	@Test
	public void testSample1() {
		int n = 0b10000010001011;
		int result = bg.solution(n);
		assertEquals("Result should be 5 but get " + result, 5, result);
	}

}
