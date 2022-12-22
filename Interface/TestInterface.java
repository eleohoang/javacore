package Interface;

public class TestInterface implements Interface1, Interface2 {

	@Override
	public void method2(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void log(String str) {
		System.out.println("I logging::"+str);
	}

}
