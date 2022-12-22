package javaArray;
import java.util.*;

public class AddelementtoArray2 {
	 // Function to add x in arr
    public static Integer[] addX(int n, Integer arr[], int x) {
    	// create a new ArrayList
        List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(arr));
    
        // Add the new element
        arrlist.add(x);
    
        // Convert the Arraylist to array
        arr = arrlist.toArray(arr);
    
        // return the array
        return arr;
    }
    
    // Driver code
    public static void main(String[] args)
    {
    
        int n = 10;
    
        // initial array of size 10
        Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    
        // print the original array
        System.out.println("Initial Array:\n" + Arrays.toString(arr));
    
        // element to be added
        int x = 50;
    
        // call the method to add x in arr
        arr = addX(n, arr, x);
    
        // print the updated array
        System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
    }
}
