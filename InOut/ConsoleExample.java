package InOut;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args)
	{
		// Create a reference to the console.	
		Console c = System.console();   

		// Checking the console is available or not. 
		if(c != null) {
			System.out.printf("Console is available.");	 
		} else{
			System.out.printf("Console is not available.");
			return; // A console is not available.
		}
		// Read a string and then display it on the console.  
		System.out.println("Enter your name: ");    

		String name = c.readLine(); // Reads a line of text from the console.
		System.out.println("Welcome to " +name);  
	}
}
