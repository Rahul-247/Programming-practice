import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class dot_product {

	static long dotProduct(int[] arr1, int[] arr2, int size) {
		long sum = 0;
		
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		
		for(int i = 0; i < size; i++) {
			sum += (long)arr1[i]*arr2[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++)
			arr1[i] = scanner.nextInt();
		
		for (int i = 0; i < n; i++)
			arr2[i] = scanner.nextInt();
		
		System.out.println(dotProduct(arr1, arr2, n));

	}

}
