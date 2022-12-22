package JavaList;

import java.util.ArrayList;

public class AddingData_Student {
	ArrayList<Student> studentData() {
		Student s1 = new Student("Loan", 123, 3);
		Student s2 = new Student("Hun", 1523, 8);
		Student s3 = new Student("Du", 1563, 6);
	
		ArrayList<Student> ars = new ArrayList<Student>();
		ars.add(s1);
		ars.add(s2);
		ars.add(s3);
		
		return ars;
		
	}
}
