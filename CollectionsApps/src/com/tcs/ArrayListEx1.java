package com.tcs;

import java.util.ArrayList;

public class ArrayListEx1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList objs = new ArrayList();
		objs.add("test");
		objs.add(null);
		objs.add(10);  // we're adding the primitive data but actually it's a wrapper object 
		objs.add(10.9);
		System.out.println(objs);  // internally it calls objs.toString
		System.out.println(objs.toString());

	}

}
