package InOut;

import java.io.File;

public class TestFiles1 {
	public static void main(String[] args)
	{
		// Create an object of File class and pass the path of filename.
		File file = new File("D:\\myfile.txt");

		// Check for the existence of file.
		if (file.exists()) {
			System.out.println("File already exists.");
		} else {
			System.out.println("File does not exist.");
		}
	}
}
