package stringmanipulation;

public class S_compareTo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hello ";
		String s4 = "llo";
		String s5= "Oh Hello";
		String s6 = "HELLO";
		
		System.out.println((s1.compareTo(s2)));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareToIgnoreCase(s6));
		
		System.out.println(s1.equals(s2));
		
		
		String s = "hello"; 
		String k = s.concat("world"); // concat() method adds string at the end. 
		 
		System.out.println(s); // It will print "hello" because string is immutable object
		System.out.println(k); 
	}
}
