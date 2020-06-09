import java.util.Scanner;

public class fibonacci_sum_of_squares {
	
	static int[] last_digit_square = {0, 1, 1, 4, 9, 5, 4, 9, 1, 6,
									  5, 1, 6, 9, 9, 0, 9, 9, 6, 1, 
									  5, 6, 1, 9, 4, 5, 9, 4, 1, 1, 
									  0, 1, 1, 4, 9, 5, 4, 9, 1, 6, 
									  5, 1, 6, 9, 9, 0, 9, 9, 6, 1, 
									  5, 6, 1, 9, 4, 5, 9, 4, 1, 1};
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		num = num % 60;
		int res = 0;
		for(int i = 1; i <= num; i++) {
			res += last_digit_square[i];
		}
		System.out.println(res % 10);
	}

}
