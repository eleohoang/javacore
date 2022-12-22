package JavaList;

import java.util.ListIterator; 
import java.util.Vector; 

public class VectorListIteratorEx 
{ 
	public static void main(String[] args) 
	{ 
		Vector<String> v = new Vector<String>(); 
		v.add("a"); 
		v.add("ab"); 
		v.add("abc"); 
		v.add("abcd"); 
		v.add("abcde"); 

		// Call listIterator() method to iterate in the forward direction. 
		ListIterator<String> litr = v.listIterator(); 
		System.out.println("Traversing in Forward Direction "); 
		while(litr.hasNext())
		{ 
			Object obj = litr.next(); // Return type is Object. 
			System.out.println(obj); 
		} 
		ListIterator<String> litr1 = v.listIterator(3); // It will iterate from index position 3 in the backward direction. 
		System.out.println("Traversing in Backward Direction"); 
		while(litr1.hasPrevious())
		{ 
			System.out.println(litr1.previous()); 
		} 
	} 
}