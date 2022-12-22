package java_inner_class;

class Main_Class {
	private String s_main_class ="class";
	
	public void print() {
		String s_print_method = "method";
		
		class Logger {
			String name = s_main_class;
			String name1 = s_print_method;
			public void foo() {
				String name2 = s_print_method;
				String name3 = s_main_class;
				// Below code will throw compile time error:
				// Local variable s_print_method defined in an enclosing scope must be final or effectively final 
//				 s_print_method= ":";
			}
		}
		Logger logger = new Logger();
	}
}

//public class Main_Class {
//
//	static {
//		class Foo {
//			
//		}
//		Foo f = new Foo();
//	}
//	
//	public void bar() {
//		if(1 < 2) {
//			class Test {
//				
//			}
//			Test t1 = new Test();
//		}
//		// Below will throw error because of the scope of the class
////		Test t = new Test();
////		Foo f = new Foo();
//	}
//}
