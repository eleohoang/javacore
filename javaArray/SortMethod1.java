package javaArray;
import java.util.Arrays;

public class SortMethod1 {
	public static void main(String[] args) 
    { 
        //define an array
        int[] intArray = {52, 45, 32, 64, 12, 87, 78, 98, 23, 7}; 
 
        System.out.printf("Original Array : "+ Arrays.toString(intArray)); 
 
        Arrays.sort(intArray); 
 
        System.out.printf("\n\nSorted Array "+ Arrays.toString(intArray)); 
    } 
}
