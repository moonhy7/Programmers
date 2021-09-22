package Exercise;

public class Prob1_N_LCM {
	public static void main(String[] args) {
		int[] arr1 = {2,4,6,8,12};	
		solution(arr1);
	}


	// 최대공약수 구하는 메소드
	public static int gcd(int x, int y) {
		int result = x % y == 0 ? y : gcd(y, x % y);
		return result;
	}

	// 최소공배수 구하는 메소드
	public static int lcm(int x, int y) {
		int result = x * y / gcd(x, y);
		return result;
	}

	public static int solution(int[] arr) {
		int answer = arr[0];
		for(int i = 1; i < arr.length; i++) {
			answer = lcm(answer, arr[i]);
		}
		System.out.println(answer);
		return answer;
	}
}


