package javaArray;

import java.util.Arrays;

public class CopyArray4 {
	// Main driver method
    public static void main(String[] args)
    {
        // Custom input array
        int a[] = { 1, 8, 3, 5, 9, 10 };
 
        // Creating an array b[] and
        int b[] = Arrays.copyOfRange(a, 2, 6);
 
        // Changing b[] to verify that
        // b[] is different from a[]
 
        // Iterating over array a[]
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
 
        // Iterating over array b[]
        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
