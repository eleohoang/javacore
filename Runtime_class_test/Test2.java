package Runtime_class_test;

public class Test2 {
	// Main driver method
    public static void main(String[] args)
    {
        // Try block to check for exceptions
        try {
           
            // Creating a process and execute google-chrome
            Process process = Runtime.getRuntime().exec("cmd");
            System.out.println(
                "Command Prompt successfully started");
        }
 
        // Catch block to handle the exceptions
        catch (Exception e) {
            // Display the exception on the console
            e.printStackTrace();
        }
    }
}
