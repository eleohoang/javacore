package InOut;
import java.io.*;
	
public class FileOutputStreamExample2 {
	public static void main(String[] args)
	{
		try { 
			String filepath = "C:\\Users\\minmi\\eclipse-workspace\\Javacore\\src\\InOut\\text.txt";
			DataInputStream ds = new DataInputStream(System.in);
			int value = 0;
			
			System.out.println("Add @ to stop writing");    
			
			FileOutputStream fos = new FileOutputStream(filepath);
			while ((char)(value = ds.read()) != '@') {
				fos.write((char)value);
			}
			fos.close();
			System.out.println("Successfully written...");    
		}catch(Exception e){
			System.out.println(e);  
		}    
	}
}
