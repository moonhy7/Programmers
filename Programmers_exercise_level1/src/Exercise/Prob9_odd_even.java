package Exercise;

public class Prob9_odd_even {
	public static void main(String[] args) {
		solution(17);
	}

	public static String solution(int num) {
		String answer = "";
		if(num == 0) {
			answer = "Even";
		} else {
			answer = num % 2 == 0? "Even" : "Odd";
		} System.out.println(answer);	
        return answer;
    }
}


