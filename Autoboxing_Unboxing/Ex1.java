package Autoboxing_Unboxing;

public class Ex1 {
	// Main driver method
    public static void main(String[] args)
    {
 
        // Creating an Integer Object
        // with custom value say it be 10
        Integer i = new Integer(10);
 
        // Unboxing the Object
        int i1 = i;
 
        // Printstatements
        System.out.println("Value of i:" + i);
        System.out.println("Value of i1: " + i1);
 
        // Autoboxing of character
        Character gfg = 'a';
 
        // Auto-unboxing of Character
        char ch = gfg;
 
        // Print statements
        System.out.println("Value of ch: " + ch);
        System.out.println(" Value of gfg: " + gfg);
//        
//     // Creating an Integer Object
//        // with custom value say it be 10
//      
// 
//        // Unboxing the Object
//        int i2 = 10;
//        Integer i22 = i2;
// 
//        // Printstatements
//        System.out.println("Value of i2:" + i2);
//        System.out.println("Value of i22: " + i22);
    }
}
