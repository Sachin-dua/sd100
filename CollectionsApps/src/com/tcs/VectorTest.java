package com.tcs;

import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>();
		System.out.println(v.capacity());
		v.capacity();
		v.add("ram");
		v.add("ratan");
		System.out.println(v.capacity());
		
		System.out.println(v);
		
		
		Vector<String> v2 = new Vector<String>(3);
		System.out.println(v2.capacity()); //3
		v2.add("ram");
		v2.add("ratan");
		v2.add("anu");
		
		//when you insert the fourth element capacity will be doubled 
		v2.add("test");
		System.out.println(v2.capacity()); //6
		
		System.out.println(v2);
		
		Vector<String> v3 = new Vector<String>(2,6);
		System.out.println(v3.capacity()); //2
		v3.add("ram");
		v3.add("ratan");
		System.out.println(v3.capacity()); //2
		
		//when you insert the third element capacity will increase to 8(2+6)
		v3.add("anu");
		System.out.println(v3.capacity()); //8
		
		System.out.println(v3);
		
		
		
	}


}
