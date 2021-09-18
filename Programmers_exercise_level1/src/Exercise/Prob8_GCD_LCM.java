package Exercise;

public class Prob8_GCD_LCM {
	public static void main(String[] args) {
		solution(24, 36);
	}

	public static long[] solution(long n, long m) {
		long[] answer = new long[2];
        int GCD = 1;
        for(int i = 2; i <= Math.min(n, m); i++) {
        	while(n % i == 0 && m % i == 0) {
        		n /= i;
        		m /= i;
        		GCD *= i;
        	}
        }
        answer[0] = GCD;
        answer[1] = GCD * n * m;
        return answer;
    }
}


