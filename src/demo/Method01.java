package demo;
/**
 * 
 * @ClassName: Method01 
 * @Description: TODO 方法调用
 * @author: yang
 * @date: 2023年8月12日 上午11:47:55
 */
public class Method01 {
	public static void main(String[] args) {
		//单独调用
		methods(10,15);
		
		//打印调用
		System.out.println(methods(20,10));
		
		//赋值调用
	    int num = methods(15,20);
	    num += 10;
	    System.out.println("num:"+num);
	}
	public static int methods(int a ,int b) {
		System.out.println("方法调用中");
		int result = a + b;
		return result;
	    
	}
}
