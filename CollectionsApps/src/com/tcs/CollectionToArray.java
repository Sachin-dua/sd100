package com.tcs;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionToArray {

	//with generic approach
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("ram");
		a1.add("ratan");
		
		String[] str= new String[a1.size()];
		a1.toArray(str);
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		ArrayList<Integer>tt = new ArrayList<Integer>();
		tt.add(45);

	}

}

class CollectionToArrayEx2
{
	// when you have the array list with different type of data
	public static void main(String[] args) 
	{
		ArrayList a1= new ArrayList();
		a1.add("ram");
		a1.add(99);
		a1.add(12.34);
		a1.add('c');

		Object c[] = new Object[a1.size()];
		a1.toArray(c);
		
		for(Object ob:c)
		{
			System.out.println(ob);
		}
		
		
	}
}




































