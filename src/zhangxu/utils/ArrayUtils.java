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

}
