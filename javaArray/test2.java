package javaArray;

public class test2 {
	public static void main(String[] args) 
	{
		int[][] x = new int[2][3];
		x[0][0] = 1;
		x[0][1] = 1;
		x[0][2] = 1;
		x[1][0] = 1;
		x[1][1] = 1;
		x[1][2] = 1;
		
		for (int i = 0; i< x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(" "+ x[i][j]);
			}
			System.out.println("");
		}
		
		
	}
}
