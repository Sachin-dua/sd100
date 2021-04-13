
package com.tcs;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("test");
		a1.add("test2");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.addAll(a1);
		a2.add("ram");
		a2.add("67");
		
		System.out.println(a2.contains(a1)); //false
		System.out.println(a2.containsAll(a1)); // true
		a2.removeAll(a1);
		System.out.println(a2);
		System.out.println(a2.containsAll(a1));

	}

}
