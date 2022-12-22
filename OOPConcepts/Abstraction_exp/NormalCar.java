package OOPConcepts.Abstraction_exp;

public class NormalCar implements Car {
	private String carType = "Manual";
	@Override
	public void turnOnCar() {
		System.out.println("turn on the Manual Car");
		
	}

	@Override
	public void turnOffCar() {
		System.out.println("turn off the Manual Car");
		
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return this.carType;
	}

}
