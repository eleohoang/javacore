package Abstract;

public abstract class Person {
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	public abstract void work();
	
	public String toString() {
		return "Name = " + this.name +"::Gender =" +this.gender;
	}
	public void changename(String name) {
		this.name = name;
	}
}
