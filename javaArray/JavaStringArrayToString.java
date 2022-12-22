package javaArray;

public class JavaStringArrayToString {
	public static void main(String[] args) {
		String[] strArr = new String[] {"1","2","3"};
		
		String str = toString(strArr);
		
		System.out.println("Java String array to String = "+str);
	}
	public static String toString(Object[] a) {
	    if (a == null)
	        return "null";

	    int iMax = a.length - 1;
	    if (iMax == -1)
	        return "[]";

	    StringBuilder b = new StringBuilder();
	    b.append('[');
	    for (int i = 0; ; i++) {
	        b.append(String.valueOf(a[i]));
	        if (i == iMax)
	            return b.append(']').toString();
	        b.append(", ");
	    }
	}
}
