package com.test;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(56, "ratan");
		h.put(57, "ramesh");
		h.put(58, "ram");

		System.out.println(h.entrySet());

		Collection<Entry<Integer, String>> ss = h.entrySet();
		Iterator<Entry<Integer, String>> itr = ss.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>(h);
		h2.put(89, "we");
		System.out.println(h2);
		System.out.println(h2.size());
		System.out.println(h2.contains("ram"));
		System.out.println(h2.get(56));
		System.out.println(h2.get(78)); //null
		System.out.println(h2.containsKey(58));
		System.out.println(h2.isEmpty());
		h2.clear();
		System.out.println(h2.isEmpty());
		System.out.println(h2);
	}

}

class HashTableEx2 extends HashTableEx
{
	public static void main(String[] args) 
	{
		
		
		
	}
}
