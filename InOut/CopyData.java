package InOut;
import java.io.*;
public class CopyData {
	public static void main(String[] args)
	{
		try {  
			FileInputStream fis = new FileInputStream("C:\\Users\\minmi\\eclipse-workspace\\Javacore\\src\\InOut\\text.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\minmi\\eclipse-workspace\\Javacore\\src\\InOut\\fileout.txt");

			int value = 0;
			while ((value = fis.read()) != -1) {
				fos.write((char)value);
			}
			fos.close();
			fis.close();    
			System.out.println("Successfully written...");    
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
