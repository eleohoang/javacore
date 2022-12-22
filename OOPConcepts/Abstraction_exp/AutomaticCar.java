package OOPConcepts.Abstraction_exp;

public class AutomaticCar implements Car {
	private String carType = "AutomaticCar";
	@Override
	public void turnOnCar() {
		System.out.println("turn on the Automatic Car");
		
	}

	@Override
	public void turnOffCar() {
		System.out.println("turn off the Automatic Car");
		
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return this.carType;
	}
}
