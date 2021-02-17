package collectionframework;
import java.io.*;
import java.util.*;
public class HashTableSample {
	
	public static void main(String args[])
	{
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("praveen", 10);
		ht.put("naveen", 20);
		ht.put("adithyan", 30);
		ht.put("elon", 40);
		ht.put("musk", 50);
		
		System.out.println("The Id of praveen is: "+ht.get("praveen"));
		Set<String> keys = ht.keySet();
		
		for(String name : keys)
		{
			System.out.println(name+" : "+ht.get(name));
		}
	}

}
