package javaArray;

public class test1 {
	private final boolean[] bArr = new boolean[3]; // An instance variable.

	public test1()  {
		// Print the initial value for elements of the instance variable bArr.
		for (int i = 0; i < bArr.length; i++)  {
			System.out.println("bArr[" + i + "]:" + bArr[i]);
		}
	}

	public static void main(String[] args)  {
		System.out.println("Array initialization of int type:");
		int[ ] intArr = new int[3]; // A local array variable.

		for (int i = 0; i < intArr.length; i++) {
			System.out.println("intArr[" + i + "]:" + intArr[i]);
		}
		
		System.out.println("\nArray initialization of boolean type:");
		// Initial values for bArr elements are displayed inside the constructor.
		new test1();

		System.out.println("\nArray initialization of reference type:");
		String[ ] name = new String[3]; // A local array variable
		for (int i = 0; i < name.length; i++) {
			System.out.println("name[" + i + "]:" + name[i]);
		}
	}
}
