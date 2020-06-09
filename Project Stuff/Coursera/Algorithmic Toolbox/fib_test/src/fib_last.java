import java.util.Scanner;

public class fib_last {
	
	private static Scanner sc;

	private static int fibo(int n) {
	    if (n <= 1) 
	        return n;
	    
	    int first = 0;
	    int second = 1;
	    int temp;

	    for (int i = 1; i < n; i++) {
	        temp = (first + second) % 10;
	        first = second;
	        second = temp;
	    }
	    return second;
	}

	public static void main(String args[]){
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fibo(num));
	}
}

