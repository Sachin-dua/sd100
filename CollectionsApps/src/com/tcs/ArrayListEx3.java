package com.tcs;

import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.function.Consumer;

public class ArrayListEx3 {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int val1 = scanner.nextInt();
		System.out.println("Enter the second value: ");
		double val2 = scanner.nextDouble();
		System.out.println("Enter the third value: ");
		String val3 = scanner.next();		
		ArrayList al = new ArrayList();
		al.add(val1);
		al.add(val2);
		al.add(val3);
		
		System.out.println(al);
	}

}
//----------------------------------------------------------------------------------------------------------------------//
//Taking 5 inputs from the end user and storing into the arraylist
class ArrayListEx4
{
public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
	for(int i=0;i<=5;i++)
	{
		
		System.out.println("Enter the" +i+ "value");
		al.add(scanner.nextInt());
	
	}
	System.out.println(al);
	}
}
//----------------------------------------------------------------------------------------------------------------------//
// Taking multiple values from end user at a time with space 10 20 30 40 50 store into the ArrayList
class ArrayListEx5
{
	public static void main(String[] args) {
		try(Scanner scanner= new Scanner(System.in))
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			System.out.println("Enter the values: ");
			
			while(scanner.hasNextInt())  // loop while continue until the scanner has an integer value
			{
				al.add(scanner.nextInt());
			}
			al.remove(3);
			
			System.out.println(al);
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
//----------------------------------------------------------------------------------------------------------------------//
// adding 10 copies without using for loop
class ArrayListEx6
{
	public static void main(String[] args) {
		try
		{
			ArrayList<Integer> al = new ArrayList<Integer>(Collections.nCopies(10, 10));
			System.out.println(al);  //10 10 10 10 10 10 10 10 10 10
	
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------//
// swapping the data
class ArrayListEx7
{
	public static void main(String[] args) {
		try
		{
			ArrayList<String> al = new ArrayList<String>();
			al.add("ratan");
			al.add("anu");
			al.add("naresh");
			System.out.println("Before swapping: "+al);  
			Collections.swap(al, 0, 2);
			System.out.println("After swapping: "+al);
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
//----------------------------------------------------------------------------------------------------------------------//
class ArrayListEx8
{
	public static void main(String[] args) 
	{
		ArrayList<Books> bb= new ArrayList<Books>();
		bb.add(new Books(12,"sad",56.90));
		bb.add(new Books(23,"Eat that frog",99.99));
		for(Books bb1:bb)
		{	
			System.out.println(bb1.bid+" "+bb1.bname+" "+bb1.price);
		}
		
	}
}
//----------------------------------------------------------------------------------------------------------------------//

//How to read data using cursors:
// Enumeration
//Iteration with type casting
class ArraListEx9
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("ratan");
		arrList.add("anu");
		arrList.add("shamu");
		
		Iterator iterator  = arrList.iterator();
		
		while(iterator.hasNext())
		{
		 String str = (String)iterator.next();
		 System.out.println(str);
		 
		}
	}
	
}
//----------------------------------------------------------------------------------------------------------------------//

//How to read data using cursors:
//Enumeration
//Iteration without type casting
class ArraListEx10
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("ratan");
		arrList.add("anu");
		arrList.add("shamu");
		
		Iterator<String> iterator  = arrList.iterator();
		
		while(iterator.hasNext())
		{
		 String str = iterator.next();
		 System.out.println(str);
		 
		}
	}
	
}

//----------------------------------------------------------------------------------------------------------------------//
//How to read data using cursors:
//Enumeration
//List Iterator without type casting
class ArraListEx11
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("ratan");
		arrList.add("anu");
		arrList.add("shamu");
		
		ListIterator<String> iterator  = arrList.listIterator();
		
		while(iterator.hasNext())
		{
		 String str = iterator.next();
		 System.out.println(str);
		}
		 System.out.println("***************************");
		
		while(iterator.hasPrevious())
		{
		 String str = iterator.previous();
		 System.out.println(str);
		 
		}
	}
	
}
//----------------------------------------------------------------------------------------------------------------------//
//How to read data using cursors:
//Enumeration
//Lambda Expression

class ArrayListEx12
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("test");
		al.add("anu");
		al.add("sadad");
		
		//forEach Method 1
		al.forEach(new Consumer<String>() 
		{

			@Override
			public void accept(String t) {
			System.out.println(t);   //test
									//anu
								//sadad
			
			}
			
		});
		//forEach Method 2
		System.out.println("********Lambda Expression************");
		al.forEach((s)->System.out.println(s));//test
											//anu
											//sadad
		
		//forEach Method 3
		System.out.println("*********Method Refrence(Lamda)************");
		
		//method reference
		al.forEach(System.out::println); //test
										//anu
										//sadad
	}
}

//----------------------------------------------------------------------------------------------------------------------//
class ArrayListEx13
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("test");
		al.add("anu");
		al.add("sadad");
		al.forEach(new Consumer<String>()
		{
			@Override
			public void accept(String t) 
			{
				System.out.println(t);

			}
		});
	}
}
