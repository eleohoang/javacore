package InOut;

import java.io.*;

public class FilterInputStreamEx {
	public static void main(String[ ] args) throws IOException
	{
		String filepath = "D:\\myfileout.txt";	
		FileInputStream  fis = new FileInputStream(filepath);  
		FilterInputStream filter = new BufferedInputStream(fis);  
//		int i = 0;  
//		while((i = filter.read()) != -1){  
//			System.out.print((char)i);  
//		}  
//		filter.close();  
		
		int availableBytes = filter.available();
		System.out.println("Initially, Available bytes: " +availableBytes);

		filter.read();
		filter.read();
		filter.read();

		int available = filter.available();
		System.out.println("Available bytes after reading three bytes: " +available);
		filter.close();  
	}
}
