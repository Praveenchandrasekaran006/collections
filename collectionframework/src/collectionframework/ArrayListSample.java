package collectionframework;
import java.util.*;
import java.io.*;
public class ArrayListSample {

	public static void main(String args[])
	{
		ArrayList arr = new ArrayList();
		
		System.out.println("List1:");
		
		arr.add(10);
		arr.add(20);
		arr.add('c');
		arr.add("praveen");
		arr.add(3.5);
		arr.add(3,4.5f);
		arr.add(null);
		arr.remove(1);
		System.out.println("The list is: "+arr);
		
		System.out.println();
		System.out.println("List2: ");
		
		
	    
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(95);
		arr1.add(27);
		arr1.add(93);
		arr1.add(54);
		arr1.add(56);
		System.out.println("The unsorted list is:  "+arr1);
		System.out.print("The Sorted list is: ");
		arr1.sort(null);
		System.out.println(arr1);
		
		arr1.clear();
		System.out.println("Clearing list2");
		System.out.println("The list2 is empty: "+ arr1.isEmpty());
		
		
		
	}
}
