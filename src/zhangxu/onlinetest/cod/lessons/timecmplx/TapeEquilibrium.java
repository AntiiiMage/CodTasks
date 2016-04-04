package zhangxu.onlinetest.cod.lessons.timecmplx;

public class TapeEquilibrium {

	
	public static int solution(int[] A, int N){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i ++){
			int diff = getAbsoluteDiff(sumArr(A, 0, i), sumArr(A, i + 1, N - 1));
			min = min > diff ? diff : min;
		}
		return min;
	}
	
	private static int getAbsoluteDiff(int a, int b){
		return a > b ? a - b : b - a;
	}
	
	private static int sumArr(int[] A, int s, int e){
		int result = 0;
		for(int i = s; i <= e; i ++){
			result += A[i];
		}
		return result;
	}
}
