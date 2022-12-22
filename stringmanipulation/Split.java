package stringmanipulation;

public class Split {
    public static void main(String args[])
    {
    	// 1 .Public String [] split ( String regex, int limit)
        // Custom input string
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("s", 3);
  
        for (String a : arrOfStr)
            System.out.println(a);
        
        
        String str1 = "GeeksforGeeks:A Computer Science Portal";
        String[] arrOfStr1 = str1.split(":");
  
        for (String a1 : arrOfStr1)
            System.out.println(a1);
        
        
        String str2 = "GeeksforGeeksforStudents";
        String[] arrOfStr2 = str2.split("for");
  
        for (String a : arrOfStr2)
            System.out.println(a);
        
        
        String str3 = "Geeks for Geeks";
        String[] arrOfStr3 = str3.split(" ");
  
        for (String a : arrOfStr3)
            System.out.println(a);
        
        
        String str4 = "Geeks.for.Geeks";
        String[] arrOfStr4 = str4.split("[.]");   // str.split("."); will give no output...
  
        for (String a : arrOfStr4)
            System.out.println(a);
        
        
        String str5 = "Geekssss";
        String[] arrOfStr5 = str5.split("s");
  
        for (String a : arrOfStr5)
            System.out.println(a);
        
        String str6 = "word1, word2 word3@word4?word5.word6";
        String[] arrOfStr6 = str6.split("[, ?.@]+");
  
        for (String a : arrOfStr6)
            System.out.println(a);
    }
	
}
