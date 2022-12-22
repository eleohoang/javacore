package JavaList;
import java.util.*;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));

		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(" "+s);
		}
		System.out.println();
		
		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
		Iterator<String> it2 = al2.iterator();
		while (it2.hasNext()) {
			System.out.print(" "+it2.next().toUpperCase());
		}
		System.out.println();

		ArrayList<Integer> alt = new ArrayList<Integer>(Arrays.asList(1,2,4,6,7));
		System.out.println(alt);
		Iterator<Integer> itr = alt.iterator();
		while (itr.hasNext()) {
			Integer t = itr.next();
			System.out.print(" "+t);

			if (t%2 != 0) {
				itr.remove();
			}
		}
		System.out.println();
		System.out.println(alt);
	}

}
