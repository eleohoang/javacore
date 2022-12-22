package InOut;
import java.io.*;

public class FilterOutputStreamEx {
	public static void main(String[ ] args) throws IOException
	{
		String filepath = "D:\\testout.txt";	
		// Create a FileOutputStream object to connect text file with output stream. 
		FileOutputStream fos = new FileOutputStream(filepath);  

		// Create a FilterOutputStream object to connect fos with filter. 
		FilterOutputStream filter = new FilterOutputStream(fos);  

		String s="Welcome to Java world";      
		byte b[ ]=s.getBytes(); // Converting bytes into strings.    
		filter.write(b);    
		filter.flush();  
		filter.close();  
		fos.close();  
		System.out.println("Successfully written...");  
	}
}
