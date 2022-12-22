package Gettingstarted;

public class Data {
	private String name;
	private int id;

	//no-args constructor
	public Data() {
		this.name = "Default Name";
	}
	//one parameter constructor
	public Data(String n) {
		this.name = n;
	}
	//two parameter constructor
	public Data(String n, int i) {
		this.name = n;
		this.id = i;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ID="+id+", Name="+name;
	}
	public static void main(String[] args) {
		Data d = new Data();
		System.out.println(d);
		
		d = new Data("Java");
		System.out.println(d);
		
		d = new Data("Pankaj", 25);
		System.out.println(d);
		
	}
}
