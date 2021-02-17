package collectionframework;
import java.text.*;
import java.util.*;
public class DateSample {

	public static void main(String args[]) throws ParseException 
	{
		String str = "Feb 15, 2021";
		DateFormat format = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
		Date d = format.parse(str);
		
		String str1 = "Feb 17, 2021";
		DateFormat format1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
		Date d1 = format1.parse(str1);
		
		System.out.println("Date1: " + d );
		System.out.println("Date2: "+ d1 );
		if(d.compareTo(d1) < 0)
		{
			System.out.println("The Date1 happens before Date2");
		}
		else if(d.compareTo(d1) < 0)
		{
			System.out.println("The Date2 happens before Date1");
		}
		else
		{
			System.out.println("The Date1 and Date2 are same");
		}
		
		
	}
}
