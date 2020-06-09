import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 
 * Problem: Sorting a HashMap by values. // So this is the problem
 * 										// We ca easily sort a map by key using tree map
 * 					// This is where we learn how to sort a map by values
 * 
 * Example: 
 * 
 * Input: //This is the input with keys and values
 * 
 * 	Key:"onething"	Value: 10
 * 	Key:"twothing"	Value: 5
 * 	Key:"threething"Value: 3
 * 	Key:"fourthing"	Value: 1
 * 	Key:"fivething"	Value: 2	
 * 	Key:"something"	Value: 4
 * 	
 * Result:	// This is the result what we wanted see how the values are sorted
 * 
 *  Key:"onething"	Value: 1
 * 	Key:"twothing"	Value: 2
 * 	Key:"threething"Value: 3
 * 	Key:"fourthing"	Value: 4
 * 	Key:"fivething"	Value: 5	
 * 	Key:"something"	Value: 10
 * 
 * */














public class map_byValue {

	public static void main(String[] args) {
		
		// Create a map
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// Populate the map with keys and values
		
		map.put("One",		6);
		map.put("Two",		5);
		map.put("Three",	4);
		map.put("Four",		3);
		map.put("Five",		2);
		map.put("Six",		1);
		
		System.out.println("Unsorted map: " + map);
		// Store the map in a list
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());
		
		
		// Sort the list using collections.sort using a comparator
		// which will help to pick each element's value and compare them
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override // This is the method which will help to compare elements by value
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		
		});
		
		
		System.out.println("Sorted Map: " + list);
		
		// The element of the map is sorted but in the list which can be extracted through
		// Map.entry and iterating through all the element and storing it in a linkedlistmap
		
		
		
	}
		
		

}
