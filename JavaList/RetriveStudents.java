package JavaList;

import java.util.ArrayList;

public class RetriveStudents {
	public static void main(String[] args) { 
		AddingData_Student ads = new AddingData_Student();
		
		ArrayList<Student> stw = ads.studentData();
		
		for (Student s:stw) {
			System.out.println();
			System.out.println("Name: " +s.name);
			System.out.println("id: " +s.id);
			System.out.println("rolnb: " +s.rollNo);
		}
	} 
}
