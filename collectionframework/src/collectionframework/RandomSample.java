package collectionframework;
import java.util.*;
import java.io.*;
public class RandomSample {

	public static void main(String args[])
	{
		Random r = new Random();
		
		System.out.println("Enter the size of the random array: ");
		Scanner in = new Scanner(System.in);
		while(!in.hasNextInt())
		{
			System.out.println("Not a valid input..");
			System.out.println("Expecting an integer..");
			in.next();
		}
		int arr_size = in.nextInt();
		
		int arr[] = new int[arr_size];
		for(int iterator=0; iterator<arr_size; iterator++)
		{
			arr[iterator] = r.nextInt(arr_size+50);
		}
		
		System.out.println("The random array is:");
		for(int iterator=0; iterator<arr_size; iterator++)
		{
			System.out.print(arr[iterator]+" ");
		}
	}
}
