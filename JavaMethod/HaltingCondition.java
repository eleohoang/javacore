package JavaMethod;

public class HaltingCondition {
	 public static void main(String[] args) {
		    int result = sum(5, 10);
		    System.out.println(result);
		  }
		  public static int sum(int start, int end) {
		    if (end > start) {
		      return end + sum(start, end - 1);
		    } else {
		      return end;
		    }
		  }
		  
//		  10+sum(5,9)
//		  10+9+sum(5,8)
//		  10+9+8+sum(5,7)
//		  10+9+8+7+sum(5,6)
//		  10+9+8+7+6+sum(5,5)
//		  10+9+8+7+6+5
		  
}
