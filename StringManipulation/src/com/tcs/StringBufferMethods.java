package com.tcs;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer str =new StringBuffer("hi how are you");
		System.out.println(str.delete(0, 2));  // last value is exclusive
		System.out.println(str.deleteCharAt(8));
		
		StringBuffer str2= new StringBuffer("SachinIT");
		System.out.println(str2.reverse());
		
		StringBuffer str3=new StringBuffer("Sachin");
		System.out.println(str3.append("Test"));  //concat() in String class 
		
		StringBuffer str4= new StringBuffer("cat");
		System.out.println(str4.insert(0, "I love my "));
		
		StringBuffer str5= new StringBuffer("cat");
		System.out.println(str5.replace(0, 3, "dog"));
		
		
		 

	}

}
