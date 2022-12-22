package InOut;

import java.util.Scanner;

public class ScanData {
	public static void main(String[] args) 
	{
		// Create an object of Scanner class using read input.
		Scanner sc = new Scanner(System.in);	

		// Reading values.
		System.out.println("Enter an integer number: ");
		int integer = sc.nextInt();
		System.out.println("Enter a long integer number: ");
		long longInteger = sc.nextLong();

		System.out.println("Enter a floating point number: ");
		float floatNumber = sc.nextFloat();
		System.out.println("Enter a double data type number: ");
		double doubleNumber = sc.nextDouble();

		System.out.println("Enter a string: ");
//		String str = sc.nextLine();
		String str = sc.next();

		System.out.println("Entered data: ");
		System.out.println("Integer number: " +integer);
		System.out.println("Long integer number: " +longInteger);

		System.out.println("Floating point number: " +floatNumber);
		System.out.println("Double data type number: " +doubleNumber);
		System.out.println("String: " +str);
		sc.close();
	}
}
