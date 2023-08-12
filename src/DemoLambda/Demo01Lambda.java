package DemoLambda;

/**
 * Lambda表达式的标准格式
 * 由三部分组成：
 * 		a.一些参数
 * 		b.一个箭头
 * 		c.一段代码
 * 格式：
 * 		(参数列表) -> {一些重写方法的代码}
 * 解释说明格式：
 * 		():接口中抽象方法的参数列表，没有参数，就空着，有参数就写出参数，多个参数使用逗号分割
 * 		->:传递的意思，把参数传递给方法体{}
 * 		{}:重写接口的抽象方法的方法体
 * 
 * @author Yang
 *
 */
public class Demo01Lambda { 
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "新线程创建了");
				
			}
		}).start();
		
		//使用Lambda表达式，实现多线程
		new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "新线程创建了");
		}).start(); 
	}

}
