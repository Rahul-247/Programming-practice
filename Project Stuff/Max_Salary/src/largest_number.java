import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class largest_number {
	private static boolean isLargeOrNot(int first, int second) {
		String tempString = first+""+second;
		String temp2 = second+""+first;
		if(Integer.parseInt(tempString) > Integer.parseInt(temp2))
			return true;
		return false;
		
	}
	private static String getLarge(List<Integer> list) {
		String answer = "";
		for(int i = 1; i < list.size(); i++) {
			
			for(int j = 0; j < list.size() - i; j++) {
				
				if(!isLargeOrNot(list.get(j), list.get(j+1))) {
					Collections.swap(list, j, j + 1);
				}
			}
			
		}
		
		for(int i : list) {
			answer+= i+"";
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>(num);
		for(int i = 0; i < num; i++) {
			list.add(scanner.nextInt());
		}
		
		System.out.println(getLarge(list));

	}

}
