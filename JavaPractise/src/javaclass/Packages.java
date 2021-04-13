package javaclass;

public class Packages{
	
	int a = 10;
	public static int b=10;
	
	public void helloSachin() { // not accessible outside the class
		System.out.println("Good Evening");
	}
	
	public static void main (String[] args) {
		Packages p1 = new Packages();
		p1.helloSachin();
	}

}
