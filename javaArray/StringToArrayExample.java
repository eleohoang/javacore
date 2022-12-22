package javaArray;
import java.util.*;
import java.util.regex.Pattern;

public class StringToArrayExample {
	    public static void main(String[] args) {
	        String line = "My name is Pankaj";
	        //using String split function
	        String[] words = line.split("\\s+");
	        System.out.println(Arrays.toString(words));
	        //using java.util.regex Pattern
	        Pattern pt = Pattern.compile(" ");
	        words = pt.split(line);
	        System.out.println(Arrays.toString(words));
	    }
}
