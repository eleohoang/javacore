package JavaList;

import java.util.ArrayList;

public class Studentdata {
	// Declare an ArrayList method of generic type Student1. 
	ArrayList<Student1> addData()  { 
		// Create two objects s1 and s2 of the Student1 class and initialize the value of variables using reference variable s1 and s2. 
		Student1 s1 = new Student1(); 
		s1.name = "Shubh"; 
		s1.phyMarks = 95; 
		s1.mathsMarks = 100; 
		s1.chemMarks = 90; 
		s1.total = 95 + 100 + 90; 
		s1.per = ((s1.total)*100)/300; 

		Student1 s2 = new Student1(); 
		s2.name = "Deep"; 
		s2.phyMarks = 80; 
		s2.mathsMarks = 85; 
		s2.chemMarks = 90; 
		s2.total = 80 + 85 + 90; 
		s2.per = ((s2.total)*100)/300; 

		// Create an ArrayList object of generic type Student1. 
		ArrayList<Student1> al = new ArrayList<Student1>(); 

		// Call add() method to store Student1 class objects in the array list using reference variable al. 
		al.add(s1); 
		al.add(s2); 
		return al; 
	} 
}
