package InOut;
import java.io.*;
import java.util.*;

public class SequenceInputStreamEx2 {
	public static void main(String[] args) throws IOException
	{
		FileInputStream file1 = new FileInputStream("D:\\file1.txt");    
		FileInputStream file2 = new FileInputStream("D:\\file2.txt");  
		FileInputStream file3 = new FileInputStream("D:\\file3.txt");    
		FileInputStream file4 = new FileInputStream("D:\\file4.txt");  

		// Creating an object of Vector class for all the streams.    
		Vector v = new Vector();    
		v.add(file1);    
		v.add(file2);    
		v.add(file3);    
		v.add(file4);    

//		 Creating enumeration object by calling the elements method of vector class.   
		Enumeration en = v.elements();      

		// Passing the enumeration object to the constructor of SequenceInputStream class.     
		SequenceInputStream sis = new SequenceInputStream(en);    

		int i;    
		while((i = sis.read()) != -1){    
			System.out.println((char)i);   
		} 
		sis.close();   
		file1.close(); 
		file2.close();
		file3.close();
		file4.close();
	}
}
