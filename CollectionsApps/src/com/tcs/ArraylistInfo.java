package com.tcs;

import java.util.ArrayList;

public class ArraylistInfo {
	public static void main(String[] args) {
		
		// adding an array list to another array list
		
		// Constructor approach
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(100);
		
		ArrayList a2 = new ArrayList(a1);
		a2.add(90);
		a2.add(150);
		
		for (Object object : a2) 
		{
			System.out.println(object);
		}
		
	// adding an array list to another array list
		
		// addAll() approach
		ArrayList a3 = new ArrayList();
		a3.add(10);
		a3.add(100);
		
		ArrayList a4 = new ArrayList(a1);
		a4.add(90);
		a4.add(150);
		
		ArrayList a5= new ArrayList();
		a5.addAll(a3);
		a5.addAll(a4);
		a5.add("anu");
		
		System.out.println(a5);
	}

}
