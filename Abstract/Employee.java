package Abstract;

public class Employee extends Person{
	private int empId;
	
	public Employee(String name, String gender, int empId) {
		super(name, gender);
		this.empId = empId;
	}
	public void work() {
		if (empId == 0) {
			System.out.println("Not working");
		} else {
			System.out.println("Working");
		}
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Sara", "female", 0);
		Employee e2 = new Employee("Harry", "male", 30);
		e1.work();
		e2.work();
		e1.changename("Hara");
		System.out.println(e1.toString());
	}
	
}
