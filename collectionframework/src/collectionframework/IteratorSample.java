package collectionframework;
import java.util.*;
import java.io.*;
public class IteratorSample {
	public static void main(String args[]) throws Exception
	{
		ArrayList<Integer> v = new ArrayList<Integer>();
			
		v.add(10);
		v.add(20);
		v.add(60);
		v.add(30);
		v.add(40);
		
		Iterator<Integer> iterator = v.iterator();		
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
