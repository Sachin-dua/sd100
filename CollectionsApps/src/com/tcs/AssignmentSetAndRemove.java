package com.tcs;

import java.util.ListIterator;
import java.util.Vector;

public class AssignmentSetAndRemove {

}

class Book
{
	int id;String name;String author; double price;
	Book(int id,String name,String author, double price)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
	}
}

class Assignment 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book(23,"test","ram",17.89);
		Book b2 = new Book(24,"hum","rohit",7.89);
		Book b3 = new Book(25,"tum","ramesh",15.99);
		Book b4 = new Book(26,"perry","ratan",21.39);
		Book b5=  new Book(27,"newBook","rajesh",24);


		Vector<Book> v = new Vector<Book>();
		v.add(b1);
		v.add(b2);
		v.add(b3);
		v.add(b4);
	

		v.set(0, b5);
		


		ListIterator<Book> li = v.listIterator();

		while(li.hasNext())
		{
			Book book = li.next();
			if(book.equals(b2))
			{
				li.remove();
			}
			else
			{	
				System.out.println(book.id+" "+book.name+" "+book.author+" "+book.price);
			}

		}
	}
}
