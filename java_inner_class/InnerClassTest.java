package java_inner_class;

import java.util.Arrays;
//nested classes can be used in import for easy instantiation
import java_inner_class.OuterClass.InnerClass;
import java_inner_class.OuterClass.StaticNestedClass;

public class InnerClassTest {

  public static void main(String[] args) {
      OuterClass outer = new OuterClass(1,2,3,4);
      
      //static nested classes example
      StaticNestedClass staticNestedClass = new StaticNestedClass();
      StaticNestedClass staticNestedClass1 = new StaticNestedClass();
      
      System.out.println(staticNestedClass.getName()); //OuterClass
      staticNestedClass.d=10;
      System.out.println(staticNestedClass.d); // d = 10
      System.out.println(staticNestedClass1.d);// d =0
      
      //inner class example
      InnerClass innerClass = outer.new InnerClass();
      System.out.println(innerClass.getName());///OuterClass
      System.out.println(innerClass); //w=0 x=0 y=0 z=0
      innerClass.setValues();
      System.out.println(innerClass);//w=1 x=2 y=3 z=4
      
      //calling method using local inner class
      outer.print("Outer");/////Outer: OuterClass; Outer: 1 ; Outer:2 ; Outer:3; Outer: 4
      
      //calling method using anonymous inner class
      System.out.println(Arrays.toString(outer.getFilesInDir("src/java_inner_class", ".java")));
      
      System.out.println(Arrays.toString(outer.getFilesInDir("bin/java_inner_class", ".class")));
  }

}
