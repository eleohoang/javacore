package JavaCollection;
import java.util.*;

public class LinkedListEx2 {
	public static void main(String[] args) {
		LinkedList<Character> ll = new LinkedList<Character>();
		ll.add('a');
		ll.add('b');
		ll.add('c');
		ll.add('d');
		
		Iterator<Character> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
