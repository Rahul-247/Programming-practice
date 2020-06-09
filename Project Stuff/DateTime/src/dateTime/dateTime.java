package dateTime;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class dateTime {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Date in format like: MMMM d, yyyy");
		String datetime = br.readLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(datetime,formatter);
		
		System.out.println(date);
		String dateString = date.toString();
		String[] datesplitStrings = dateString.trim().split("\\s+");
		System.out.println(Arrays.toString(datesplitStrings));
	}

}
