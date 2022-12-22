package Interface;

public class Circle implements Shape{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Draw a Circle");
	}
	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public double getradius() {
		return radius;
	}
}
