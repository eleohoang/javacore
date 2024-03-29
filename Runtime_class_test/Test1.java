package Runtime_class_test;
//Java Program to Illustrate Runtime class
//Via getRuntime(), freeMemory() and
//totalMemory() Method
public class Test1 {
	// Main driver method
    public static void main(String[] args)
    {
 
        // Method 1: getRuntime()
        // Getting the current runtime associated
        // with this process
        Runtime run = Runtime.getRuntime();
        System.out.println("" + run);
        // Printing the current free memory for this runtime
        // using freeMemory() method
        System.out.println("" + run.freeMemory());
 
        // Method 2: freeMemory()
        // Printing the number of free bytes
        System.out.println(
            "" + Runtime.getRuntime().freeMemory());
 
        // Method 3: totalMemory()
        // Printing the number of total bytes
        System.out.println(
            "" + Runtime.getRuntime().totalMemory());
    }
}
