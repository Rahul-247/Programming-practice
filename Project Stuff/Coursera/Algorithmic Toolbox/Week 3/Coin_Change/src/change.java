import java.util.Scanner;

public class change {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		long num = sc.nextLong();
		int count = 0;
		while(num > 0) {
			
			if(num >= 10) {
				num -= 10;
				count++;
			}else if(num >= 5) {
				num -= 5;
				count++;
			}else {
				num -= 1;
				count++;
			}
				
		}
		System.out.println(count);
		

	}

}
