package JavaList;

import java.util.Iterator; 
import java.util.Vector; 

public class VectorIteratorExample 
{ 
	public static void main(String[] args) 
	{ 
		Vector<Integer> v = new Vector<Integer>(); 
		v.add(20); 
		v.add(30); 
		v.add(40); 
		v.add(50); 
		v.add(60); 

		// Call iterator() method to iterate elements of vector. 
		Iterator<Integer> itr = v.iterator(); // Return type is Iterator. 
		System.out.println("Vector elements are: "); 

		// Checking the next element availability in the list. 
		while(itr.hasNext())
		{ 
			// Moving cursor to the next element. 
			Object obj = itr.next(); // Return type is Object. 
			System.out.println(obj); 

			// Adding and removing an element during iteration using iteration. It will throw ConcurrentModificationException. Since, Iterator is fail-fast in vector. 
			v.add(4, 70); 
		} 
		System.out.println("Vector list after adding elements during Iteration"); 
		System.out.println(v); 
	} 
}