package Exercise;

public class Prob2_x_interval_n_number {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n;i++) {
            answer[i] = (long)x;
            x += x;
        }
        return answer;
    }
}
