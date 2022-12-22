package JavaList;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class SynArrayListUsingCOWA {
	public static void main(String[] args) 
	{ 
		// Create a thread-safe ArrayList. 
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>(); 
		al.add("Pen"); 
		al.add("Pencil"); 
		al.add("Copy"); 
		al.add("Eraser"); 
		al.add("Shapner"); 
		System.out.println("Displaying synchronized ArrayList "); 

		// Synchronized block is not required in this method. 
		Iterator<String> itr = al.iterator(); 
		while(itr.hasNext()) 
		{  
			String str = itr.next(); 
			System.out.println(str); 
		} 
	} 
}
