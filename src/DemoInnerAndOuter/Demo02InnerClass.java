package DemoInnerAndOuter;

public class Demo02InnerClass {
	
	public static void main(String[] args) {
		Outer.Inner obj = new Outer().new Inner();
		obj.methodInner();
	}

}