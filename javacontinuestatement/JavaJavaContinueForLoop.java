package javacontinuestatement;

public class JavaJavaContinueForLoop {
	public static void main (String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		for (int i:arr) {
			if (i%2 !=0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
