package zhangxu.onlinetest.cod.tasks;

public class NoOfEvenPairs {
    public int solution(int[] A){
        int count = 0;
        for(int i = 0; i < A.length  ; i ++){
            for(int j = i+1; j < A.length ; j ++){
                if(((A[i] & 1) == (A[j] & 1))) count++;
            }
        }
        return count;
    }
}
