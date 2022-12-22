package JavaList;

import java.util.*;

public class VectorEnumerationEx {
	public static void main(String[] args) 
	{ 
		// Create vector object of type String. 
		Vector<String> v = new Vector<String>(); 

		// Adding elements to vector using add() method of vector class. 
		v.add("A"); // Adding element at index 0.
		v.add("B"); // Adding element at index 1.
		v.add("C"); // Adding element at index 2.
		v.add("D"); // Adding element at index 3.
		v.add("E"); // Adding element at index 4.

		// Call elements() method to iterate vector. 
		Enumeration<String> en = v.elements(); // Return type is Enumeration. 
		System.out.println("Vector elements are: "); 

		// Checking the next element availability using reference variable en in the while loop. 
		while(en.hasMoreElements())
		{ 
			// Moving cursor to the next element. 
			Object obj = en.nextElement(); // Return type is Object. 
			System.out.println(obj); 

			// Adding and removing an element during iteration using Enumeration. 
			// Enumeration is fail-safe in a vector. So, it will not throw any exception. 
			v.removeElementAt(4); 
			v.add(4, "G"); 
		} 
		System.out.println("Vector list after adding elements during Iteration"); 
		System.out.println(v); 
	} 
}
