package javaArray;
import java.util.*;
public class JavaArrayOfArrayList {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("s");
		l1.add("hello");
		
		List<String> l2 = new ArrayList<>();
		l2.add("sd");
		l2.add("klkdeldlo");
		
		List<String>[] arrayOfList = new List[2];
		arrayOfList[0] = l1;
		arrayOfList[1] = l2;
		
		for (int i = 0; i < arrayOfList.length; i++) {
			List<String> l = arrayOfList[i];
			System.out.println(l);
		}
	}
}
