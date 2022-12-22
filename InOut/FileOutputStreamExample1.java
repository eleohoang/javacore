package InOut;
import java.io.*;

public class FileOutputStreamExample1 {
	public static void main(String[] args) {
		try { 
			// Store the filepath into the variable filepath of type String.
			String filepath = "C:\\Users\\minmi\\eclipse-workspace\\Javacore\\src\\InOut\\fileout.txt";

			// Create an object of FileOutputStream class to attach file with FileOutputStream and pass the filepath to its constructor.	 
			FileOutputStream fos = new FileOutputStream(filepath);    
//			fos.write(87);    
			
			String str = "Hello, my name is Loan, I am a Java dev";
			byte byt[] = str.getBytes();
			fos.write(byt);
			fos.close();

			System.out.println("Successfully written");    
		} catch(FileNotFoundException e){
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
