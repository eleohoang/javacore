package JavaCollection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapEx1 {
	public static void main(String[] args) 
	{
		// Create a HashMap.	
		HashMap<String, String> hmap = new HashMap<>();

		String s1 = new String("R");
		String s2 = new String("R");

		// Adding entries in HashMap.
		hmap.put(s1, "Red");
		hmap.put(s2, "Red");

		System.out.println("Keys present in HashMap hmap: " +hmap.keySet());
		System.out.println("Values present in HashMap hmap: " +hmap.values());

		// Create a IdentityHashMap object.
		IdentityHashMap<String, String> ihmap = new IdentityHashMap<>();
		ihmap.put(s1, "Red");
		ihmap.put(s2, "Red");
		
		//it will be only 1 key-value: R- Red
		//==> just Object is accepted
//		ihmap.put("R", "Red"); 
//		ihmap.put("R", "Red");

		System.out.println("\n");  
		System.out.println("Keys present in IdentityHashMap: " +ihmap.keySet());
		System.out.println("Values present in IdentityHashMap: " +ihmap.values());
	}
}
