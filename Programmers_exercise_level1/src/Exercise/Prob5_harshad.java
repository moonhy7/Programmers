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
        	System.out.println(x + "�� ��� �ڸ����� ���� " + sum +"�Դϴ�. " + x + "�� " + sum + "�� ������ �������Ƿ� " + x + "�� �ϻ��� ���Դϴ�.");
        } else {
        	answer = false;
        	System.out.println(x + "�� ��� �ڸ����� ���� " + sum +"�Դϴ�. " + x + "�� " + sum + "�� ������ �������� �����Ƿ� " + x + "�� �ϻ��� ���� �ƴմϴ�.");
        }
        return answer;
    }
   
}


