package zhangxu.onlinetest.cod.tasks;

public class MinDistance {
    public int solution(int[] arr) {
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = calculateDis(arr[i], arr[j]);
                minDistance =  temp < minDistance ? temp : minDistance;
            }
        }
        return minDistance;
    }

    private int calculateDis(int i, int i1) {
       return i > i1 ? i - i1 : i1-i;
    }

}
