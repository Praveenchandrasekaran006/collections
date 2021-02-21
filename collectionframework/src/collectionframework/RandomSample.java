package collectionframework;
import java.util.*;
import java.lang.*;
import java.io.*;
public class RandomSample {

	public static void main(String args[])
	{
		Random a = new Random();
		
		System.out.println("Enter the size of the random array: ");
		Scanner in = new Scanner(System.in);
		while(!in.hasNextInt())
		{
			System.out.println("Not a valid input..");
			System.out.println("Expecting an integer..");
			in.next();
		}
		int arr_size = in.nextInt();
		int max = arr_size/2;
		
		int arr[] = new int[arr_size];
		for(int iterator=0; iterator<arr_size; iterator++)
		{
			arr[iterator] = a.nextInt(arr_size/2);
		}
		
		System.out.println("The random array is:");
		for(int iterator=0; iterator<arr_size; iterator++)
		{
			System.out.print(arr[iterator]+" ");
		}
	}
}
//1 to 5 random
//other than random
// random values even distribution 