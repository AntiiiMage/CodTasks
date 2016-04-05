package zhangxu.onlinetest.cod.lessons.iterations;

/*point:
 number is even if number & 1 = 0
 number is odd if number & 1 = 1
 */
public class BinaryGap {

	public int solution(int N) {
		int max = 0;
		int r;
		int count = -1;
		while (N > 0) {
			r = N & 1;
			if (r == 0 && count > -1) {
				count++;
			}
			if (r == 1) {
				count = 0;
			}
			if (count > max)
				max = count;
			N = N >> 1;
		}
		return max;
	}
	
//	example1 
//	example test n=1041=10000010001_2 âœ”OK
//	1. 0.004 s OK
//	â–? example2 
//	example test n=15=1111_2 âœ”OK
//	1. 0.004 s OK
//	collapse allCorrectness tests
//	â–? extremes 
//	n=1, n=5=101_2 and n=2147483647=2**31-1 âœ”OK
//	1. 0.004 s OK
//	2. 0.004 s OK
//	3. 0.004 s OK
//	â–? trailing_zeroes 
//	n=6=110_2 and n=328=101001000_2 âœ”OK
//	1. 0.004 s OK
//	2. 0.004 s OK
//	â–? power_of_2 
//	n=5=101_2, n=16=2**4 and n=1024=2**10 âœ”OK
//	1. 0.004 s OK
//	2. 0.004 s OK
//	3. 0.004 s OK
//	â–? simple1 
//	n=9=1001_2 and n=11=1011_2 âœ”OK
//	1. 0.004 s OK
//	2. 0.004 s OK
//	â–? simple2 
//	n=19=10011 and n=42=101010_2 âœ”OK
//	1. 0.004 s OK
//	2. 0.004 s OK
//	â–? simple3 
//	n=1162=10010001010_2 and n=5=101_2 âœ”OK
//	1. 0.004 s OK
//	2. 0.004 s OK
//	â–? medium1 
//	n=51712=110010100000000_2 and n=20=10100_2 âœ”OK
//	1. 0.004 s OK
//	2. 0.004 s OK
//	â–? medium2 
//	n=561892=10001001001011100100_2 and n=9=1001_2 âœ”OK
//	1. 0.004 s OK
//	2. 0.004 s OK
//	â–? medium3 
//	n=66561=10000010000000001_2 âœ”OK
//	1. 0.004 s OK
//	â–? large1 
//	n=6291457=11000000000000000000001_2 âœ”OK
//	1. 0.004 s OK
//	â–? large2 
//	n=74901729=100011101101110100011100001 âœ”OK
//	1. 0.004 s OK
//	â–? large3 
//	n=805306373=110000000000000000000000000101_2 âœ”OK
//	1. 0.004 s OK
//	â–? large4 
//	n=1376796946=1010010000100000100000100010010_2 âœ”OK
//	1. 0.004 s OK
//	â–? large5 
//	n=1073741825=1000000000000000000000000000001_2 âœ”OK
//	1. 0.004 s OK
//	â–? large6 
//	n=1610612737=1100000000000000000000000000001_2 âœ”OK
//	1. 0.004 s OK

}
