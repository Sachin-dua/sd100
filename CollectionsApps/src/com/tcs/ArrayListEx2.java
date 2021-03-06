package com.tcs;

import java.util.ArrayList;

public class ArrayListEx2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList objs = new ArrayList();
		objs.add(new Emp(111,"ratan"));
		objs.add(new ClientTest(222,"sachin"));
		objs.add("test");
		objs.add(null);
		objs.add(10);  // we're adding the primitive data but actually it's a wrapper object 
		objs.add(10.9);
		System.out.println(objs);  // internally it calls objs.toString
		System.out.println(objs.toString());
		
		for(Object o:objs)
		{
			if(o instanceof Emp)
			{
				Emp e = (Emp)o;
				System.out.println(e.eid+" "+e.ename);
				
			}
			
			if(o instanceof ClientTest)  //type checking
			{
				ClientTest e = (ClientTest)o;   //type conversion (converting the Student class (reference) object to the Object class (reference) object. Basically, saying e=o;
				System.out.println(e.sid+" "+e.sname);
			}
			
			if(o instanceof Integer)
			{
				System.out.println(o);
			}
			
			if(o instanceof String)
			{
				System.out.println(o);
			}
			
			if(o instanceof Double)
			{
				System.out.println(o);
			}
			
			if(o ==null)
			{
				System.out.println(o);
			}
		
				
		}
		
		ClientTest s =(ClientTest)objs.get(1);
		System.out.println(s.sid+" "+s.sname );

	}

}
