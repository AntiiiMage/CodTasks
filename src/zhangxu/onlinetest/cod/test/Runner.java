package zhangxu.onlinetest.cod.test;

import zhangxu.onlinetest.cod.lessons.BinaryGap;
import zhangxu.onlinetest.cod.lessons.CyclicRotation;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclicRotation cr = new CyclicRotation();
		int[] A = { 1, 2, 3, 4, 5};
		int N = A.length;
		int k = 2;
		Printer.printIntArrInLine(A);
		Printer.printIntArrInLine(cr.reversalRotate(A, N, k));

	}

}
