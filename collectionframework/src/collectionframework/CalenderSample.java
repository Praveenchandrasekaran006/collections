package collectionframework;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class CalenderSample {

	public static void main(String args[])
	{
		SimpleDateFormat d = new SimpleDateFormat();
		Calendar c = Calendar.getInstance();
		
		System.out.println("The current Year is: "+c.get(Calendar.YEAR));
		System.out.println("The current Month is: "+(c.get(Calendar.MONTH)+1));
		System.out.println("The Current Date is: "+c.get(Calendar.DATE));
		System.out.println("The time is: "+c.getTime());
		System.out.println(d.format(c.getTime()));
		
	}
}
