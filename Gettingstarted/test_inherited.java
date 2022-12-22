package Gettingstarted;

public class test_inherited {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		Animal an = c;
		
		boolean flag;
		flag = c instanceof Cat;
		System.out.println(flag);
		flag = c instanceof Animal;
		System.out.println(flag);
		flag = an instanceof Cat;
		System.out.println(flag);
		flag = an instanceof Dog;
		System.out.println(flag);
		
	}
}
