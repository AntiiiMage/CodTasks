package zhangxu.onlinetest.cod.lessons.arrays;

public class CyclicRotation {

	
//	Space is O(n) and time is O(n)
	public int[] rotate(int[] A, int N, int k) {
		if(null == A || k < 0){
			throw new IllegalArgumentException("Illegal arguments found !");
		}
		
		k = k > N ? k % N : k;
		int[] result = new int[N];
		for (int i = k; i < N; i++) {
			result[i] = A[i - k];
		}

		for (int j = 0; j < k; j++) {
			result[j] = A[j + N - k];
		}

		return result;
	}

//	the time is O(n*k).
	public int[] bubbleRotate(int[] A, int N, int k){
		if(null == A || k < 0){
			throw new IllegalArgumentException("Illegal arguments found !");
		}
		
		k = k > N ? k % N : k;
		
		for(int i = 0; i < k; i ++){
			for (int j = N -1; j > 0; j--){
				int temp = A[j];
				A[j] = A[j-1];
				A[j-1] = temp;
			}
		}
		
		return A;
	}
	
	
	public int[] reversalRotate(int[] A, int N, int k){
		if(null == A || k < 0){
			throw new IllegalArgumentException("Illegal arguments found !");
		}
		
		k = k > N ? k % N : k;
		reverse(A,  0, N - k - 1);
		reverse(A, N-k, N -1);
		reverse(A, 0, N-1);
		
		return A;
		
	}
	
	public void reverse(int[] A, int startIndex, int endIndex){
		if(null == A || A.length == 1){
			return;
		}
		
		while(startIndex < endIndex){
			int temp = A[endIndex];
			A[endIndex] = A[startIndex];
			A[startIndex] = temp;
			startIndex ++;
			endIndex --;
		}
		
	}
		

}
