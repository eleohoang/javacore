package VariableArguments_Varargs;

public class Test2 {
	public static void fun2(String s, int...a) {
		System.out.println("String: " + s);
		System.out.println("Number of arguments: "+ a.length);
		
		for (int i : a) {
			System.out.print(" " +i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		fun2("GeeksforGeeks", 100, 200);
        fun2("CSPortal", 1, 2, 3, 4, 5);
        fun2("forGeeks");
	}
}
