package Exercise;

public class Prob5_harshad {
	public static void main(String[] args) {
		solution(10);
	}

	public static boolean solution(int x) {
        boolean answer = true;
        int x1 = x / 10000;
        int x2 = (x % 10000) / 1000; 
        int x3 = (x % 1000) / 100; 
        int x4 = (x % 100) / 10; 
        int x5 = x % 10; 
        int sum = x1 + x2 + x3 + x4 + x5;
        if(x % sum == (double)0) {
        	answer = true;
        	System.out.println(x + "의 모든 자릿수의 합은 " + sum +"입니다. " + x + "은 " + sum + "로 나누어 떨어지므로 " + x + "은 하샤드 수입니다.");
        } else {
        	answer = false;
        	System.out.println(x + "의 모든 자릿수의 합은 " + sum +"입니다. " + x + "은 " + sum + "로 나누어 떨어지지 않으므로 " + x + "은 하샤드 수가 아닙니다.");
        }
        return answer;
    }
   
}


