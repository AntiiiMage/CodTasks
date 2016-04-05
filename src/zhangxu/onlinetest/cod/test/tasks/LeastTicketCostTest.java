package zhangxu.onlinetest.cod.test.tasks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import zhangxu.onlinetest.cod.tasks.LeastTicketCost;

public class LeastTicketCostTest {
	LeastTicketCost ltc;

	@Before
	public void setUp() throws Exception {
		ltc = new LeastTicketCost();
	}

	@Test
	public void testSolutionExemple1() {
		int[] para = { 1, 2, 3, 4, 5, 6, 7, 29, 30 };
		int exp = 11;
		int act = ltc.solution(para);
		assertEquals("{1, 2, 3, 4, 5, 6, 7, 29, 30}", exp, act);
	}

	@Test
	public void testSolutionExemple2() {
		int[] para = { 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 29, 30 };
		int exp = 18;
		int act = ltc.solution(para);
		assertEquals("{1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 29, 30}", exp, act);
	}

	@Test
	public void testSolutionExemple3() {
		int[] para = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 29, 30 };
		int exp = 18;
		int act = ltc.solution(para);
		assertEquals("{1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 29, 30}", exp, act);
	}

	@Test
	public void testSolutionShouldBeSolvedAs2Weeks2Days() {
		int[] para = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 29, 30};
		int exp = 18;
		int act = ltc.solution(para);
		assertEquals("{1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 29, 30}", exp, act);
	}

	@Test
	public void testSolutionShouldBeSolvedAs3Weeks() {
		int[] para = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 27, 28, 29, 30};
		int exp = 21;
		int act = ltc.solution(para);
		assertEquals("{1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 29, 30}", exp, act);
	}

	@Test
	public void testWithSmallDays() {
		int[] para = { 1, 2 };
		int exp = 4;
		int act = ltc.solution(para);
		assertEquals("{1, 2}", exp, act);
	}

	@Test
	public void testWithLargeDays() {
		int[] para = new int[28];
		for (int i = 0; i < para.length; i++) {
			para[i] = i;
		}
		int exp = 25;
		int act = ltc.solution(para);
		assertEquals("Test with 28 days", exp, act);
	}
	
	@Test
	public void testWithSmaples22(){
		int[] para = {1, 3, 4, 5, 6, 7, 8,9};
		int exp = 9;
		int act = ltc.solution(para);
		assertEquals("should be 1 week 1 day", exp, act);
	}


}
