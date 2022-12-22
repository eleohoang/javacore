package Gettingstarted;

public class Person {
	public int age;
	public String a;
	public Person() {
		System.out.println("Person created");
	}
	public Person (int i, String j) {
		this.age = i;
		System.out.println("Person age = " + i);
		System.out.println("Person a = " + j);
		
	}
	
	
	///Test static variable
	public static int z1 = 1;
	private static int z2 = 2;
	public static final int z3 = 3;
	public static int getZ1() {
		return z1;
	}
	public static void setZ1(int z1) {
		Person.z1 = z1;
	}
	public static int getZ2() {
		return z2;
	}
	public static void setZ2(int z2) {
		Person.z2 = z2;
	}
	public static int getZ3() {
		return z3;
	}
//	public static void setZ3(int z3) {
//		Person.z3 = z3;
//	}
	
	public static int a1 = 3;
	public int a2 = 3;
	//static method example
    public static void setCount() {
    	int t = add(3);
    	if (a1 == t) {
    		
    	}
//    	int t1 = add1(3);
    }
    
    //static util method
    public static int add(int i){
        int sum=0;
        for(int x = 0; x <= i; x++) 
        	sum+=x;
        return sum;
    }
    public int add1(int i){
        int sum=0;
        for(int x = 0; x <= i; x++) 
        	sum+=x;
        return sum;
    }
	
    static {
     a1 = 34;
    }
    
}
