package zhangxu.onlinetest.cod.lessons;

/*point:
 number is even if number & 1 = 0
 number is odd if number & 1 = 1
 */
public class BinaryGap {

	public static int solution(int n) {
		int max = 0;
		int r;
		int count = -1;
		while (n > 0) {
			r = n & 1;
			if (r == 0 && count > -1) {
				count++;
			}

			if (r == 1) {
				count = 0;
			}
			if (count > max)
				max = count;
			n = n >> 1;

		}
		return max;
	}

}
