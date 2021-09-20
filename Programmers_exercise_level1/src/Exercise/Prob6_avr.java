package Exercise;

public class Prob6_avr {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		solution(arr1);
	}

	 public static double solution(int[] arr) {
	    double sum = 0;
	    
	    for(int i=0; i < arr.length; i++) {
	    	sum += arr[i];
	    } System.out.println(sum / arr.length);
	    return sum / arr.length;
	 }
}


