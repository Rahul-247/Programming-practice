import java.util.Scanner;

public class fibonacci_partial_sum {

    static int[] last_digit = {0, 1, 1, 2, 3, 5, 8, 3, 1, 4, 
                              5, 9, 4, 3, 7, 0, 7, 7, 4, 1, 
                              5, 6, 1, 7, 8, 5, 3, 8, 1, 9, 
                              0, 9, 9, 8, 7, 5, 2, 7, 9, 6, 
                              5, 1, 6, 7, 3, 0, 3, 3, 6, 9, 
                              5, 4, 9, 3, 2, 5, 7, 2, 9, 1};
    
	private static Scanner scanner;
	
	static int partial_sum(long low, long high) {
		int res = 0;
		if(low == high) return last_digit[(int) (low%60)];
		else {	
			if((int) (low%60) > (int) (high%60)) {
				for(int i = 0; i < (int) (high%60); i++) {
					res += last_digit[i];
					
				}
			}else {
				for(int i = (int) (low%60); i <= (int) (high%60); i++) {
					res += last_digit[i];
					//System.out.println(last_digit[i]+" ");
				}
			}
		}
		return res%10;
	}
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		long first = scanner.nextLong();
		long second = scanner.nextLong();
		
		System.out.println(partial_sum(first, second));

	}

}
