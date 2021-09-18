package Exercise;

public class Prob4_phone_number {
	public static void main(String[] args) {
		solution("01012345678");
	}

	private static String solution(String phone_number) {
		String answer = "";
		int length = phone_number.length();
		for(int i = 0; i < length - 4; i++) {
			answer += "*";
		}
		answer += phone_number.substring((length-4), length);
		System.out.println(answer);
		return answer;
	}
   
}


