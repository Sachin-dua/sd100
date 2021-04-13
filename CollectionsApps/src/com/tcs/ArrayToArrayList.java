package com.tcs;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList 
//Arrays to Collection
{
	public static void main(String[] args) 
	{
		String[] str = {"ram","ratan","anu"};
		
		ArrayList<String>a1 = new ArrayList<String>(Arrays.asList(str));
		a1.add("sham");
		System.out.println(a1);
		a1.forEach(s->System.out.println(s));
		a1.forEach(System.out::println);
	}
	
}
