import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** @author Pro Bono
 * 
 * 
 * 	Hey guys today we gonna solve the hackerrank's Identify Comment problem
 * 	
 * 	Input will be source code written in C or C++ or Java
 * 
 * 	we need to output the comment in that source code.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *	Input: 									This is the input
 *				// my  program in C++		this is comment
 *
 *				#include <iostream>
 *				/** playing around in
 *					a new programming language /
 *				
 *				using namespace std;
 *
 *				int main ()
 *				{
 *					cout << "Hello World";
 *					cout << "I'm a C++ program"; //use cout
 *					return 0;
 *				}
 *	Output: 								We need to output this.
 *			// my  program in C++
 *			/** playing around in
 *					a new programming language /
 *			//use cout
 *
 *			Lets start...
 *
 *
 *
 *
 *
 *
 *
 *
 * 
 */
public class Identify_comments {
	
	static void identify_Comments() {
		Scanner scanner = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		String regexBuilder = "(?:/\\\\*(?:[^*]|(?:\\\\*+[^*/]))*\\\\*+/)|(?://.*)"; // The explaination for this
																						// is in the discription
		
		while(scanner.hasNextLine()) {
			builder.append(scanner.nextLine().trim());
			builder.append("\n");	// append this to identify next line i.e where the line is breaking
		}
		
		String textString = builder.toString();
		Pattern pattern = Pattern.compile(regexBuilder);
		Matcher matcher = pattern.matcher(textString);
		while(matcher.find()) System.out.println(matcher.group());
	}


	public static void main(String[] args) {
		
		identify_Comments();

	}

}
