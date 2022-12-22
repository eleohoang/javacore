package JavaList;
import java.util.*;

public class addAllEx {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("ADV");
		l1.add("HE");
		l1.add("gg");
		System.out.println("List 1: "+l1);
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Java");
		l2.add("Core");
		l2.add("Example");
		
		System.out.println("List 2: "+l2);
		
		l1.addAll(l2);
		System.out.println("List 1 after added list 2: "+l1);
		
		l2.addAll(2, l1);
		System.out.println("List 2 after added list 2 at 2 index: "+l2);
		
		System.out.println("Index of Java: "+l2.indexOf("Java")); //index chua phan tu dau tien tim duoc
		System.out.println("Get value of index0: "+l2.get(0));
	}
}
