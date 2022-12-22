package JavaCollection;

import java.util.*;

public class SetExample4 {
	public static void main(String[] args) 
	{ 
		// Create a generic list object of type Integer. 
		Set<String> set1 = new HashSet<String>(); 
		Set<String> set2 = new HashSet<String>(); 
		set1.add("Banana"); 
		set1.add("Orange");
		set1.add("Apple");
		
		set2.add("Banana"); 
		set2.add("Orange");
		set2.add("Mango");
		
//		set1.addAll(set2);
//		set1.add(set2);
//		set1.removeAll(set2);
//		set1.remove(set2);
//		set1.retainAll(set2);
		set2.add("Mango");
		System.out.println(set2.size()); 
	} 
}
