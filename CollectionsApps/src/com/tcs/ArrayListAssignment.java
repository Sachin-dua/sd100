package com.tcs;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListAssignment {

}
 
class Customer
{
	int id; 
	String name;
	String addr;
	int mobile;
	public Customer(int id, String name, String addr, int mobile) 
	{
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.mobile = mobile;
	}
	
}

class DataReadingEx
{
	public static void main(String[] args) 
	{
		ArrayList<Customer> al= new ArrayList<Customer>();
		al.add(new Customer(12,"ratan","Hydrabad",787788));
		al.add(new Customer(34,"anu","Hydrabad",4535445));
		al.add(new Customer(56,"piyush","Patiala",4543));
		al.add(new Customer(90,"tom","Montreal",5654654));

		
		System.out.println("*************printing using for each loop***************");
		for (Customer customer : al) {
			
			System.out.println(customer.id+" "+customer.name+" "+customer.addr+" "+customer.mobile);
		}
		
		Customer c = al.get(1);
		System.out.println("**********printing using get method***************");
		System.out.println(c.id+" "+c.name+" "+c.addr+" "+c.mobile);
		
		ListIterator<Customer> li = al.listIterator();
		System.out.println("*************printing using list iterator***************");
		while(li.hasNext())
		{
			Customer c2 =li.next();
			System.out.println(c2.id+" "+c2.name+" "+c2.addr+" "+c2.mobile);
		}
		System.out.println("*************printing using lambda expression***************");
		
		al.forEach(s->System.out.println(s.id+" "+s.name+" "+s.addr+" "+s.mobile));
	}
}
