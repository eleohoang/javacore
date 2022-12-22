package InOut;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx1 {
	public static void main(String[] args)
	{
		try
		{
			// example 1
//			// Create a FileOutputStream object to connect myfile to FileOutputStream.	 
//			FileOutputStream fos = new FileOutputStream("D:\\myfileout.txt");
//
//			// Create a BufferedOutputStream object to wrap FileOutputStream in BufferedOutputStream.
//			BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//			String s="Hello Loann";    
//			byte b[]=s.getBytes(); // Converting String into array bytes.
//			bos.write(b); // Write data to the output stream.
//			bos.close(); // Closing output stream.
//
//			System.out.println("Successfully written...");   
		
			// example 2
			String data = "Hello Java, this is the first time I have known you. I am really excited";	
			// Create a FileOutputStream object to connect myfile to FileOutputStream.	 
			FileOutputStream fos = new FileOutputStream("D:\\myfileout.txt");

			// Create a BufferedOutputStream object to wrap FileOutputStream in BufferedOutputStream.
			BufferedOutputStream bos = new BufferedOutputStream(fos, 1);

			bos.write(data.getBytes()); // Writing data to output stream.
			bos.flush(); // Flushing all data from internal buffer to destination file.
			bos.close();
			System.out.println("Successfully written..."); 
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
