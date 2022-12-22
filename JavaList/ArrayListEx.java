package JavaList;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(2);
		al.add("d");
		al.add("4");
		
		System.out.println(al);
		System.out.println(al.hashCode());
		
		
		al.add("3");
		al.add("r");
		
		
		System.out.println(al);
		System.out.println(al.hashCode());
		
		ArrayList al1 = new ArrayList(al);
		   
		System.out.println("Arlist al1 = : "+al1);
		
		ArrayList<String> artl;
		artl = new ArrayList();
		
		ArrayList<String> arls = new ArrayList<String>(Arrays.asList("A", "AB", "C"));
		System.out.println("Arlist arls = : "+arls);
	}
}
