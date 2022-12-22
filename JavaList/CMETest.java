package JavaList;
import java.util.*;

public class CMETest {
	public static void main(String[] args) { 
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for(int i = 0; i < 10; i++)  { 
			al.add(i); 
		} 
		
		List<Integer> synlist = Collections.synchronizedList(al); 
		synchronized(synlist) { 
			Iterator<Integer> itr = al.iterator(); 
			while(itr.hasNext()) { 
				al.add(20); // It will throw ConcurrentModificationException because we cannot modify list during Iteration. 
				System.out.println(itr.next()); 
			} 
		} 
	}
}
