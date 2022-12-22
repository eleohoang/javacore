package Interface;

public class TestShape {
	public static void main(String [] args) {
//		Circle cr = new Circle(1.54);
//		cr.draw();
//		System.out.println(cr.getArea());
//		
//		Rectangle rt = new Rectangle(3.5, 2);
//		rt.draw();
//		System.out.println(rt.getArea());
		
		//programming for interfaces not implementation
		Shape shape = new Circle(10);
		
		shape.draw();
		System.out.println("Area="+shape.getArea());
//		shape.getradius();
		Circle c = (Circle) shape;
		c.getradius();
		
		//switching from one implementation to another easily
		shape=new Rectangle(10,10);
		shape.draw();
		System.out.println("Area="+shape.getArea());
	}
}
