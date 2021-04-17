package com.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(11, "ratan");
		tm.put(66,"ram");
		
		System.out.println(tm);
		
		Set<Entry<Integer,String>>s = tm.entrySet();
		System.out.println(s);
		
		Iterator<Entry<Integer,String>> itr = s.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer,String> e = itr.next();
			Integer i = e.getKey();
			System.out.println(i);
			
			String ss = e.getValue();
			System.out.println(ss);
			
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}
	
}
