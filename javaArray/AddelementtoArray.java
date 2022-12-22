package javaArray;
import java.util.*;

public class AddelementtoArray {
	public static int[] addarr(int arr_lenght, int arr[],  int new_number) {
		int arr_add[] = new int[arr_lenght + 1];
		
		 for (int i = 0; i< arr_lenght; i++) {
			 arr_add[i] = arr[i];
		 }
		 arr_add[arr_lenght] = new_number;
		 return arr_add;
	}
	
	public static void main(String[] args) {
		   int n = 5;
		   int number = 50;
		   
		   int arr[] = {1,2,3,4,5};
		   System.out.println("Initial Array: \n"+ Arrays.toString(arr));
		   System.out.println();
		   arr = addarr(arr.length, arr, number);
		   System.out.println("Array with " + number + " added: \n"+ Arrays.toString(arr));
		   
	}
	
}
