package zhangxu.onlinetest.cod.lessons.timecmplx;

public class TapeEquilibrium {

	
	public int solution(int[] A, int N){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N - 1; i ++){
			int diff = getAbsoluteDiff(sumArr(A, 0, i), sumArr(A, i + 1, N - 1));
			min = min > diff ? diff : min;
		}
		return min;
	}
	
	private int getAbsoluteDiff(int a, int b){
		return a > b ? a - b : b - a;
	}
	
	private int sumArr(int[] A, int s, int e){
		int result = 0;
		for(int i = s; i <= e; i ++){
			result += A[i];
		}
		return result;
	}
}
