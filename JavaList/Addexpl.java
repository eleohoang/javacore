package JavaList;
import java.util.*;

public class Addexpl {
 public static void main(String[] args) {
	 List list = new ArrayList();
	 list.add(1);
	 list.add(2);
	 list.add(3);
	 list.add("Hello");
	 
	 list.add(4, "DB");
	 list.add(5, 45);
	 
	 System.out.println("List added: "+list);
	 
 }
}
