package InOut;
import java.io.*;

public class SequenceInputStreamEx1 {
	public static void main(String[] args) throws IOException
	{
		FileInputStream file1 = new FileInputStream("D:\\file1.txt");    
		FileInputStream file2 = new FileInputStream("D:\\file2.txt");  
		FileOutputStream fos = new FileOutputStream("D:\\fileout.txt");  

		SequenceInputStream file3 = new SequenceInputStream(file1,file2);    

		// Now create buffered input and output stream objects.
		BufferedInputStream bis = new BufferedInputStream(file3);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		// Reading and writing until end of buffers.   
		int i;    
		while((i = bis.read()) != -1){    
			bos.write((char)i);    
		}    
		bis.close();    
		bos.close();    
		fos.close();
		file1.close(); 
		file2.close();
		file3.close();
		System.out.println("Successfully written...");
	}
}
