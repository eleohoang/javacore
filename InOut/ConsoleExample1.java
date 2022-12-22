package InOut;

import java.io.Console;

public class ConsoleExample1 {
	public static void main(String[] args) {
		// Create a reference to the console.	
		Console c = System.console();   

		// Checking the console is available or not. 
		if(c != null) {
			System.out.printf("Console is available.");	 
		} else{
			System.out.printf("Console is not available.%n");
			return;
		}
		System.out.println("Enter your password: ");    
		char[ ] ch = c.readPassword(); // Reading password.

		String pass = String.valueOf(ch);// Converting an array of char into string    
		System.out.println("Password is: "+pass); 
}
}
