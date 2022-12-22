package StringPoolTst;

public class StringPool {
	public static void main(String[] args) {
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");
		String s4 = new String("Cat").intern();
		
		
		System.out.println("s1 == s2 is " + (s1==s2));
		System.out.println("s1 == s3 is " + (s1==s3));
		System.out.println("s1 == s4 is " + (s1==s4));
		
		System.out.println("s1 equals s3 is " + (s1.equals(s3)));
				
		String str = "knowledge";
		System.out.println(str);
		String s = str;  
		System.out.println(s);
		str = str.concat(" base");
		System.out.println(str);
		System.out.println(s);
		
		
		
		String saa="Sachin";
		saa.concat(" Tendulkar");//concat() method appends the string at the end
		System.out.println(saa);//will print Sachin because strings are immutable objects
		saa=saa.concat(" Tendulkar");
		System.out.println(saa);
	}
}
