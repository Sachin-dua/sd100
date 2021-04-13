package com.tcs;

import java.util.Stack;

public class StackTest 
{
	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<String>();
		s.add("test");
		s.add("ratan");
		s.add("sachin");
		
		System.out.println(s);
		s.remove(0);
		s.retainAll(s);
		System.out.println(s.empty());
		System.out.println(s);
		s.add(0, "himani");
		System.out.println(s);
		System.out.println(s.capacity());
	}
	
	

}
