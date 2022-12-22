package InOut;

import java.io.*;

public class BufferedInputStreamEx1 {
	public static void main(String[] args)
	{
		try {
			// Create a FileInputStream object to attach myfile to FileInputStream.	 
			FileInputStream fis = new FileInputStream("C:\\Users\\minmi\\eclipse-workspace\\Javacore\\src\\InOut\\text.txt");

			// Create a BufferedInputStream object to wrap FileInputStream in BufferedInputStream.
			BufferedInputStream bis = new BufferedInputStream(fis);

			//ex1
//			int i = 0;
//			while ((i = bis.read()) != -1) {
//				char ch = (char)i;
//				System.out.print(ch);
//			}     
//			bis.close();
//			fis.close();  

			// ex2
			// Call available() method to determine the available number of bytes in bufferedInputStream.
//			System.out.println("Available bytes at the beginning: " + bis.available());  
//
//			// Reads bytes from the file
//			bis.read();
//			bis.read();
//			bis.read();
//
//			// Get the available number of bytes at the end.
//			System.out.println("Available bytes at the end: " + bis.available());
			
			
			//ex3
			// Skips 5 bytes from the buffered input stream.
			bis.skip(5);
			System.out.println("Input stream after skipping first 5 bytes:");

			// Reads all available bytes from buffered input stream after skipping.
			int i = 0;
			while ((i = bis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();  
			bis.close();  
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
