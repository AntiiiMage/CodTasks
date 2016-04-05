package zhangxu.onlinetest.cod.tasks;

/*
 * 1-day ticket, costs 2, valid for one day
 * 7-day ticket, costs 7, valid for seven consecutive days
 * 30-day ticket, cost 25, 
 */

public class LeastTicketCost {

	public int solution(int[] A) {
		if (A.length <= 3) {
			return A.length * 2;
		}

		if (A.length >= 3 * 7 + 2) {
			return 25;
		}
		int i = 0;
		int cost = 0;
		while (i < A.length) {
			int j = 1;
			while (j < 7) {
				if(i == A.length -1 && j < 3){
					cost += 2;
					i ++;
					break;
				}
				if(i + j + 1== A.length && j < 3){
					cost += 2;
					i++;
					break;
				}
				
				if(i + j + 1== A.length && j >= 3 && A[i + j ] - A[i] > 6){
					cost += 2;
					i++;
					break;
				}
				
				if(i + j + 1== A.length && j >= 3 && A[i + j ] - A[i] < 7){
					cost += 7;
					i = i + j + 1;
					break;
				}
				if (A[i + j] - A[i] > 6 && i + j + 1 < A.length) {
					cost += 2;
					i++;
					break;
				}
				
				if (A[i + j] - A[i] < 7 && i + j + 1 < A.length) {
					if(A[i + j + 1] - A[i] < 7){
						j++;
						continue;
					}
					
					if(A[i + j + 1] - A[i] > 6){
						cost += 7;
						i = i + j + 1;
						break;
					}
					
				}
				
			}

		}

		int min = findMin(byDays(A), byMonth(A));
		min = findMin(min, cost);

		// int[] costs = new int[A.length];
		// int i = 0;
		// while(i < A.length){
		// int j = 1;
		// while(j < i + 7){
		// if(A[i + j] - A[i] < 7){
		// j++;
		// }
		// if(A[i + j] - A[i] > 7 && j > 3){
		// costs[i] += j * 1;
		// i = i + 1;
		// break;
		// }
		//
		// if(A[i + j] - A[i] > 7 && j < 4){
		// costs[i] += j * 2;
		//
		// break;
		// }
		// }
		//
		// }

		return min;
	}

	private int byDays(int[] A) {
		return 2 * A.length;
	}

	private int byMonth(int[] A) {
		return 25;
	}

	private int findMin(int a, int b) {
		return a < b ? a : b;
	}

	private int findMinInArr(int[] A) {
		int min = Integer.MAX_VALUE;
		for (int i : A) {
			min = min < i ? min : i;
		}
		return min;
	}

}
