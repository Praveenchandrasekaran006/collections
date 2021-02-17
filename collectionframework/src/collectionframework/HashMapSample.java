package collectionframework;
import java.util.*;
import java.io.*;
public class HashMapSample {

	public static void main(String args[])
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("praveen", 10);
		hm.put("naveen", null);
		hm.put("adithyan", 30);
		hm.put("elon", null);
		hm.put("musk", 50);
		System.out.println(hm.toString());
		
		System.out.println("The Id of praveen is: "+hm.get("praveen"));
		
		Set<String> keys = hm.keySet();
		for(String name : keys)
		{
			System.out.println(name+" : "+hm.get(name));
		}
	}
}
