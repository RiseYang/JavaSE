package DemoLambda;

public class Demo02InvokeCook {
	public static void main(String[] args) {
		//调用invokeCook方法
		invokeCook(new Cook() {
			
			@Override
			public void makeFood() {
				System.out.println("干饭了");
			}
		});
		//使用Lambda表达式，简化匿名内部类的书写
		invokeCook(() ->{
			System.out.println("鸡汤来喽，哈哈哈");
		});
	}
	
	public static void invokeCook(Cook cook) {
		cook.makeFood();
		
	}
}
