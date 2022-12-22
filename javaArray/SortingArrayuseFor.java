package javaArray;

public class SortingArrayuseFor {
	 public static void main(String[] args) {        
	        //define original array     
		 int[] arr = new int[] {52,45,32,64,12,87,78,98,23,7};
		 int temp = 0;
	        //print original array  
		 	System.out.println("Original array:");
		 	for (int i = 0; i < arr.length; i++) {
		 		System.out.print(arr[i] +" ");
		 	}
		 
	        //Sort the array in ascending order using two for loops    
		 	for (int i = 0; i < arr.length; i++) {
		 		for (int j = i+1; j < arr.length; j++) {
		 			if (arr[j] < arr[i]) {
		 				temp = arr[i];
		 				arr[i] = arr[j];
		 				arr[j] = temp;
		 			}
		 		}
		 	}
	        //print sorted array    
		 	System.out.println("\n Sorted array:");
		 	for (int i = 0; i < arr.length; i++) {
		 		System.out.print(arr[i] +" ");
		 	}
		 
	    }    
	}    