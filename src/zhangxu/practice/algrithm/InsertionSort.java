package zhangxu.practice.algrithm;

public class InsertionSort {
	
	/**
	 * @param A is integer array to be sorted
	 * 
	 */
	public static void sort(int[] A){
		for(int i = 1; i < A.length; i++){
			int key = A[i];
			int j;
			for(j = i - 1; j >= 0 && key < A[j]; j--){
				A[j + 1] = A[j];
			}
			A[j + 1] = key;
		}
	}
}
