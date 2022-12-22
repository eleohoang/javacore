package OOPConcepts.Abstraction_exp;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new NormalCar();
		Car car2 = new AutomaticCar();
		
		car1.turnOnCar();
		car1.turnOffCar();
		System.out.println(car1.getCarType());
		
		car2.turnOnCar();
		car2.turnOffCar();
		System.out.println(car2.getCarType());
		
	}
}
