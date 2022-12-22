package JavaList;

import java.util.ArrayList;

public class RetriveStudentData {
	// Declare an instance method. 
	void fetchStudentData()
	{ 
		// Create an object of the Student1data class. 
		Studentdata stdata = new Studentdata(); 

		// Call addData() method using reference variable stdata. 
		ArrayList<Student1> listst = stdata.addData(); 

		// Now iterate and display all the Student1 data. 
		// enhance for loop - for each loop. 
		for(Student1 Student1:listst)
		{ 
			System.out.println("Name: " +Student1.name); 
			System.out.println("Physics Marks: " +Student1.phyMarks); 
			System.out.println("Maths Marks: " +Student1.mathsMarks); 

			System.out.println("Chemistry Marks: " +Student1.chemMarks); 
			System.out.println("Total Marks: " +Student1.total); 
			System.out.println("Percentage:" +Student1.per); 
		} 
	} 
}
