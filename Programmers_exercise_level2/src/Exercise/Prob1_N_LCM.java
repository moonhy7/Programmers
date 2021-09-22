package Exercise;

public class Prob1_N_LCM {
	public static void main(String[] args) {
		int[] arr1 = {2,4,6,8,12};	
		solution(arr1);
	}


	// �ִ����� ���ϴ� �޼ҵ�
	public static int gcd(int x, int y) {
		int result = x % y == 0 ? y : gcd(y, x % y);
		return result;
	}

	// �ּҰ���� ���ϴ� �޼ҵ�
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


