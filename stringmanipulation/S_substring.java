package stringmanipulation;

public class S_substring {
	public static void main(String[] args) {
		String s = new String("Hello, my name is ELEO");
		
		System.out.println(s.substring(s.length() - 4));
		System.out.println(s.substring(0, 5));
		System.out.println(s.substring(6, 18));
		System.out.println(s.substring(4));
		
		//check Palindrome
		System.out.println(checkPalindrome("xx"));
		System.out.println(checkPalindrome("abcba"));
		System.out.println(checkPalindrome("XYyx"));
		System.out.println(checkPalindrome("871232178"));
		System.out.println(checkPalindrome("CCCCC"));
		
		
	}
	
	private static boolean checkPalindrome(String str) {
		if (str == null)
			return false;
		if (str.length() <= 1) {
			return true;
		}
		String first = str.substring(0, 1);
		String last = str.substring(str.length() - 1);
		if (!first.equals(last))
			return false;
		else
			return checkPalindrome(str.substring(1, str.length() - 1));
	}
}
