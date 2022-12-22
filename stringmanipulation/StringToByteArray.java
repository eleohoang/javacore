package stringmanipulation;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringToByteArray {
	public static void main(String[] args) {
		String str = "PANKAJ";
		byte[] byteArr = str.getBytes();
		// print the byte[] elements
		System.out.println("String to byte array: " + Arrays.toString(byteArr));
	
	
		byte[] byteArray = { 'P', 'A', 'N', 'K', 'A', 'J' };
		byte[] byteArray1 = { 80, 65, 78, 75, 65, 74 };

		String st2r = new String(byteArray);
		String str1 = new String(byteArray1);

		System.out.println(st2r);
		System.out.println(str1);
	}
}
