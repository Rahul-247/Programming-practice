import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
     static String getBalanced(String str){
         Stack<Character> stack = new Stack<Character>();
         
	        for(int i = 0; i < str.length(); i++){
	            
	            if(str.charAt(0) == '}' || str.charAt(0) == ')' || str.charAt(0) == ']') 
	                return "not balanced";
	                
	            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '['){
	                stack.push(str.charAt(i));
	            }
	            else {
	                stack.pop();
	            }
	        }
	        if(stack.empty()) return "balanced";
	        else return "not balanced";
     }
     
	public static void main (String[] args) throws EmptyStackException
	 {
	 //code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    sc.next();
	    while(t-->0){
	     String str = sc.nextLine();   
	       System.out.println(getBalanced(str)); 
	    }
	 }
}