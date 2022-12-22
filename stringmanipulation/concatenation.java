package stringmanipulation;

public class concatenation {
	public static void main (String[] args) {
		String s1 = "Dhan"; 
		String s2 = "bad";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		
		String s4 = "Hello";
		s4.concat("Java"); 
		System.out.println(s4); // Hello //immutable
		 
		 
		 String s5 = new String("Java");
		 s5.concat(" Core"); 
		 s5 = s5.concat(" Programming"); 
		 System.out.println(s5);
	}
}
