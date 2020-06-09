package fib_n_mod_m;

import java.util.Scanner;

public class fib_nmodm {
	
	private static long fibo(long n,long m) {
	    if (n <= 1) {
	        return n;
	    }
	    long first = 0;
	    long second = 1;
	    long temp;

	    for (long i = 1; i < n; i++) {
	        temp = (first + second) % m;
	        first = second;
	        second = temp;
	    }
	    return second;
	}//2816213588

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long m = sc.nextLong();
		
		System.out.println(fibo(num,m));
		sc.close();
	}

}
