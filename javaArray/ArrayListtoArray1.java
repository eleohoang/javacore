package javaArray;

import java.util.*;

public class ArrayListtoArray1 {
	 public static void main(String[] args)
	    {
		 List<Integer> al = new ArrayList<Integer>();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 
		 Object[] ob = al.toArray();
		 
		 for (Object i:ob) {
			 System.out.print(i + " ");
		 }
		 
		 System.out.println();
		 
		Integer[] it = new Integer[al.size()];
		it = al.toArray(it);
		for (Integer i : it) {
			System.out.print(i+" ");
		}
		 
	    }
}
