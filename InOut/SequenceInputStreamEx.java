package InOut;
import java.io.*;
public class SequenceInputStreamEx {
	public static void main(String[] args) throws IOException
	{
		FileInputStream file1 = new FileInputStream("D:\\file1.txt");    
		FileInputStream file2 = new FileInputStream("D:\\file2.txt");  

		// Concatenate file1 and file2 into file3.
		SequenceInputStream file3 = new SequenceInputStream(file1, file2);    
//		int i;    
//		while((i = file3.read()) != -1) {    
//			System.out.print((char)i);    
//		}    
//		file3.close();    
//		file2.close();    
//		file1.close();  
		

		BufferedInputStream bis = new BufferedInputStream(file3);
		BufferedOutputStream bos = new BufferedOutputStream(System.out);

		// Reading and writing until the end of buffers.   
		int i;    
		while((i = bis.read()) != -1) {    
			bos.write((char)i);   
		}    
		bis.close();    
		bos.close();    
		file1.close(); 
		file2.close();
	}
}
