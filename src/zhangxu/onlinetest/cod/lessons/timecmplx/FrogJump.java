package zhangxu.onlinetest.cod.lessons.timecmplx;

public class FrogJump {

	
	public static int solution(int X, int Y, int D){
		int count = 0;
		while((X + count * D) < Y){
			count++;
		}
		return count;
	}
}
