import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;


public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hh = new LinkedHashMap<Integer,String>();
		hh.put(112,"paul");
		hh.put(90, "ben");
		hh.put(34, "rahul");
		hh.put(34, "test");
		
		Collection<Integer> s = hh.keySet();
		System.out.println(s);
		
		Collection<String> t = hh.values();
		System.out.println(t);
		
		Collection<Entry<Integer,String>> ss = hh.entrySet();
		
		Iterator<Entry<Integer,String>>itr = ss.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer,String> e= itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}

class Emp
{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}

class Student
{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

class HashMapEx2
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Emp,Student> hp = new LinkedHashMap<Emp,Student>();
		hp.put(new Emp(111,"ratan"), new Student(45,"anu"));
		hp.put(new Emp(112,"ram"), new Student(44,"puha"));
		
		Set<Entry<Emp,Student>> ss = hp.entrySet();
		
		// for map we can not use hp.iterator directly
		// we first need to store the data
		Iterator<Entry<Emp,Student>> itr = ss.iterator();
		
		while(itr.hasNext())
		{
			Entry<Emp,Student> e=itr.next();
			Emp ee = e.getKey();
			System.out.println(ee.id+" "+ee.name);
			
			Student s = e.getValue();
			System.out.println(s.id+" "+s.name);
		}
	}
}
















