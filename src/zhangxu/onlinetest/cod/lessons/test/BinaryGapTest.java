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
		int expResult = 5;
		int reaResult = bg.solution(n);
		assertTest(n, expResult, reaResult);
		assertEquals("Result should be 5 but get " + result, 5, result);
	}



	private void assertTest(int n, int expResult, int reaResult) {
		// TODO Auto-generated method stub
		assertEquals("Test with input: " + n + ", " + "expected: " + expResult + ", real: " + reaResult,);
		
	}
	
	

}
