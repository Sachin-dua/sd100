import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapEx1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h = new HashMap<Integer,String>(); 
		h.put(111, "ratan");
		h.put(89, "sachin");
		h.put(57, "sravya");
		
		//printing the keys
		System.out.println(h.keySet());
		
		//printing the values
		System.out.println(h.values());
		
		
		System.out.println(h);
		
		
		//Set<Entry<Integer,String>> ss = h.entrySet();
		
		Iterator<Entry<Integer,String>> itr = h.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer,String>e=itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}

