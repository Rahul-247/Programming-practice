import java.util.Scanner;

/**
 * @author Pro Bono
 *
 *	Input: 4 	// We take this as number of rows we wanted to print
 *
 *
 *
 * 	Output: 	// this is the output we want
 * 			*
 * 		  *   *
 * 		*   *   *
 * 	  *   *    *   *	// here you can see that there are two triangles
 * 					
 * 						// one is the triangle of stars
 * 						// other one is triangle of spaces
 * 
 * 	// now we know that we need two for loop inside a for loop
 * 
 * 	// lets start..
 *
 *
 *
 *
 */
public class Patterns {
	
	private static Scanner scanner;

	static void printPattern(int num) { // function to print the pattern
		
		for(int i = 0; i <= num; i++) {
			
			for(int spaces = num; spaces > i; spaces--) 	// This for loop will print the triangle of spaces
				System.out.print(" ");	
			
			for(int j = 0; j < i; j++)	// This for loop will print the triangle of stars
				System.out.print("*"+" ");
			
			System.out.println();
		}
	
	}
	
	public static void main(String[] args) { 
		scanner = new Scanner(System.in);
		int num = scanner.nextInt();		
		printPattern(num);					// function call
		

	}

}
		
