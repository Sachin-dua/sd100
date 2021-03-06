package com.tcs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RemoveElement {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("ratan");
		al.add("sonu");
		al.add("yello");
		al.add("adam");
		
		ListIterator<String> li = al.listIterator();
		li.add("sraya");
		
		while(li.hasNext()) 
		{
			String c = li.next();
			if(c.equals("yello"))
			{
				li.remove();
			}
			
			if(c.equals("adam"))
			{
				li.set("test");
			}
		}
		
		System.out.println(al);

	}

}

class Student
{
	int id;
	String name;
	String city;
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
}

 class RemoveElementEx2 {

	public static void main(String[] args) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(56,"anu","barnala"));
		al.add(new Student(45,"sanu","california"));
		al.add(new Student(78,"ratan","patiala"));
		al.add(new Student(5,"rohit","hyderabad"));
		
		
		Iterator<Student> itr = al.iterator();
		
		while(itr.hasNext())
		{
			Student s = itr.next();
			System.out.println(s.id+" "+s.name+" "+s.city);
			
		}

	}

}
 
 class PractiseTest
 {
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
 
 
