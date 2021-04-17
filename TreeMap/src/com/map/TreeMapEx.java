package com.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,String> tp = new TreeMap<Integer,String>();
		tp.put(11, "sachin");
		tp.put(2,"ratan");
		
		Set<Integer> i = tp.keySet();
		System.out.println(i);
		
		Collection<String> s = tp.values();
		System.out.println(s);
		
		Collection<Entry<Integer,String>>e=tp.entrySet();
		System.out.println(e);
		
		Iterator<Entry<Integer,String>>itr = e.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer,String>ee=itr.next();
			System.out.println(ee.getKey()+" "+ee.getValue());
		}
	
	}
}

//Constructor-2
class TreeMapEx2
{
	public static void main(String[] args) {
		TreeMap<Integer,String> tp = new TreeMap<Integer,String>();
		tp.put(11, "sachin");
		tp.put(2,"ratan");
		
		TreeMap<Integer,String> tp2 = new TreeMap<Integer,String>(tp);
		tp2.put(67, "uma");
		
		Set<Integer> keys = tp.keySet();
		System.out.println(keys);
		
		Collection<String> s = tp.values();
		System.out.println(s);
		System.out.println(tp2.entrySet());
	}
}
//Constructor-3 Lambda expression
class TreeMapEx3
{
	public static void main(String[] args) {
		TreeMap<Integer,String> tp = new TreeMap<Integer,String>((n1,n2)-> -n1.compareTo(n2));
		tp.put(11, "sachin");
		tp.put(2,"ratan");
		
		Set<Entry<Integer,String>> ss = tp.entrySet();
		System.out.println(ss);
	}
}

class TreeMapEx4
{
	public static void main(String[] args) {
		TreeMap<Integer,String> tp = new TreeMap<Integer,String>();
		tp.put(11, "sachin");
		tp.put(2,"ratan");
		
		TreeMap<Integer,String> tp2 = new TreeMap<Integer,String>();
		tp2.putAll(tp);
		tp2.put(15, "ram");
		tp2.put(2,"mohan"); //duplicate value will be ignored 
		
		Set<Entry<Integer,String>> ss = tp2.entrySet();
		System.out.println(ss);
		
	}
}
//Constructor 4
//Sorted Map

class TreeMapEx5
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> tp = new TreeMap<Integer,String>();
		tp.put(11, "sachin");
		tp.put(2,"ratan");
		tp.put(15, "ram");
		tp.put(28,"mohan");
		tp.put(19, "polly");
		tp.put(90,"dolly");
		
		SortedMap<Integer,String>sm = tp.subMap(2, 28);
		System.out.println(sm); //[2=ratan, 11=sachin, 15=ram, 19=polly]
		
		SortedMap<Integer,String>sm2 = tp.headMap(15);
		System.out.println(sm2); //{2=ratan, 11=sachin}
		
		SortedMap<Integer,String>sm3 = tp.tailMap(15);
		System.out.println(sm3); // {15=ram, 19=polly, 28=mohan, 90=dolly}
		
		System.out.println("Unused");
		

	}
}