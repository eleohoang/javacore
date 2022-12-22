package InOut;
import java.io.*;

public class inputStream_ex1 {
	public static void main(String[] args)  {
		try {
			FileInputStream fs = new FileInputStream("C:\\Users\\minmi\\eclipse-workspace\\Javacore\\src\\InOut\\text.txt");
//			int value = fs.read();
//			System.out.println("Reading a value in byte form: " +value);
//			System.out.println((char)value);
//			fs.close();
			
			int value = 0;    
			while ((value=fs.read()) != -1) {
				System.out.print((char)value);
			}    
			fs.close(); 
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
