package com.tcs;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListCons {

	public static void main(String[] args) 
	{	
		ArrayList<String> al = new ArrayList<String>();
		al.add("ramu");
		al.add("sonu");
		al.add("ram");
		ListIterator<String> li = al.listIterator();	
		while(li.hasNext()) 
		{
			String c = li.next();
			if(c.equals("sonu"))
			{
				li.remove();
			}
			
			if(c.equals("ramu"))
			{
				li.set("test");
			}
		}
		li.add("sraya");
		System.out.println(al); //test,ram,sraya
		
		// adding ArrayList1 data into ArrayList2
		ArrayList<String> al2= new ArrayList<String>(al);
		al2.add("sham");
		System.out.println(al2.get(0)); //test
		}
	}

class AddCollection
{
	public static void main(String[] args) 
	{
		// Approach 1: Constructor approach
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("surrey");
		a1.add("hope");
		
		ArrayList<String> a2= new ArrayList<String>(a1);
		a2.add("montreal");
		a2.add("toronto");
		
		System.out.println(a2); //[surrey, hope, montreal, toronto]		
		
	}
}

class AddCollectionApproch2
{
	public static void main(String[] args) 
	{
		// Approach 2: addAll() method approach
		//to add more than one collections
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("surrey");
		a1.add("hope");
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("montreal");
		a2.add("toronto");
		
		ArrayList<String> a3= new ArrayList<String>();
		a3.addAll(a1);
		a3.addAll(a2);
		a3.add("calgary");
		a3.add("vancouver");  
		
		System.out.println(a3); //[surrey, hope, montreal, toronto, calgary, vancouver]	
	}
}
