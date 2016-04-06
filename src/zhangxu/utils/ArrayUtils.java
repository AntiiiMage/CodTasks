package zhangxu.utils;

import java.util.Arrays;

public class ArrayUtils {
	
	public static boolean isArrEqual(int[] A, int[] B){
		if(null == A || null == B){
			return false;
		}
		
		else if(A.length != B.length){
			return false;
		}
		else{
			for(int i = 0; i < A.length; i ++){
				if(A[i] == B[i]) continue;
				else
					return false;
			}
			return true;
		}
	}
	
	public static int[] copyToNewIntArr(int[] A){
		return Arrays.copyOf(A, A.length);
	}
	
	public static void sortArrByAPI(int[] A){
		Arrays.sort(A);
	}
	
	public static boolean deeplyEquals(Object[] A, Object[]B){
		return Arrays.deepEquals(A, B);
	}
	
	public static boolean isSortedAsec(Comparable[] a, int lo, int hi){
		for(int i =lo + 1; i <= hi; i ++){
			if(less(a[i] , a[i-1])) return false;
		}
		return true;
	}
	
	public static boolean isSortedAsec(Comparable[] a){
		return isSortedAsec(a, 0, a.length-1);
	}
	
	
	public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
	
	public static void swap(Object[] a, int i, int j){
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
        

}
