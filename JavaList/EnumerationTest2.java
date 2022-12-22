package JavaList;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest2 {
	public static void main(String[] args) { 
		// Create an object of vector class using generic. 
		Vector<Integer> v = new Vector<Integer>(); 
		for(int i=0; i<=10; i++) {
			v.addElement(i); 
		} 
		System.out.println(v); 
		
		Enumeration e = v.elements(); 
		while(e.hasMoreElements()) { 
			Integer i = (Integer)e.nextElement(); // Direct type casting in one step. 
			System.out.println(i); 
		} 
		
		Enumeration en = v.elements(); 
		while(en.hasMoreElements()) { 
			Integer it = (Integer)en.nextElement(); 
			if(it % 2 == 0)
			{ 
				System.out.println(it); 
			}
		} 
	} 
}
