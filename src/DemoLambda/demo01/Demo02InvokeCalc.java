package DemoLambda.demo01;

//Lambda表达式有参数有返回值的练习
public class Demo02InvokeCalc {
	public static void main(String[] args) {
		invokeCalc(10, 20, new Calculator() {
			@Override
			public int calc(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		});
		//使用Lambda表达式
		invokeCalc(10, 20,(int a , int b) -> {
			return a + b;
		});
		
		
	}
	private static void invokeCalc(int a, int b, Calculator calculator) {
		int result = calculator.calc(a, b);
		System.out.println("结果是：" + result);
	}
}
