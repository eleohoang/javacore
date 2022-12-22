package JavaList;
import java.util.*;

public class VectorTest3 {
	public static void main(String[] args) 
	{ 
		Vector v = new Vector(); 
		v.add("Bat"); 
		v.add("Ball"); 
		v.add("Wicket"); 
		v.add("Stump"); 
		v.add("Pitch"); 
		v.add(25); 
		v.add(null); 

		System.out.println("Elements: " +v); 
		Object getElement = v.get(5); // Return type of get method is an Object.  
		System.out.println("Element at position 5: " +getElement); 

		Integer hashcode = v.hashCode(); // Return type is an Integer. 
		System.out.println("HashCode value: " +hashcode); 

		Integer indexOfElement = v.indexOf(null); 
		System.out.println("Index of element null: " +indexOfElement); 

		v.insertElementAt("Gloves", 6); 
		v.removeElement(25); 
		System.out.println("Elements after removing 25: " +v); 
		v.remove(6); 
		System.out.println("Elements after removing: " +v); 
	} 
}
