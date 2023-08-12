package singleton;


//懒汉式
public class Lsingleton {
	//私有构造
	private Lsingleton() {}
	//静态初始化
	private static Lsingleton singleton = null;
	
	public static Lsingleton getIntance() {
		if(singleton==null) {
			singleton = new Lsingleton();
		}
		return singleton;
	}

}
