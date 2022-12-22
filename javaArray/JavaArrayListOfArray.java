package javaArray;
import java.util.*;

public class JavaArrayListOfArray {

	public static void main(String[] args) {
		// List of String arrays
List<String[]> list = new ArrayList<String[]>();
		
		String[] arr1 = { "a", "b", "c" };
		String[] arr2 = { "1", "2", "3", "4" };
		list.add(arr1);
		list.add(arr2);
		// printing list of String arrays in the ArrayList
		for (String[] strArr : list) {
			System.out.println(Arrays.toString(strArr));
		}
		
		
		List<Integer[]> lists = new ArrayList<Integer[]>();
		Integer[] a = {1,2,3}; 
		lists.add(a);
		for (Integer[] s : lists) {
			System.out.println(Arrays.toString(s));
		}
		}
}
