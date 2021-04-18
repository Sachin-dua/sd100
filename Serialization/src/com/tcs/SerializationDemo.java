package com.tcs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.imageio.stream.FileImageOutputStream;

class Emp implements Serializable
{
	int id;
	String ename; 
	transient String password;	//preventing serialization
	
	public Emp(int id, String ename, String password) {
		super();
		this.id = id;
		this.ename = ename;
		this.password = password;
	}
	
}
public class SerializationDemo 
{
	void serialization()
	{
		try 
		{
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Emp(111,"ratan","tomandjerry785"));
		oos.close();
		System.out.println("Serialization process is completed");
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	void deserialization() throws ClassNotFoundException
	{
		try
		{
			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			//readObject return type is Object class 
			// Object o = ois.readObject();
			// but we want to access employee class so type casting is needed
			Emp e = (Emp) ois.readObject();
			System.out.println(e.id+" "+e.ename+" "+e.password);
			ois.close();
			System.out.println("Deserialization is completed");
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException 
	{
		SerializationDemo tt = new SerializationDemo();
		tt.serialization();
		tt.deserialization();
	}

}
//--------------------------------------------------------------------------------------------//
class Student implements Serializable
{
	int sid;
	String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
		
}

class Test
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(111,"ratan"));
		st.add(new Student(22,"sachin"));
		
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(st);
		oos.close();
		
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		ArrayList<Student> s =(ArrayList<Student>) ois.readObject();
		for(Student ss:s)
		{
			System.out.println(ss.sid+" "+ss.sname);
		}
		ois.close();

	}
	
}
//-------------------------------------------------------------------------------//
//Every collection class implements the cloneable and serializable interface
class ClonableTest
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ratan");
		al.add("sachin");
		
		ArrayList<String> clone = (ArrayList<String>) al.clone();
		System.out.println(clone);
		
	}
}
//-------------------------------------------------------------------------------//
//Every collection class implements the cloneable and serializable interface
// Example: Serialization/De-serialization without implementing Serializable interface
class SerializableTest
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("sachin");
		al.add("ratan");
		FileOutputStream fos = new FileOutputStream("lmn.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		
		FileInputStream fis = new FileInputStream("lmn.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<String>s =(ArrayList<String>)ois.readObject();
		System.out.println("Serialization without implements: "+s);

	}
}













