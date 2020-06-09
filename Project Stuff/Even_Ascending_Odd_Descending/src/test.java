import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 */

/**
 * @author Pro Bono
 *
 * 
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {12, 67, 1, 34, 9, 78, 6, 31};
		
		Arrays.sort(arr, new Comparator<Object>() {
			
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Integer x = (Integer) o1;
				Integer y = (Integer) o2;
				
				int mod1 = Math.abs(x%2);
				int mod2 = Math.abs(y%2);
				System.out.println(mod1 +" "+ mod2);
				return ((mod1 == mod2) ? ((mod1 == 0)? x.compareTo(y): y.compareTo(x)):(mod1 < mod2)? -1 : 1);
			}
			
		});
		
		System.out.println(Arrays.toString(arr));

	}

}
