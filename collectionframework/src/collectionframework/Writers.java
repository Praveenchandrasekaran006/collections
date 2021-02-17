package collectionframework;
import java.util.*;
import java.io.*;
public class Writers {

	public static void main(String args[]) throws IOException
	{
		String str = "hai im praveen";
		FileWriter fr = new FileWriter("temp.txt");
		BufferedWriter br = new BufferedWriter(fr);
		br.write(str);
		br.close();
		
	}
}
