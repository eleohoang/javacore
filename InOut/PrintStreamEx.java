package InOut;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamEx {
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("D:\\fileout.txt");  
		PrintStream ps = new PrintStream(fos);

		// Printing char value.
		ps.println('A');

		// Printing int value.    
		ps.println(2000); 

		// Printing string value.   
		ps.println("I love Java Programming");  

		// Printing current date.
		ps.println(new Date());

		ps.close();  
		fos.close(); 
		
		System.out.println("Displaying some numeric values " + "in different formats.\n");
		
		System.out.printf("Displaying integer values in various formats: ");
		System.out.printf("%d %(d %+d %05d\n", 5, -5, 5, 5);

		System.out.println();
					
		System.out.printf("Default floating-point format: %f\n", 9999999.99);
		System.out.printf("Floating-point with commas: %,f\n", 9999999.99);
					
		System.out.printf("Negative floating-point default: %,f\n", -9999999.99);
		System.out.printf("Negative floating-point option: %,(f\n", -9999999.99);
	}
}
