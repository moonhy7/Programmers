package Exercise;

public class Prob7_Colats {
	public static void main(String[] args) {
		solution(16);
	}

	public static int solution(long num) {
		int count = 0;
		
		while(num != 1) {
			if(count > 500) {
				count = -1;
				break;
			} else {
				if(num % 2 == 0) {
					num /= 2;
					count++;
				} else {
					num = num * 3 + 1;
					count++;
				}
			}
		} 
		
		System.out.println(count);
        return count;
    }
}


