package Gettingstarted;

public class Student extends Person{
	public String name;
	public Student() {
		System.out.println("Student created");
	}
	public Student(int i, String z, String n) {
		super(i, z);
		this.name = n;
		System.out.println("Student name = "+ n);
	}
	
	public static void main (String[] args) {
		Student x = new Student();
		Student y = new Student(15, "Hi", "Loan");
		Person aaa = new Person();
		System.out.println(aaa.z3);
		System.out.print(Person.add(2));
	}
	
}
