package zhangxu.onlinetest.cod.test;

import zhangxu.onlinetest.cod.lessons.timecmplx.TapeEquilibrium;



public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CyclicRotation cr = new CyclicRotation();
		TapeEquilibrium tb = new TapeEquilibrium();
		int[] A = { -1, 1};
		int N = A.length;
		System.out.println(tb.solution(A, N));
//		int k = 2;
//		Printer.printIntArrInLine(A);
//		Printer.printIntArrInLine(cr.reversalRotate(A, N, k));
		
//		System.out.println(FrogJump.solution(3, 22, 5));

	}

}
