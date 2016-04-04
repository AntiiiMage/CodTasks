package zhangxu.onlinetest.cod.lessons;

public class OddOccurrencesInArray {
	public static int solution (int[] arr, int N){
		int oddIndex = 0;
		for(int a : arr){
			oddIndex ^= a;
		}
		return oddIndex;
	}
}
