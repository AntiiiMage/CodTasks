package zhangxu.practice.algrithm;

public class BinarySearch {
	/**
	 * @param A the array of integers, must be sorted in ascending order
	 * @param key the search target
	 * @return index of key in array A
	 */
	public static int indexOf(int[] A, int key) {
		int lo = 0;
		int hi = A.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < A[mid])
				hi = mid - 1;
			else if (key > A[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

}
