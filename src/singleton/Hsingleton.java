package singleton;

//饿汉式
public class Hsingleton {
	
	private Hsingleton() {}
	
	private static Hsingleton hsingleton = new Hsingleton();
	
	public static Hsingleton getIntance() {
		return hsingleton;
	}	
}
