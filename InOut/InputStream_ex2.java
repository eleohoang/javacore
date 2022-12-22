package InOut;
import java.io.*;

public class InputStream_ex2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\minmi\\eclipse-workspace\\Javacore\\src\\InOut\\text.txt"); 
		int size = fis.available();

		System.out.println("Total number of available bytes: " +size);
		int n = size/10; // n = 2.

		for (int i = 0; i < n; i++) {
			System.out.print((char) fis.read()); // Reading the first two characters 
		}
		System.out.println("\nStill Available bytes: " + fis.available());
		byte bytearray[ ] = new byte[2];

		if (fis.read(bytearray) != n) {
			System.out.println("Could not get" + n + "bytes");
		}
		String str = new String(bytearray, 0, n);
		System.out.println(str);

		System.out.println("\nStill available bytes: " +fis.available());
		System.out.println("\nSkipping half of remaining bytes using skip() method");
		fis.skip(size/2);

		System.out.println("Still Available bytes: " + fis.available());

		System.out.println("Reading " + n/2 + " from the end of array");
		if (fis.read(bytearray, n/2, n/2) != n/2) {
			System.out.println("couldn't read " + n/2 + " bytes.");
		}
		String str2 = new String(bytearray, 0, bytearray.length);
		System.out.println(str2);

		System.out.println("\nStill Available bytes: " + fis.available());
		fis.close();
	}
}
