import java.util.Scanner;

public class lcm {
	
	private static Scanner scanner;

	static long gcd(long a, long b) {
		if(b == 0) return a;
		
		return gcd(b, a%b);
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long gcd = gcd(a, b);
		System.out.println((a*b)/gcd);

	}

}
