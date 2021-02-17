package collectionframework;
import java.util.*;
import java.io.*;

enum Carbrand
{
	Benz(100),Bmw(80),Mercedes(90),MG(70),Bucati(110);
	
	int price;
	Carbrand(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
}

public class Enumeration {
	public static void main(String args[])
	{
		System.out.println("The price of the carbrand "+Carbrand.Benz+" is "+Carbrand.Benz.getPrice());
		System.out.println("The price of the carbrand "+Carbrand.Bmw+" is "+Carbrand.Bmw.getPrice());
		System.out.println("The price of the carbrand "+Carbrand.Mercedes+" is "+Carbrand.Mercedes.getPrice());
		System.out.println("The price of the carbrand "+Carbrand.MG+" is "+Carbrand.MG.getPrice());
		System.out.println("The price of the carbrand "+Carbrand.Bucati+" is "+Carbrand.Bucati.getPrice());
	}
}
